# 🚖 Cab Booking System (Maven + POJO)

## 📌 Overview
The **Cab Booking System** is a simple Java-based project built using **Maven** and **Plain Old Java Objects (POJO)**. It simulates the process of booking a cab, managing drivers, users, and rides, similar to **Uber** or **Ola**.

---

## 📂 Project Structure
Cabs-Booking-Maven-Project/ │── src/ │ ├── main/ │ │ ├── java/com/sachin/ │ │ │ ├── controller/ # Controllers (DriverController, RideController) │ │ │ ├── model/ # POJO Classes (Driver, User, Ride) │ │ │ ├── service/ # Business Logic (DriverService, RideService) │ │ │ ├── repository/ # Data Handling (DriverRepository, RideRepository) │ │ │ ├── exception/ # Custom Exceptions (CabException) │ │ │ ├── main/ # Main Class (CabBookingApplication) │ ├── test/ # Unit Tests │── pom.xml # Maven Dependencies │── README.md # Project Documentation

yaml
Copy
Edit

---

## ⚙️ **Technologies Used**
- **Java 8+**
- **Maven** (Build Automation)
- **POJO** (Plain Old Java Objects)
- **Collections API** (List, Map, Streams)
- **Exception Handling** (Custom Exception Classes)
- **JUnit** (Testing)

---

## 🚀 **Features**
✅ **User Registration** – Add new users and manage accounts.  
✅ **Driver Management** – Register drivers with vehicle details.  
✅ **Ride Booking** – Book rides with available drivers.  
✅ **Payment System** – Supports UPI, Cash, and Credit Cards.  
✅ **Exception Handling** – Handles invalid inputs and system errors.  

---

## 🏗️ **Installation & Setup**
### 1️⃣ Clone the Repository
```sh
git clone https://github.com/Sachingupta03/cabs-booking-maven-project.git
cd cabs-booking-maven-project
2️⃣ Build the Project
sh
Copy
Edit
mvn clean install
3️⃣ Run the Application
sh
Copy
Edit
mvn exec:java -Dexec.mainClass="com.sachin.main.CabBookingApplication"
📜 Code Example
Driver POJO (Model)
java
Copy
Edit
package com.sachin.model;

public class Driver {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String cabDetails;

    public Driver(String id, String name, String email, String phone, String cabDetails) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cabDetails = cabDetails;
    }

    public String getName() { return name; }
    public String getCabDetails() { return cabDetails; }
}
❌ Exception Handling
The project includes custom exception handling for better error management.

java
Copy
Edit
package com.sachin.exception;

public class CabException extends RuntimeException {
    public CabException(String message) {
        super(message);
    }
}
🧪 Testing
To run unit tests:

sh
Copy
Edit
mvn test
📢 Contributing
Fork the repo 🍴

Create a feature branch 🔀 (git checkout -b feature-name)

Commit your changes ✅ (git commit -m "Add new feature")

Push to GitHub 🚀 (git push origin feature-name)

Open a Pull Request 🛠️

