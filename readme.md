# User Management API

🚧 **Project under active development**

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
- Custom domain exceptions
- Global exception handling with consistent error responses
- PostgreSQL integration
- Transaction management
- Clean and structured Git history

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

🚧 Controllers and HTTP endpoints are currently under development.  
Business logic and error handling are already implemented.

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
Backend Developer (Java / Spring Boot)  

- GitHub: https://github.com/lpamplonadev  
- LinkedIn: https://www.linkedin.com/in/lpamplonadev/

---

## 🇧🇷 Português

🚧 **Projeto em desenvolvimento**

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

Novas funcionalidades serão adicionadas progressivamente.
