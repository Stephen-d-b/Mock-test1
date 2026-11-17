# 2022 Exam

## 📋 Question 1 Project Overview

This is a Java GUI application designed to capture and store hospital inspection details. It allows users to enter a hospital name, location, and the years since the last inspection. The data is saved to arrays (with a maximum limit of five records) and can be printed to a text area. 

### Features:
*   **GUI Form**: Built with Java Swing (JFrame) featuring text fields, a combo box, buttons, and a text area for output.
*   **Array Processing**: Saves input data into parallel arrays with a maximum capacity of 5 items.
*   **Validation**: Displays an error message if the user attempts to save a 6th inspection.
*   **Menu System**: Includes File -> Exit and Tools -> Save, Print, and Clear (which trigger the same logic as the buttons).

---

## 📂 Question 1 File Structure

| File Name | Description |
| :--- | :--- |
| **`frmHospital.java`** | The main GUI class (JFrame). It handles user interactions, manages the arrays, displays the report, validates the maximum limit, and contains the `main` method. |

---

## 🚀 How to Run Question 1

1. Open the project in **NetBeans**.
2. Run the `frmHospital.java` file.
3. Enter a hospital name and location, select the years since inspection, and click **SAVE**.
4. Click **PRINT** to see the data appear in the text area below.
5. Try saving more than 5 inspections to trigger the "Maximum inspection count reached!" error message.

---

## 📸 Question 1 Screenshots

<div>
  <img width="576" height="691" alt="Screenshot 2026-11-17 144139" src="https://github.com/user-attachments/assets/c76f48d2-f53c-4559-92ce-bfdefd447832" />

</div>

<br>

<div>
  <img width="604" height="688" alt="Screenshot 2026-11-17 144144" src="https://github.com/user-attachments/assets/845f94c7-f85c-4f35-a208-0520726dea8c" />

</div>

<br>

<div>
  <img width="586" height="740" alt="Screenshot 2026-11-17 144149" src="https://github.com/user-attachments/assets/95f0a203-8843-467f-a888-f06c5f16b6d4" />

</div>

<br>

---
## Question 1 Rubrics

<div>
<img width="567" height="830" alt="Screenshot 2026-11-17 144158" src="https://github.com/user-attachments/assets/0c51ee86-22b8-4594-87b4-cc5d390cf72b" />

</div>

<br>

<div>
<img width="573" height="178" alt="Screenshot 2026-11-17 144203" src="https://github.com/user-attachments/assets/50f82fc9-1e55-4b72-8a2b-77214a631ea8" />

</div>

<br>

## 📋 Question 2 Project Overview

This is a Java console application designed to process average property prices across three different provinces. It uses a two-dimensional array to store prices for three property types (Flat, Townhouse, House) and calculates the average property price for each province.

### Features:
*   **2D Array Processing**: Uses a single-dimensional array for province names and a two-dimensional array for the property prices.
*   **Calculations**: Calculates the total and average property prices per province.
*   **Formatted Output**: Utilizes `String.format()` and `System.out.printf()` to display the data in a clean, aligned table with comma-separated thousands (e.g., R 1,433,333).

---

## 📂 Question 2 File Structure

| File Name | Description |
| :--- | :--- |
| **`Question2.java`** | The main class. It holds the hardcoded 1D and 2D arrays, performs the average calculations, and prints the formatted report to the console. |

---

## 🚀 How to Run Question 2

1. Open the project in **NetBeans**.
2. Run the `Question2.java` file.
3. The output will print directly to the NetBeans console, matching the required report format exactly.

---
## 📸 Question 2 Screenshots

<div>
<img width="564" height="606" alt="Screenshot 2026-11-17 144414" src="https://github.com/user-attachments/assets/a5be29e0-db01-4515-a0fa-71b5c6c10ee4" />

</div>

<br>
---

## Question 2 Rubrics

<div>
<img width="581" height="544" alt="Screenshot 2026-11-17 144422" src="https://github.com/user-attachments/assets/88339ba6-0045-40e2-8e08-6b58bf3e12e2" />

</div>

<br>

## 📋 Question 3 Project Overview

This is a Java GUI application designed to capture travel information between two locations. It allows users to select a start location, end location, and travel type, validates the input to ensure the locations are different, and saves the data to a sequential text file.

### Features:
*   **GUI Form**: Built with Java Swing (JFrame) featuring three combo boxes, a submit button, and a text area to display the travel log.
*   **Validation**: Prevents the user from selecting the same start and end location. Displays a popup error message if they do.
*   **File I/O (Writing)**: Saves the travel information to `travel.txt` in a comma-separated format.
*   **File I/O (Reading)**: Reads the `travel.txt` file and populates the text area with the formatted travel log upon submission and application startup.

---

## 📂 Question 3 File Structure

| File Name | Description |
| :--- | :--- |
| **`frmTravel.java`** | The main GUI class (JFrame). It handles the dropdown selections, validates input, handles file reading/writing, and contains the `main` method. |
| **`travel.txt`** | The generated text file that stores the travel logs sequentially. |

---

## 🚀 How to Run Question 3

1. Open the project in **NetBeans**.
2. Run the `frmTravel.java` file.
3. Select a Start Location, End Location, and Travel Type. Click **SUBMIT**.
4. The travel log will appear in the text area, and a `travel.txt` file will be created in your project folder.
5. Try selecting the same location for Start and End. Click **SUBMIT**. The error message will pop up.

---

## 📸 Question 3 Screenshots

<div>
  <img width="587" height="743" alt="Screenshot 2026-11-17 144624" src="https://github.com/user-attachments/assets/d8f7dd30-58dc-4dce-972b-7bc82cdd9b6d" />

</div>

<br>

<div>
  <img width="610" height="565" alt="Screenshot 2026-11-17 144632" src="https://github.com/user-attachments/assets/df5ddc1a-2737-4d4e-a78b-d531697ae5d1" />

</div>

---
## Question 3 Rubrics

<div>
<img width="581" height="274" alt="Screenshot 2026-11-17 144637" src="https://github.com/user-attachments/assets/267dd121-ba62-49e2-8231-532ab2f3952b" />

</div>

<br>

<div>
<img width="551" height="365" alt="Screenshot 2026-11-17 144641" src="https://github.com/user-attachments/assets/a389f38d-11b6-4e9e-ab21-b26f841b0610" />

</div>

<br>

