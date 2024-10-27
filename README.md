# Customer Management System

A simple Customer Management System built with **Spring Boot**, **Hibernate**, and **MySQL**. This project provides RESTful APIs for managing customer data, allowing for the creation, retrieval, updating, and deletion (CRUD) of customer records in a MySQL database.

## Features

- **CRUD Operations**: APIs to create, read, update, and delete customer records.
- **RESTful Endpoints**:
  - `GET /customers` - Retrieve a list of all customers.
  - `GET /customers/{id}` - Retrieve a specific customer by ID.
  - `POST /customers` - Create a new customer record.
  - `PUT /customers/{id}` - Update an existing customer record.
  - `DELETE /customers/{id}` - Delete a customer record by ID.
- **Database**: MySQL with Hibernate ORM for persistence and data mapping.

## Technologies Used

- **Spring Boot**: Backend framework for building and running the application.
- **Hibernate**: ORM for database interaction.
- **MySQL**: Database to store customer information.
