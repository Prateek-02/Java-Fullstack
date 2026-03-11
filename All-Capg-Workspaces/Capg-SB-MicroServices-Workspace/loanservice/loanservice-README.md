# Loan Service

A Spring Boot microservice that provides **Loan data** via REST API. It uses in-memory static data (no database), and registers with Eureka Service Discovery.

---

## Tech Stack

| Technology | Version |
|---|---|
| Spring Boot | 2.7.0 |
| Java | 1.8 (Java 8) |
| Spring Cloud Eureka Client | 2021.0.3 |
| Spring Boot Actuator | - |
| Spring Boot DevTools | - |

---

## Project Structure

```
loanservice/
├── src/main/java/com/demoorg/loanservice/
│   ├── LoanserviceApplication.java     ← Entry point
│   └── controller/
│       └── LoanController.java         ← REST API endpoints
├── src/main/resources/
│   └── application.properties          ← Port + Eureka config
└── pom.xml                             ← Dependencies
```

---

## File-by-File Working

---

### 1. `LoanserviceApplication.java` — Entry Point

```java
@SpringBootApplication
@EnableEurekaClient
public class LoanserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoanserviceApplication.class, args);
        System.out.println("loan service server started");
    }
}
```

**What it does:**
- `@SpringBootApplication` — Enables auto-configuration and component scanning
- `@EnableEurekaClient` — Explicitly registers this service with Eureka Server
  - Note: This annotation is **required in Spring Boot 2.x**, optional in 3.x, and removed in 4.x
  - Since this service uses Boot **2.7.0**, the annotation is needed
- `SpringApplication.run(...)` — Starts the embedded Tomcat server on port **7071**
- On startup, it sends a registration request to Eureka at `http://localhost:8761/eureka`

---

### 2. `LoanController.java` — REST API Layer

```java
@RestController
public class LoanController {

    List<String> allLoans = Stream.of("Loan1", "Loan2", "Loan3")
                                  .collect(Collectors.toList());

    @GetMapping("/loans")
    public List<String> getAllLoans() {
        return allLoans;
    }
}
```

**What it does:**
- `@RestController` — Marks this as a REST controller; methods return JSON responses automatically
- `allLoans` — A static in-memory list of loan names initialized when the class loads. No database involved.
- `Stream.of(...).collect(Collectors.toList())` — Creates a mutable ArrayList from the given values
- `@GetMapping("/loans")` — Maps HTTP GET requests to `/loans` endpoint
- Returns the loan list as a JSON array on every request

---

### 3. `application.properties` — Configuration

```properties
spring.application.name=loanservice
server.port=7071
eureka.instance.prefer-ip-address=true
```

**What each property does:**

| Property | Purpose |
|---|---|
| `spring.application.name` | Name used to register in Eureka — Gateway routes using this name (`lb://loanservice`) |
| `server.port` | Starts Tomcat on port 7071 |
| `eureka.instance.prefer-ip-address` | Registers using IP address instead of hostname for reliable discovery |

**Default values auto-applied (not written but active):**

| Property | Default Value |
|---|---|
| `eureka.client.register-with-eureka` | `true` |
| `eureka.client.fetch-registry` | `true` |
| `eureka.client.service-url.defaultZone` | `http://localhost:8761/eureka/` |

---

### 4. `pom.xml` — Dependencies

| Dependency | Purpose |
|---|---|
| `spring-boot-starter-web` | Enables REST API (embedded Tomcat) |
| `spring-boot-starter-actuator` | Provides health check at `/actuator/health` |
| `spring-cloud-starter-netflix-eureka-client` | Registers service with Eureka |
| `spring-boot-devtools` | Auto-restart on code changes during development |

---

## API Endpoints

### Base URL: `http://localhost:7071`

---

### 1. GET All Loans

| Field | Value |
|---|---|
| Method | `GET` |
| URL | `http://localhost:7071/loans` |
| Description | Returns list of all loans (static in-memory data) |

**Flow:**
```
GET /loans
    → LoanController.getAllLoans()
    → Returns in-memory List<String> ["Loan1", "Loan2", "Loan3"]
    → Jackson converts List → JSON array
    → Returns JSON response
```

**Sample Response:**
```json
["Loan1", "Loan2", "Loan3"]
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
         |  Routes /loans/** → lb://loanservice
         ↓
  Eureka Server :8761
         |
         |  Resolves loanservice → localhost:7071
         ↓
  LoanController
         |
         |  Returns in-memory List<String>
         ↓
  JSON Response → Client
```

---

## Configuration

### application.properties
```properties
spring.application.name=loanservice
server.port=7071
eureka.instance.prefer-ip-address=true
```

---

## How to Run

**Prerequisites:** Java 8+, Eureka Server running on port 8761

```bash
mvn spring-boot:run
```

Console output on success:
```
loan service server started
```

Service URL: `http://localhost:7071`

Via Gateway: `http://localhost:8989/loans`

---

## Important Notes

- No database operations — data is hardcoded in memory
- Uses older **Spring Boot 2.7.0 with Java 8** unlike other services (Boot 3.x/4.x with Java 17+)
- `@EnableEurekaClient` is required here because of Boot 2.x — do NOT remove it
- Only `application.properties` exists (no `application.yml`) — clean config, no conflicts
- To extend this service with real DB data, add Spring Data JPA + MySQL dependencies and replace the static list with a repository
