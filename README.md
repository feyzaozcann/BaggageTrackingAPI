# Baggage Tracking API

## Overview
The Baggage Tracking API is a simple RESTful service for managing baggage information for passengers. It allows creation, retrieval, update and deletion of baggage records.

## Technologies
- **Java 24** with **Spring Boot 3.5.3**
- **Maven** for build management
- **PostgreSQL** as the data store
- **Lombok** for boilerplate reduction

## Project Structure
```
tracking-backend/
├── pom.xml              # Maven configuration
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com/example/tracking_backend
│   │   │       ├── controller  # REST controllers
│   │   │       ├── dto         # Data transfer objects
│   │   │       ├── entity      # JPA entities
│   │   │       ├── exception   # Custom exceptions
│   │   │       ├── mapper      # DTO/entity mappers
│   │   │       ├── repository  # Spring Data repositories
│   │   │       └── service     # Business logic
│   │   │           └── impl    # Service implementations
│   │   └── resources          # Application properties
│   └── test
│       └── java               # Unit tests

```
## API Endpoints
- `POST /api/baggages` – Create a new baggage
- `GET /api/baggages/{id}` – Retrieve a baggage by id
- `GET /api/baggages` – List all baggages
- `PUT /api/baggages/{id}` – Update an existing baggage
- `DELETE /api/baggages/{id}` – Delete a baggage

