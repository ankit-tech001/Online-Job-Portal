# Job Portal Project

## Description
A dynamic **Job Portal web application** built using **Java, JSP, Servlets, JDBC, and MySQL**.  
The project enables users to search and apply for jobs, while administrators can create and manage job listings.  
It follows clean architecture, proper validation, and professional coding patterns to meet Review-1 and Review-2 requirements.

---

## Features

### User Features
- User Registration & Login  
- Client-side + Server-side Validation  
- Search Jobs with Filters  
- Apply for Jobs  
- View Applied Jobs  

### Admin Features
- Admin Login  
- Add / Edit / Delete Job Posts (CRUD)  
- Manage Users  
- View All Applications  

### System Functional Features
- MVC Architecture  
- DAO Pattern  
- JDBC Database Connectivity  
- Exception Handling  
- Session Management  
- Error Pages  
- Responsive UI  

---

##  Technologies Used
- **Core Java**
- **JSP** (JavaServer Pages)
- **Servlets**
- **JDBC**
- **MySQL**
- **HTML**
- **CSS (Flexbox + Grid)**
- **JavaScript**

---

## Project Structure

JobPortal/
│
├── src/
│ ├── models/ # POJO classes (User, Job, Application)
│ ├── dao/ # Data Access Layer
│ ├── servlets/ # Controllers
│ └── utils/ # Database connection helpers
│
├── webapp/
│ ├── jsp/ # JSP pages
│ ├── css/ # Stylesheets
│ └── META-INF/
│
└── README.md


## Database Schema (MySQL)

## 'users'

id (PK),
name,
email,
password,
role (admin/user)


## `jobs`

id (PK),
title,
description,
salary,
location

## 'applications'
id (PK),
user_id (FK),
job_id (FK),
status

## Project Status
#### Fronted in  development, Backend tested and deployed.
[Presentation](https://drive.google.com/file/d/1B4ZEo92g7UPVnWOf_RkBDjNe3RTFADaR/view?usp=drivesdk)

![Screenshot 1](https://github.com/ankit-tech001/Online-Job-Portal/blob/master/L1.png)
![Screenshot 2](https://github.com/ankit-tech001/Online-Job-Portal/blob/master/L2.png)
![Screenshot 3](https://github.com/ankit-tech001/Online-Job-Portal/blob/master/L3.png)
![Screenshot 4](https://github.com/ankit-tech001/Online-Job-Portal/blob/master/L4.png)
![Screenshot 5](https://github.com/ankit-tech001/Online-Job-Portal/blob/master/L5.png)
![Screenshot 6](https://github.com/ankit-tech001/Online-Job-Portal/blob/master/L6.png)
![Screenshot 7](https://github.com/ankit-tech001/Online-Job-Portal/blob/master/L7.png)
![Screenshot 8](https://github.com/ankit-tech001/Online-Job-Portal/blob/master/L8.png)

## Installation and Usage
1. Clone the repository: `https://github.com/ankit-tech001/Online-Job-Portal`
2. Create a MySQL database and import the SQL file.
3. Build and deploy the project on a Java Servlet container (e.g., Apache Tomcat)
4. Access the application via `http://localhost:8081/job-portal`


---

## Code Quality & Testing
This project includes:
- Clean, modular, professional Java code  
- Proper OOP (Encapsulation, Abstraction, Inheritance, Polymorphism)  
- MVC + DAO Design Pattern  
- Comments in all important files  
- Exception handling (try–catch + error.jsp)  
- Client + Server side validation  
- Testing done for:
- Login/Registration  
- CRUD operations  
- Session handling  
- JDBC connection  
- Job apply workflow  

---

## Teamwork & Collaboration
Work divided among 3 team members:

- **Member 1:** Database + JDBC + DAO Layer  
- **Member 2:** Servlets + Business Logic + Validation  
- **Member 3:** JSP + CSS + Documentation + Testing  

Collaboration methods:
- GitHub commits  
- Task division  
- Shared testing  
- Clean documentation  

---

## Innovation / Extra Effort
Extra features added:
- Job Search with Filters  
- Responsive UI (Flexbox + Grid)  
- SQL Injection safe PreparedStatements  
- Detailed error handling  
- Session timeout logic  
- Clean admin dashboard  
- Application status tracking  

---

## Contributors
- Member 1 – Backend Developer  
- Member 2 – Servlet Logic & Validation  
- Member 3 – Frontend UI & Documentation  

---

## Status
**Completed • Stable • Review-1 + Review-2 Ready**
