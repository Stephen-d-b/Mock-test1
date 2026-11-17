 # 2023 Exam - Question 1

## 📋 Question 1 Project Overview

This is a Java console application designed to process property sales data for two estate agents over a three-month period (January, February, and March). It calculates the total sales for each agent, determines the 2% commission earned, and identifies the top-selling estate agent.

### Features:
*   **2D Array Processing**: Uses a single-dimensional array for agent names and a two-dimensional array for the monthly sales figures.
*   **Interface Implementation**: Implements the `IEstateAgent` interface to enforce strict method structures for calculations.
*   **Logic Separation**: The `EstateAgent` class handles all the math, keeping the `Main` method clean and focused on displaying the report.
*   **Unit Testing**: Includes JUnit tests to verify the total sales calculation, the commission calculation, and the top agent determination.

---

## 📂 Question 1 File Structure

| File Name | Description |
| :--- | :--- |
| **`IEstateAgent.java`** | The interface defining the methods for Sales, Commission, and Top Agent. |
| **`EstateAgent.java`** | The logic class. It implements `IEstateAgent` and uses loops to calculate the totals and find the highest value. |
| **`Main.java`** | The main class. It holds the hardcoded 1D and 2D arrays, creates an `EstateAgent` object, and prints the formatted report using `System.out.printf()`. |
| **`EstateAgentTest.java`** | The JUnit test class verifying the Total Sales, Commission, and Top Agent methods. |

### 🚀 How to Run Question 1
1. Open the project in **NetBeans**.
2. Run the `Main.java` file. 
3. The output will print directly to the NetBeans console, matching the required report format exactly.

---

# Question 1: Console Application

## Question 1 Requirements

<div>
<img width="652" height="830" alt="Screenshot 2026-11-17 132533" src="https://github.com/user-attachments/assets/ac555f1d-b07a-449f-9fa6-b5608811f474" />

</div>

<br>

<div>
<img width="479" height="683" alt="Screenshot 2026-11-17 132555" src="https://github.com/user-attachments/assets/a124cff5-57d5-4893-a489-5ab8aaf24650" />

</div>

<br>

*(Note: The exam requires a 2D array for the sales data, a 2% commission calculation, and an interface called `IEstateAgent` with specific method signatures).*

---

## Question 1 Rubrics

<div>
<img width="746" height="457" alt="Screenshot 2026-11-17 132601" src="https://github.com/user-attachments/assets/33175ebd-c8c1-41a2-97ea-2e9a610846d3" />

</div>

<br>

<div>
<img width="731" height="415" alt="Screenshot 2026-11-17 132605" src="https://github.com/user-attachments/assets/f72cf998-cd29-434d-b718-18c0a6656974" />

</div>

<br>
---
