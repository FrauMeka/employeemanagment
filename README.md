# Employee Management System

## Description
The **Employee Management System** is a JavaFX application designed to manage employees and calculate their salaries. It uses object-oriented programming concepts, including an abstract class `Employee` with subclasses representing different employee types: Full-time, Part-time, and Contractor. Users can interact with a graphical interface to add, view, calculate, and remove employees.

---

## Features
### Object-Oriented Design
- **Abstract Class `Employee`:**
  - Method: `abstract double calculateSalary();`
  - Implemented differently by:
    - **FullTimeEmployee**: Fixed annual salary.
    - **PartTimeEmployee**: Salary based on hourly rate and hours worked.
    - **Contractor**: Salary based on hourly rate and a maximum number of hours worked.

### JavaFX GUI
- **TableView:**
  - Displays employees' details: Name, Type, and Salary.
- **Input Fields:**
  - Enter employee details like name, type, hours worked, hourly rate, etc.
- **Dropdown Menu:**
  - Select employee type (Full-time, Part-time, Contractor).
- **Buttons:**
  - Add Employee.
  - Calculate Salaries.
  - Remove Selected Employee.
- **Validation:**
  - Ensures inputs are valid (e.g., non-negative hours, positive salary).

---

## How to Run the Program
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/FrauMeka/employeemanagment.git
