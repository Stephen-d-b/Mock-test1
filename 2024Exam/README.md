# 2024 Exam - Question 1

## 📋 Question 1 Project Overview

This is a Java console application designed to process movie ticket sales data for two different movies over a three-month period. It calculates the total sales for each movie and determines which movie was the top performer.

### Features:
*   **2D Array Processing**: Uses a single-dimensional array for movie names and a two-dimensional array for the monthly sales data (Jan, Feb, Mar).
*   **Interface Implementation**: Implements the `IMovieTickets` interface to enforce strict method structures for calculations.
*   **Logic Separation**: The `MovieTickets` class handles all the math, keeping the `main` method clean and focused on displaying the report.
*   **Unit Testing**: Includes JUnit tests to verify the total sales calculation and the top movie determination.

---

## 📂 Question 1 File Structure

| File Name | Description |
| :--- | :--- |
| **`IMovieTickets.java`** | The interface defining the methods for `TotalMovieSales` and `TopMovie`. |
| **`MovieTickets.java`** | The logic class. It implements `IMovieTickets` and uses loops to calculate the sums and find the highest value. |
| **`Main.java`** | The main class. It holds the hardcoded 1D and 2D arrays, creates a `MovieTickets` object, and prints the formatted report using `System.out.printf()`. |
| **`MovieTicketsTest.java`** | The JUnit test class verifying the Total Sales and Top Movie methods. |

### 🚀 How to Run Question 1
1. Open the project in **NetBeans**.
2. Run the `Main.java` file. 
3. The output will print directly to the NetBeans console, matching the required report format exactly.

---

# Question 1: Console Application

## Question 1 Requirements

<div>
<img width="593" height="879" alt="Screenshot 2026-11-17 122155" src="https://github.com/user-attachments/assets/8d3d81cb-bf6d-46e6-94b8-ca41de0d2935" />
</div>

<br>

*(Note: The exam requires the use of a 1D array for movie names, a 2D array for sales, and an interface called `IMovieTickets` with specific method signatures).*

---

## Question 1 Rubrics

<div>
<img width="552" height="831" alt="Screenshot 2026-11-17 122203" src="https://github.com/user-attachments/assets/05a446e0-08dc-4301-8e2f-5c78004416d8" />

</div>

<div>
<img width="546" height="790" alt="Screenshot 2026-11-17 122209" src="https://github.com/user-attachments/assets/bf677ad3-ec98-410d-bfa4-4cfcc998ff72" />

</div>

<br>

<div>
<img width="572" height="615" alt="Screenshot 2026-11-17 122213" src="https://github.com/user-attachments/assets/9d216bc6-a0d6-4072-8c16-797c22a979cb" />

</div>

<br>
---
---

Question 2

## 📋 Question 2 Project Overview

This is a Java GUI (Graphical User Interface) application designed to process movie ticket purchases for a local cinema. It captures user input, calculates the total price including a 14% VAT amount, displays the report on screen, and saves it to a text file.

### Features:
*   **GUI Form**: Built with Java Swing (JFrame) featuring a combo box for movie selection, text fields for input, and a read-only text area for the report.
*   **Menu System**: Includes a File menu (Exit) and Tools menu (Process, Clear).
*   **Data Processing**: Automatically calculates total ticket price and includes a 14% VAT amount.
*   **Validation**: Validates user input (tickets and price cannot be 0 or less, movie cannot be empty).
*   **File I/O**: Saves the generated report to a text file named `report.txt`.
*   **Unit Testing**: Includes JUnit tests to verify the VAT calculation and validation logic.

---

## 📂 Question 2 File Structure

Here is a breakdown of the classes created for this solution:

| File Name | Description |
| :--- | :--- |
| **`IMovieTickets.java`** | The interface containing the method signatures that the `MovieTickets` class must implement. |
| **`MovieTicketData.java`** | A helper data class used to carry ticket information (movie name, number of tickets, price) from the GUI to the validation method. |
| **`MovieTickets.java`** | The logic class. It implements `IMovieTickets` and contains the math for VAT calculation and the logic for validating input. |
| **`MovieTicketForm.java`** | The main GUI class (JFrame). It handles user interactions (menus, buttons), displays the results, handles file saving, and contains the `main` method. |
| **`MovieTicketsGUITest.java`** | The JUnit test class verifying that the VAT calculation and validation methods work correctly. |

---

## 🚀 How to Run Question 2

1. Open the project in **NetBeans**.
2. Run the `MovieTicketForm.java` file (Shift + F6).
3. Select a movie from the dropdown, enter the number of tickets (e.g., 3), and the ticket price (e.g., 100).
4. Go to `Tools -> Process`. The GUI will display the formatted report and save it to `report.txt` in your project folder.
5. Go to `Tools -> Clear` to reset the form, and `File -> Exit` to close the application.

---

## 🧪 How to Run the Unit Tests

1. Right-click on the `MovieTicketsGUITest.java` file.
2. Select **"Run File"** (or press Shift + F6).
3. The test results will appear in the output window. Both the VAT calculation test and the validation test should pass with a green bar.

---

## 📸 Question 2 Screenshots

<div>
  <img width="615" height="808" alt="Screenshot 2026-11-17 122435" src="https://github.com/user-attachments/assets/dcfb93ba-bc5d-408e-ab01-714d55cb3885" />

</div>

<br>

<div>
  <img width="558" height="731" alt="Screenshot 2026-11-17 122440" src="https://github.com/user-attachments/assets/c34ff89a-9b05-4ccf-8ef5-bb5e6a8cf93a" />

</div>

<br>

<div>
  <img width="571" height="656" alt="Screenshot 2026-11-17 122444" src="https://github.com/user-attachments/assets/b5261410-4af5-41af-b00c-b2ddb4000159" />

</div>

---

## Question 2 Rubrics

<div>
<img width="577" height="755" alt="Screenshot 2026-11-17 122448" src="https://github.com/user-attachments/assets/9fd7eb46-716a-4bf6-8151-9808a52ec3be" />

</div>

<br>

<div>
<img width="576" height="807" alt="Screenshot 2026-11-17 122451" src="https://github.com/user-attachments/assets/fbb943c1-4e62-4dd4-a1f3-19d651b81fd4" />

</div>

<br>

<div>
<img width="558" height="799" alt="Screenshot 2026-11-17 122454" src="https://github.com/user-attachments/assets/1890a8a3-d2c3-48e4-8ed8-84e4244f5843" />

</div>

<br>

<div>
![Uploading Screenshot 2026-11-17 122457.png…]()

</div>

<br>

---
---
