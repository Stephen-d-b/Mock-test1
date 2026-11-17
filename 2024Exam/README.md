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

<div>
<img width="552" height="831" alt="Screenshot 2026-11-17 122203" src="https://github.com/user-attachments/assets/05a446e0-08dc-4301-8e2f-5c78004416d8" />

</div>

<br>

*(Note: The exam requires the use of a 1D array for movie names, a 2D array for sales, and an interface called `IMovieTickets` with specific method signatures).*

---

## Question 1 Rubrics

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
