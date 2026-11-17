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


## 📋 Question 2 Project Overview

This is a Java GUI (Graphical User Interface) application designed to calculate and report the commission earned by an estate agent for the sale of a property. It captures user input, validates it, calculates the commission, displays the report on screen, and saves it to a text file.

### Features:
*   **GUI Form**: Built with Java Swing (JFrame) featuring a combo box for location selection, text fields for input, and a read-only text area for the report.
*   **Menu System**: Includes a File menu (Exit) and Tools menu (Process Report, Clear, Save Report).
*   **Data Processing**: Calculates commission by multiplying the property price by the commission percentage.
*   **Validation**: Validates user input (location and name cannot be empty, price and commission must be greater than 0).
*   **File I/O**: Saves the generated report to a text file named `report.txt`.
*   **Unit Testing**: Includes JUnit tests to verify the commission calculation (successful and unsuccessful) and validation logic.

---

## 📂 Question 2 File Structure

Here is a breakdown of the classes created for this solution:

| File Name | Description |
| :--- | :--- |
| **`Data.java`** | A helper data class used to carry the captured information (location, name, price, commission) to the validation method. |
| **`IEstateAgent.java`** | The interface containing the method signatures (`CalculateCommission` and `ValidateData`). |
| **`EstateAgent.java`** | The logic class. It implements `IEstateAgent` and contains the math for the commission calculation and the logic for validating input. |
| **`frmMain.java`** | The main GUI class (JFrame). It handles user interactions (menus), displays the results, handles file saving, and contains the `main` method. |
| **`EstateAgentQ2Test.java`** | The JUnit test class verifying that the commission calculation and validation methods work correctly. |

---

## 🚀 How to Run Question 2

1. Open the project in **NetBeans**.
2. Run the `frmMain.java` file (Shift + F6).
3. Select a location, enter an agent name (e.g., Joe Bloggs), a property price (e.g., 800000), and a commission percentage (e.g., 10).
4. Go to `Tools -> Process Report`. The GUI will display the formatted report.
5. Go to `Tools -> Save Report` to save the output to `report.txt` in your project folder.
6. Go to `Tools -> Clear` to reset the form, and `File -> Exit` to close the application.

---

## 🧪 How to Run the Unit Tests

1. Right-click on the `EstateAgentQ2Test.java` file.
2. Select **"Run File"** (or press Shift + F6).
3. The test results will appear in the output window. All three tests (Successful Calculation, Unsuccessful Calculation, and Validation) should pass.

---

## 📸 Question 2 Screenshots

<div>
  <img width="633" height="871" alt="Screenshot 2026-11-17 132744" src="https://github.com/user-attachments/assets/f8561eb6-582e-4808-913d-e7ef573b249b" />

</div>

<br>

<div>
  <img width="623" height="798" alt="Screenshot 2026-11-17 132750" src="https://github.com/user-attachments/assets/2310c45b-bbe0-4e58-98cc-66a7f5bc7e33" />

</div>

<br>

<div>
  <img width="600" height="776" alt="Screenshot 2026-11-17 132756" src="https://github.com/user-attachments/assets/dce97e30-80c7-43a9-adac-499fa8cd80b1" />

</div>

<br>

<div>
 <img width="617" height="650" alt="Screenshot 2026-11-17 132804" src="https://github.com/user-attachments/assets/900089f9-db37-4b52-ba5a-34de66b3782b" />

</div>

---

## Question 2 Rubrics

<div>
<img width="917" height="635" alt="Screenshot 2026-11-17 132809" src="https://github.com/user-attachments/assets/8c10d9a0-b193-429e-a565-77e75c03d0fb" />

</div>

<br>

<div>
<img width="919" height="575" alt="Screenshot 2026-11-17 132813" src="https://github.com/user-attachments/assets/13818411-6f2f-4742-86eb-42abd19965a6" />

</div>

<br>

<div>
<img width="956" height="385" alt="Screenshot 2026-11-17 132817" src="https://github.com/user-attachments/assets/ba1afbc0-b268-46d1-9735-e8c3cf301e38" />

</div>
