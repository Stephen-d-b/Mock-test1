# 2025 Mock Test

## 📋 Question 1 Project Overview

This is a Java console application designed to process product sales data. It calculates the total, average, maximum, and minimum sales for a 2-year period across three quarters. 

### Features:
*   **2D Array Processing**: Uses nested loops to iterate through a 2x3 integer array of sales data.
*   **Interface Implementation**: Implements the `IProduct` interface to enforce strict method structures.
*   **Logic Separation**: The `ProductSales` class handles all the math, keeping the `main` method clean.
*   **Unit Testing**: Includes JUnit tests to verify the total and average calculations.

---

## 📂 Question 1 File Structure

| File Name | Description |
| :--- | :--- |
| **`IProduct.java`** | The interface defining the methods for Total, Average, Max, and Min sales. |
| **`ProductSales.java`** | The logic class. It implements `IProduct` and uses nested loops to calculate the math without using casting (using `Double.parseDouble` instead). |
| **`RunApplication.java`** | The main class. It holds the hardcoded 2D array, creates a `ProductSales` object, and prints the report using `System.out.printf()`. |
| **`ProductSalesTest.java`** | The JUnit test class verifying the Total and Average methods. |

### 🚀 How to Run Question 1
1. Open the project in **NetBeans**.
2. Run the `RunApplication.java` file. 
3. The output will print directly to the NetBeans console, matching the required report format.

---
This repository contains the screenshots, documentation, and Java solutions for the 2025 mock test.

---

# Question 1: Console Application

## Question 1 Requirements

<div>
<img width="432" height="587" alt="Screenshot 2026-10-28 130733" src="https://github.com/user-attachments/assets/cb4d3a8e-ede8-4dcf-84cb-1dccf2b0cfa4" />
</div>

<br>

<div>
<img width="432" height="297" alt="Screenshot 2026-10-28 130832" src="https://github.com/user-attachments/assets/acf16787-9878-445e-9d11-92460cdc6a9e" />
</div>

<br>

## Question 1 Rubrics

<div>
<img width="665" height="320" alt="Screenshot 2026-10-28 130837" src="https://github.com/user-attachments/assets/4c110982-79ff-463b-b558-53f979695f0b" />
</div>

<br>

<div>
<img width="668" height="400" alt="Screenshot 2026-10-28 130843" src="https://github.com/user-attachments/assets/0c8a7eb5-cb20-4ac5-8ce6-35d8cc01d069" />
</div>

---
---

# Question 2: Product Sales Application (GUI)

This is a Java GUI application designed to calculate and report product sales data for a local sound equipment retailer. The application calculates total sales, average sales, and tracks sales over and under a specific limit.

## 📋 Question 2 Project Overview

The application is built using **Java Swing** for the graphical user interface and implements an **Object-Oriented** design. It uses an interface, a logic class, a main GUI form, and Unit Tests.

### Features:
*   **GUI Form**: Interactive window with Load and Save buttons.
*   **Menu System**: File menu (Exit) and Tools menu (Load, Save, Clear).
*   **Data Processing**: Automatically calculates total sales, average sales (rounded to the nearest whole number), sales over the limit (R500), and sales under the limit.
*   **File I/O**: Saves the generated report to a text file (`data.txt`).
*   **Unit Testing**: Includes JUnit tests to verify the logic for counting sales over and under the limit.

---

## 📂 Question 2 File Structure

Here is a breakdown of the classes created for this solution:

| File Name | Description |
| :--- | :--- |
| **`iProductSales.java`** | The interface containing the method signatures that the `ProductSales` class must implement. |
| **`ProductSales.java`** | The logic class. It stores the hardcoded 2D array (sales data) and contains all the mathematical calculations using nested loops. |
| **`frmMain.java`** | The main GUI class (JFrame). It handles user interactions (buttons, menus), displays the results, and handles file saving. |
| **`ProductSalesTest.java`** | The JUnit test class verifying that the `GetSalesOverLimit` and `GetSalesUnderLimit` methods return the correct values. |

---

## 🚀 How to Run Question 2

1. Open the project in **NetBeans**.
2. Run the `frmMain.java` file (Shift + F6).
3. Click the **"Load Product Data"** button (or go to `Tools -> Load Product Data`). The GUI will display the report based on the hardcoded data.
4. Click the **"Save Product Data"** button (or go to `Tools -> Save Product Data`). This will create a `data.txt` file in your project folder with the formatted report.
5. Go to `File -> Exit` to close the application.

---

## 🧪 How to Run the Unit Tests (Questions 1 & 2)

1. Right-click on the `ProductSalesTest.java` file.
2. Select **"Run File"** (or press Shift + F6).
3. The test results will appear in the output window. All tests should pass with a green bar.

---

## 📸 Question 2 Screenshots

<div>
  <img width="471" height="618" alt="Screenshot 2026-10-28 134532" src="https://github.com/user-attachments/assets/98325053-0771-4022-b089-3523b4c305f1" />

</div>

<div>
  <img width="447" height="584" alt="Screenshot 2026-10-28 134555" src="https://github.com/user-attachments/assets/803ea04e-798d-4bff-b035-c36481f727e4" />

</div>

<div>
  <img width="476" height="570" alt="Screenshot 2026-10-28 134600" src="https://github.com/user-attachments/assets/07ea70b6-ef09-403d-abe1-ef13b768fed9" />

</div>

## Question 2 Rubrics

<div>
  <img width="682" height="379" alt="Screenshot 2026-10-28 134604" src="https://github.com/user-attachments/assets/62916c27-8d45-4852-8e0a-b1a4e6f48867" />

</div>

<div>
  <img width="699" height="425" alt="Screenshot 2026-10-28 134610" src="https://github.com/user-attachments/assets/1ebd99a5-4b55-46e2-b0f1-ca628768441a" />

</div>

<div>
<img width="679" height="353" alt="Screenshot 2026-10-28 134614" src="https://github.com/user-attachments/assets/14575b5c-2d72-40b1-9261-90ce9d543567" />
  
</div>
