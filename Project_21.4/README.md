# E-Commerce Project

This is a full-stack E-Commerce application developed as a Cognizant project. It consists of a Spring Boot backend and an Angular frontend.

## Project Structure

- **Ecommerce/**: Spring Boot backend application
- **Ecommerce-Frontend/**: Angular frontend application

## Backend (Spring Boot)

- **Framework**: Spring Boot 3.4.3
- **Java Version**: 17
- **Database**: MySQL
- **Authentication**: JWT
- **Features**: Web, Security, JPA, Validation

### Setup

1. Ensure MySQL is running on localhost:3306 with database `ecommerce`
2. Update database credentials in `Ecommerce/src/main/resources/application.properties` if needed
3. Run the application:
   ```bash
   cd Ecommerce
   ./mvnw spring-boot:run
   ```
4. The backend will run on port 2022

## Frontend (Angular)

- **Framework**: Angular 19.2.0
- **UI Library**: Bootstrap 5.3.5
- **Build Tool**: Angular CLI

### Setup

1. Install dependencies:
   ```bash
   cd Ecommerce-Frontend
   npm install
   ```
2. Start the development server:
   ```bash
   ng serve
   ```
3. Open browser at `http://localhost:4200`

## Features

- User registration and login
- Product catalog
- Shopping cart
- Order management
- Admin panel for managing categories and products
- User profile management

## Technologies Used

- **Backend**: Spring Boot, Spring Security, Spring Data JPA, MySQL, JWT
- **Frontend**: Angular, TypeScript, Bootstrap, RxJS

## Development

- Backend uses Maven for dependency management
- Frontend uses npm for package management
- Both parts can be developed independently

## Notes

- Ensure the backend is running before starting the frontend for full functionality
- Database schema is auto-generated via Hibernate