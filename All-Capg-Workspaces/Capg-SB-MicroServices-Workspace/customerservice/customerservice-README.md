# Customer Service

A Spring Boot microservice for managing **Customer data** using REST APIs, Spring Data JPA, MySQL database, and Eureka Service Discovery.

---

## Tech Stack

| Technology | Version |
|---|---|
| Spring Boot | 4.0.3 |
| Java | 17 |
| Spring Data JPA | - |
| MySQL Driver | - |
| Spring Cloud Eureka Client | 2025.1.0 |
| Spring Boot Actuator | - |
| Spring Boot DevTools | - |

---

## Project Structure

```
customerservice/
├── src/main/java/com/demoorg/customerservice/
│   ├── CustomerserviceApplication.java     ← Entry point
│   ├── model/
│   │   └── Customer.java                   ← JPA Entity (DB table mapping)
│   ├── repository/
│   │   └── CustomerRepository.java         ← DB operations (JPA)
│   └── controller/
│       └── CustomerController.java         ← REST API endpoints
├── src/main/resources/
│   ├── application.properties              ← DB + port config
│   └── application.yml                     ← Eureka config
└── pom.xml                                 ← Dependencies
```

---

## File-by-File Working

---

### 1. `CustomerserviceApplication.java` — Entry Point

```java
@SpringBootApplication
public class CustomerserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerserviceApplication.class, args);
        System.out.println("Customer Service Started...");
    }
}
```

**What it does:**
- `@SpringBootApplication` — Enables auto-configuration, component scanning, and configuration
- `SpringApplication.run(...)` — Boots up the entire Spring context, starts embedded Tomcat server on port **7073**
- Automatically connects to MySQL and registers with Eureka on startup

---

### 2. `Customer.java` — Model / JPA Entity

```java
@Entity
public class Customer {
    @Id
    @Column(name = "cId")
    private int cId;

    private String name;
    private double sal;

    // getters and setters
}
```

**What it does:**
- `@Entity` — Marks this class as a JPA entity, maps to the `customer` table in MySQL
- `@Id` — Marks `cId` as the Primary Key
- `@Column(name = "cId")` — Explicitly maps Java field `cId` to DB column `cId` (prevents Hibernate from renaming it to `c_id`)
- Hibernate uses this class to **auto-create/update** the `customer` table when `ddl-auto=update`
- Getters/Setters are used by **Jackson** (JSON library) to serialize/deserialize request and response data

**DB Table Created by Hibernate:**
```sql
CREATE TABLE customer (
    cId   INT PRIMARY KEY,
    name  VARCHAR(255),
    sal   DOUBLE
);
```

---

### 3. `CustomerRepository.java` — Data Access Layer

```java
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
```

**What it does:**
- Extends `JpaRepository<Customer, Integer>` — gives free built-in DB methods without writing any SQL

| Method | SQL Equivalent |
|---|---|
| `findAll()` | `SELECT * FROM customer` |
| `findById(id)` | `SELECT * FROM customer WHERE cId = ?` |
| `save(customer)` | `INSERT INTO customer VALUES(...)` |
| `deleteById(id)` | `DELETE FROM customer WHERE cId = ?` |

- `Customer` = entity type, `Integer` = type of Primary Key (`cId`)
- Spring automatically creates the implementation at runtime — no SQL needed

---

### 4. `CustomerController.java` — REST API Layer

```java
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
    ...
}
```

**What it does:**
- `@RestController` — Marks this as a REST controller; all methods return JSON automatically
- `@RequestMapping("/customer")` — All endpoints are prefixed with `/customer`
- `@Autowired` — Spring injects `CustomerRepository` automatically (Dependency Injection)

---

## API Endpoints

### Base URL: `http://localhost:7073`

---

### 1. GET All Customers

| Field | Value |
|---|---|
| Method | `GET` |
| URL | `http://localhost:7073/customer/getallcust` |
| Description | Returns list of all customers from DB |

**Flow:**
```
GET /customer/getallcust
    → CustomerController.getAllCustomers()
    → customerRepository.findAll()
    → SELECT * FROM customer
    → Returns List<Customer> as JSON
```

**Sample Response:**
```json
[
  { "cId": 101, "name": "SAM", "sal": 10000.0 },
  { "cId": 102, "name": "JOHN", "sal": 25000.0 }
]
```

---

### 2. GET Customer by ID

| Field | Value |
|---|---|
| Method | `GET` |
| URL | `http://localhost:7073/customer/getcust/{cid}` |
| Example | `http://localhost:7073/customer/getcust/101` |
| Description | Returns a single customer by ID |

**Flow:**
```
GET /customer/getcust/101
    → @PathVariable extracts cid = 101
    → CustomerController.getCustomer(101)
    → customerRepository.findById(101)
    → SELECT * FROM customer WHERE cId = 101
    → Returns Optional<Customer> as JSON
```

**Sample Response (found):**
```json
{ "cId": 101, "name": "SAM", "sal": 10000.0 }
```

**Sample Response (not found):**
```json
{}
```

---

### 3. POST Add Customer

| Field | Value |
|---|---|
| Method | `POST` |
| URL | `http://localhost:7073/customer/addcust` |
| Content-Type | `application/json` |
| Description | Adds a new customer to DB |

**Flow:**
```
POST /customer/addcust  +  JSON body
    → @RequestBody converts JSON → Customer object
    → CustomerController.addCustomer(customer)
    → customerRepository.save(customer)
    → INSERT INTO customer VALUES(102, 'JOHN', 25000.0)
    → Returns success String
```

**Request Body:**
```json
{
    "cId": 102,
    "name": "JOHN",
    "sal": 25000.0
}
```

**Response:**
```
Customer added with Id: 102
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
         |  Routes /customer/** → lb://customerservice
         ↓
  Eureka Server :8761
         |
         |  Resolves customerservice → localhost:7073
         ↓
  CustomerController
         |
         |  Calls Repository method
         ↓
  CustomerRepository (JPA)
         |
         |  Executes SQL query
         ↓
  MySQL Database (capgdb → customer table)
         |
         |  Returns data
         ↓
  JSON Response → Client
```

---

## Database Setup

```sql
CREATE DATABASE capgdb;
USE capgdb;

CREATE TABLE customer (
    cId  INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    sal  DOUBLE
);

INSERT INTO customer VALUES(101, 'SAM', 10000);
```

---

## Configuration

### application.properties
```properties
spring.application.name=customerservice
server.port=7073
eureka.instance.prefer-ip-address=true
spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/capgdb
spring.datasource.username=root
spring.datasource.password=yourpassword
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
  port: 7073
spring:
  application:
    name: customerservice
```

---

## How to Run

**Prerequisites:** Java 17+, MySQL on port 3306, Eureka Server on port 8761

```bash
mvn spring-boot:run
```

Console output on success:
```
Customer Service Started...
```

Service URL: `http://localhost:7073`

Via Gateway: `http://localhost:8989/customer/getallcust`
