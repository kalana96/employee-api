# Employee Management System API

## Overview
The Employee Management System API is a RESTful service built with Spring Boot that enables the management of employee records. The API supports CRUD operations, allowing clients to create, view, update, and delete employee data. This system is suitable for use in enterprise HR applications, administrative tools, or as part of a broader HR management system.

## Features
- **Create, Read, Update, Delete (CRUD) Operations** on employee records
- **Pagination and Sorting** for large employee datasets
- **Robust Error Handling** to ensure API reliability
- **Input Validation** to maintain data integrity
- **Swagger/OpenAPI Documentation** for easy API exploration and testing

## Tech Stack
- **Java 17**: Core programming language
- **Spring Boot**: Application framework
- **Spring Data JPA**: For data persistence
- **MySQL**: Relational database
- **Springdoc OpenAPI**: For interactive API documentation
- **Lombok**: Reduces boilerplate code
- **ModelMapper**: For object mapping between DTOs and entities

---

## Project Structure

```plaintext
employee-management-api/
├── src/
│   ├── main/
│   │   ├── java/com/example/employeemanagementapi
│   │   │   ├── controller/               # REST controllers
│   │   │   ├── dto/                      # Data Transfer Objects
│   │   │   ├── entity/                   # Entity models
│   │   │   ├── repository/               # Database repository interfaces
│   │   │   ├── service/                  # Business logic services
│   │   │   └── utility/                  # Custom exception handling
│   │   └── resources/
│   │       └── application.properties    # Database and server configurations
└── README.md   
```

## Getting Started

Follow these instructions to set up and run the Employee Management System API locally.

### Prerequisites

Ensure you have the following software installed on your machine:

- **Java 17** or later
- **Maven** for dependency management
- **MySQL** (or H2 as an in-memory option) for the database

### Installation

1. **Clone the Repository**

   First, clone this repository to your local machine using Git:

   ```bash
   git clone https://github.com/yourusername/employee-management-api.git
   cd employee-management-api

2. **Set Up the Database**
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/db_employee
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
