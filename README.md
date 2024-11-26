## Spring Boot Rest APi- Category & Product Management

This project implements a REST API for managing categories and products using Spring Boot.
it features
- CRUD operations for Categories and Products
- One-to-Many relationship between Category and Products
- Pagination support




## Technologies Used
- Spring Boot
- JPA & Hibernate
- MySQL
- Maven
- RESTful API

## API Endpoints

#NOTE :
  ``` Ensure that the id field of your Product or category  entity is not being changed manually in apis methods. The id is primary key should be treated as immutable and should not be altered after the entity is created.```
### Category Endpoints
- GET `/api/categories`
- POST `/api/categories`
- PUT `/api/categories/{id}`
- DELETE `/api/categories/{id}`

### Product Endpoints
- GET `/api/products`
- POST `/api/products`
- PUT `/api/products/{id}`
- DELETE `/api/products/{id}`

## Setup
**1. Clone the repository:
   
**2. using ecipse or intillij-**
```no need to have external server just copy and paste the project into the above ide and run mainapplication```

**3.Update application.properties with your database configuration.
