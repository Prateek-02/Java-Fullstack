# Demat Account Service

A Spring Boot microservice that provides **Demat Account data** via REST API. It uses in-memory static data (no database), and registers with Eureka Service Discovery.

---

## Tech Stack

| Technology | Version |
|---|---|
| Spring Boot | 3.2.5 |
| Java | 17 |
| Spring Cloud Eureka Client | 2023.0.1 |
| Spring Boot Actuator | - |
| Spring Boot DevTools | - |

---

## Project Structure

```
demataccountservice/
├── src/main/java/com/demoorg/demataccountservice/
│   ├── DemataccountserviceApplication.java     ← Entry point
│   └── controller/
│       └── DematAccountController.java         ← REST API endpoints
├── src/main/resources/
│   ├── application.properties                  ← Port + Eureka config
│   └── application.yml                         ← Eureka config (override risk)
└── pom.xml                                     ← Dependencies
```

---

## File-by-File Working

---

### 1. `DemataccountserviceApplication.java` — Entry Point

```java
@SpringBootApplication
@EnableDiscoveryClient
public class DemataccountserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemataccountserviceApplication.class, args);
        System.out.println("Demataccount service server started...");
    }
}
```

**What it does:**
- `@SpringBootApplication` — Enables auto-configuration and component scanning
- `@EnableDiscoveryClient` — Registers this microservice with Eureka Server so other services and the Gateway can discover it
- `SpringApplication.run(...)` — Starts the embedded Tomcat server on port **7072**
- On startup, it sends a registration request to Eureka Server at `http://localhost:8761/eureka`

---

### 2. `DematAccountController.java` — REST API Layer

```java
@RestController
public class DematAccountController {

    List<String> allDematAccounts = Stream.of("Demat1", "Demat2", "Demat3")
                                          .collect(Collectors.toList());

    @GetMapping("/demataccounts")
    public List<String> getAllDematAccounts() {
        return allDematAccounts;
    }
}
```

**What it does:**
- `@RestController` — Marks this as a REST controller; methods return JSON responses automatically
- `allDematAccounts` — A static in-memory list of demat account names initialized when the class is loaded. No database involved.
- `@GetMapping("/demataccounts")` — Maps HTTP GET requests to `/demataccounts` endpoint
- Returns the list as a JSON array on every request

---

### 3. `application.properties` — Configuration

```properties
spring.application.name=demataccountservice
server.port=7072
eureka.instance.prefer-ip-address=true
```

**What each property does:**

| Property | Purpose |
|---|---|
| `spring.application.name` | Name used to register in Eureka — Gateway routes using this name |
| `server.port` | Starts Tomcat on port 7072 |
| `eureka.instance.prefer-ip-address` | Registers using IP address instead of hostname for reliable discovery |

> **Important:** This service also has an `application.yml` file. Since `application.yml` has higher priority than `application.properties`, ensure the port in `application.yml` also says `7072` to avoid conflicts.

---

### 4. `pom.xml` — Dependencies

| Dependency | Purpose |
|---|---|
| `spring-boot-starter-web` | Enables REST API (embedded Tomcat) |
| `spring-cloud-starter-netflix-eureka-client` | Registers service with Eureka |
| `spring-boot-starter-actuator` | Provides health check endpoints |
| `spring-boot-devtools` | Auto-restart on code changes during development |

---

## API Endpoints

### Base URL: `http://localhost:7072`

---

### 1. GET All Demat Accounts

| Field | Value |
|---|---|
| Method | `GET` |
| URL | `http://localhost:7072/demataccounts` |
| Description | Returns list of all demat accounts (static in-memory data) |

**Flow:**
```
GET /demataccounts
    → DematAccountController.getAllDematAccounts()
    → Returns in-memory List<String>
    → Jackson converts List → JSON array
    → Returns JSON response
```

**Sample Response:**
```json
["Demat1", "Demat2", "Demat3"]
```

---

## Complete End-to-End Flow

```
Client (Postman / Browser)
         |
         |  HTTP Request
         ↓
  API Gateway :8989
         |
         |  Routes /demataccounts/** → lb://demataccountservice
         ↓
  Eureka Server :8761
         |
         |  Resolves demataccountservice → localhost:7072
         ↓
  DematAccountController
         |
         |  Returns in-memory List<String>
         ↓
  JSON Response → Client
```

---

## Configuration

### application.properties
```properties
spring.application.name=demataccountservice
server.port=7072
eureka.instance.prefer-ip-address=true
```

### application.yml
```yaml
eureka:
  client:
    register-with-eureka: true
    fetchRegistry: true
    serviceUrl:
      defaultZone: http://localhost:8761/eureka
  instance:
    hostname: localhost
server:
  port: 7072
spring:
  application:
    name: demataccountservice
```

---

## How to Run

**Prerequisites:** Java 17+, Eureka Server running on port 8761

```bash
mvn spring-boot:run
```

Console output on success:
```
Demataccount service server started...
```

Service URL: `http://localhost:7072`

Via Gateway: `http://localhost:8989/demataccounts`

---

## Important Notes

- No database operations — data is hardcoded in memory
- If you need real data, replace the static list with a DB-backed repository
- Both `application.properties` and `application.yml` exist — `application.yml` has higher priority, so always keep ports consistent in both files
