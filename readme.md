# User Management API

✅ MVP completed — project under continuous improvement.

A RESTful User Management API built with **Java 17** and **Spring Boot**, focusing on clean architecture, proper separation of concerns, and best practices commonly used in real-world backend applications.

This project is being developed incrementally, with well-defined commits and a strong emphasis on code organization and maintainability.

---

## ✨ Current Features

- User domain modeled with JPA and UUID identifiers
- User creation with:
  - Email uniqueness validation
  - Secure password hashing using BCrypt
- Data Transfer Objects (DTOs) using Java `record`
- Service layer with clear business rules
- REST controllers exposing CRUD endpoints
- Custom domain exceptions
- Global exception handling with consistent error responses
- Input validation with proper HTTP status codes
- PostgreSQL integration
- Transaction management

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3
- Spring Data JPA (Hibernate)
- PostgreSQL
- Lombok
- Bean Validation (Jakarta Validation)
- Maven

---

## 📁 Project Structure

```
com.lpamplonadev.usermanagement
├── controller      # (to be implemented)
├── dto             # Request / Response objects
├── exception       # Domain exceptions and global handler
├── model           # JPA entities
├── repository      # Data access layer
├── service         # Business logic
└── UserManagementApiApplication.java
```

---

## ▶️ How to Run

### Prerequisites

- Java 17+
- PostgreSQL
- Maven (or Maven Wrapper)

### Steps

1. Clone the repository:

```bash
git clone https://github.com/lpamplonadev/user-management-api.git
cd user-management-api
```

2. Create a PostgreSQL database:

```sql
CREATE DATABASE user_management;
```

3. Configure database credentials in `application.yml`.

4. Run the application:

```bash
./mvnw spring-boot:run
```

The application will start on:

```
http://localhost:8080
```

---

## 🧪 API Status

✅ CRUD endpoints available for user management.

The API currently supports creating, retrieving, updating and deleting users,
with proper validation and error handling.

---

## 📌 Available Endpoints

- `POST /api/users` — Create user
- `GET /api/users` — List users
- `GET /api/users/{id}` — Get user by ID
- `PUT /api/users/{id}` — Update user
- `DELETE /api/users/{id}` — Delete user

---

## 🚀 Next Steps

- Implement REST controllers
- Add pagination and sorting
- Improve validation error responses
- Add OpenAPI / Swagger documentation
- Add automated tests

---

## 👤 Author

**Leonardo Pamplona**  
Full Stack Developer (Backend-focused) — Java / Spring Boot

- GitHub: https://github.com/lpamplonadev
- LinkedIn: https://www.linkedin.com/in/lpamplonadev/

---

## 🇧🇷 Português

✅ MVP completo — projeto em melhoras contínuas.

API REST para gerenciamento de usuários desenvolvida com **Java 17** e **Spring Boot**, com foco em arquitetura limpa, separação de responsabilidades e boas práticas de backend.

O projeto está sendo construído de forma incremental, com commits pequenos e bem definidos.

### Funcionalidades atuais

- Modelagem de usuários com JPA e UUID
- Criação de usuários com validação de email único
- Hash de senha com BCrypt
- DTOs usando `record`
- Camada de serviço com regras de negócio
- Exceções de domínio e handler global
- Integração com PostgreSQL
- Validações de entradas com status HTTP apropiados
- Controllers REST expondo endpoints CRUD

Novas funcionalidades serão adicionadas progressivamente.
