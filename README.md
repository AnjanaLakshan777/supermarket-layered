# Supermarket Layered Architecture

A simple Java Swing application demonstrating the **Layered Architecture** pattern for managing supermarket customers, inventory items, and orders.

## Features

- **Customer Management:** Add, update, delete, and search customers
- **Item Management:** Add, update, delete, and search inventory items
- **Order Processing:** Create orders with multiple items, apply discounts, and update inventory automatically

## Technologies Used

- Java Swing for the graphical user interface
- JDBC for database connectivity
- MySQL for data storage
- NetBeans IDE for development

## Architecture

The project is organized into separate layers:

- **View Layer:** Provides the Java Swing forms and user interface
- **Controller Layer:** Handles user actions and coordinates application flow
- **Service Layer:** Contains business logic and validation
- **DAO Layer:** Manages database operations
- **DTO Layer:** Transfers data between application layers
- **Entity Layer:** Represents database-related domain objects

This separation improves maintainability, reusability, and testability by keeping presentation, business logic, and data access responsibilities independent.

## Key Functionality

### Customer Form

- Save new customers
- Update existing customer details
- Delete customers
- Search customers
- View all customers in a table

### Item Form

- Save new items with quantity on hand
- Update item information
- Delete items
- Search items
- View all items in a table

### Order Form

- Search and select customers
- Search and select items
- Add multiple items to a cart
- Apply discounts per item
- Place orders
- Automatically update inventory
- Use transaction management for data consistency

This project was developed as a self-study project to learn and understand layered architecture and the separation of responsibilities in Java applications.

## Author

Anjana Lakshan
