
# drone-delivery

This is a REST API service for managing  of drones that deliver medications. The system handles drone registration, loading, monitoring, and checking battery levels.

## Features
    1. **Registering a Drone**  
    2. **Loading a Drone with Medication**  

##  Technologies Used
    - Java 17+
    - Spring Boot 3.4.3
    - Hibernate 6.6.8
    - PostgreSQL
    - Maven
## API Endpoints

### Drone Management
- **Register a Drone**  
    `POST /api/drones`

- **Get Drone Info by id**  
    `GET /api/drones/{id}`

- **Get all Drones**  
    `GET /api/drones`

### Medication Management
- **Add Medication to Drone**  
    `POST /api/medications/add`

- **Get All Medications**  
    `GET /api/medications`

---  

##  How to Run the Application

1. **Clone the Repository**

    ```bash
    git clone https://github.com/pergent19/drone-system.git
    cd drone-delivery

2. **Configure Database**
**Update application.properties with your PostgreSQL settings:**

    spring.datasource.url=jdbc:postgresql://localhost:5432/drone_delivery_db
    spring.datasource.username=<username>
    spring.datasource.password=<password>

3. **Run the Application**
    ```bash
    mvn spring-boot:run

## How to Test Using Postman
1. Register a Drone
 
    ```json
    POST /api/drone/register
    {
        "serialNumber": "DR123456",
        "model": "Lightweight",
        "weightLimit": 500,
        "batteryCapacity": 80,
        "state": "IDLE"
    }


2.  Add Medication to Drone

    ```json
    POST /api/medications/add
    {
    "name": "Aspirin",
    "weight": 500,
    "code": "ASP123",
    "image": "aspirin.jpg",
    "drone": {
        "id": 1
    }
    }