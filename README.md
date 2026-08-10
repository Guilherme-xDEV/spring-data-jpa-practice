# Spring Data JPA Practice

This is a small Spring Boot practice project that demonstrates a basic JPA entity model with repositories and a REST controller for instructors.

## API Endpoints

Base URL: `http://localhost:8080`

- `GET /instrutores`
  - Description: List all instructors
  - Example: `http://localhost:8080/instrutores`

- `POST /instrutores`
  - Description: Create a new instructor
  - Example: `http://localhost:8080/instrutores`
  - Body: JSON object with instructor fields such as `nome`, `email`, and `biografia`

## Notes

- The project uses Spring Data JPA repositories.
- Only the `InstrutorController` REST endpoints are currently exposed.
- Default server port is `8080` unless overridden in `application.properties`.
