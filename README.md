# Streaming Metadata Dashboard 🎬

A professional backend service built with Java and Spring Boot to manage and organize streaming content metadata. This project implements a scalable architecture to handle movie and TV show data, focusing on performance and clean code principles.

## 🚀 Key Features
*   **Centralized Metadata Management:** Efficiently store and retrieve information like titles, genres, release dates, and ratings.
*   **RESTful API Design:** Clean endpoints for managing content (CRUD operations).
*   **Database Persistence:** Seamless integration with MySQL for reliable data storage.
*   **Scalable Architecture:** Built using a layered approach (Controller, Service, Repository) for easy maintenance.

## 🛠️ Tech Stack
*   **Backend:** Java 17, Spring Boot 3.x
*   **Data Access:** Spring Data JPA, Hibernate
*   **Database:** MySQL 8.0
*   **Build Tool:** Maven
*   **Tools:** Postman (for API testing), IntelliJ IDEA

## 📂 Project Structure
```text
src/main/java/com/manas/streamingdashboard/
├── controller/     # REST API Endpoints
├── service/        # Business Logic Layer
├── repository/     # Data Access Layer (JPA)
├── model/          # Database Entities (MySQL Mapping)
└── StreamingDashboardApplication.java  # Main Application Class
