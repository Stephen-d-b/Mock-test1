# PROG6112 - Exam Preparation Repository

Welcome to my PROG6112 Exam Preparation Repository! This repository contains my complete solutions, mock tests, and study materials for the Programming 1B exam. 

To make navigation easy, every exam year has its own dedicated folder containing everything needed to understand and run the code.

---

## 🚨 EXAM STRATEGY: How to Use This Repo During the Exam

Since this is an open-book exam and I have access to this repository, here is the exact strategy to follow:

1. **Read the Question Carefully:** Identify what the exam is asking for. Is it a GUI or a Console app? Does it need File I/O? Are there Unit Tests required?
2. **Use the Question Matchmaker (Below):** Find the exact question type in the list below and immediately jump to the matching past paper in this repo.
3. **Use it as a Guideline:** Copy the structure from the past paper, change the variable names, update the logic to match the new question, and ensure you include the required comments.
4. **Check the Cheat Sheet:** If you get stuck on syntax (like `printf` formatting, or `FileWriter` loops), use `Ctrl + F` on the `ProgCheetSheet` to find the exact code block you need.

---

## 🎯 The "Question Matchmaker" (If the exam asks for X, look at Y)

Here is a quick guide to finding the best template based on what the exam question is asking for:

*   **If they ask for a 2D Array with calculations (Total, Average, Max, Min):**
    *   👉 Look at `2025Exam/Q1` (Product Sales) or `2022Exam/Q2` (Property Prices).
*   **If they ask for an Interface and a Logic Class (OOP Chain):**
    *   👉 Look at `2025Exam/Q1` (IProduct), `2023Exam/Q1` (IEstateAgent), or `2024Exam/Q1` (IMovieTickets).
*   **If they ask for a GUI with Combo Boxes, Text Fields, and Menus (File/Tools):**
    *   👉 Look at `2023Exam/Q2` (Estate Agent) or `2024Exam/Q2` (Movie Tickets).
*   **If they ask for a GUI that saves to a `.txt` file and reads from it:**
    *   👉 Look at `2022Exam/Q3` (Travel Log) or `2025Exam/Q2` (Product Sales).
*   **If they ask to capture data into parallel 1D arrays (with a limit of 5):**
    *   👉 Look at `2022Exam/Q1` (Hospital Inspections).
*   **If they ask for specific JUnit Tests (like "Validation Test" or "CalculatesSuccessfully"):**
    *   👉 Look in the `test` package of `2023Exam/Q2` or `2024Exam/Q1`.
*   **If they ask for VAT or percentage calculations:**
    *   👉 Look at `2024Exam/Q2` (14% VAT) or `2023Exam/Q2` (Commission percentage).

---

## 🗺️ How to Navigate This Repository

Every exam folder (e.g., `2022Exam`, `2023Exam`, `2024Exam`, `2025Exam`) follows the exact same structure:

1. **The Code Folders (Q1, Q2, Q3):** Inside the year folder, you will find separate NetBeans projects for each question (e.g., `2022ExQ1`, `2022ExQ2`). These contain the complete, working source code and answers.
2. **The Year's `README.md` File:** Inside every year folder, there is a specific `README.md` file. This document explains what the exam question was asking for, lists the project structure, includes screenshots of the actual exam questions and rubrics, and explains how to run the code.
3. **The Cheat Sheet:** The `ProgCheetSheet` folder contains a comprehensive, searchable text-based cheat sheet covering all Java syntax, loops, arrays, GUI boilerplate, File I/O, and JUnit tests.

---

## 📂 Repository Contents

*   📁 **`2022Exam`** - Hospital Inspections (GUI Arrays), Property Prices (2D Arrays), Travel Log (GUI + File I/O).
*   📁 **`2023Exam`** - Estate Agents (Console + Interface), Estate Agents (GUI + File I/O).
*   📁 **`2024Exam`** - Movie Tickets (Console + Arrays), Movie Tickets (GUI + VAT Calculation + File I/O).
*   📁 **`2025Exam`** - Product Sales (Console + Interface), Product Sales (GUI + File I/O).
*   📁 **`ProgCheetSheet`** - The ultimate Java syntax reference guide.
*   📁 **`Classes and mock tests`** - Additional practice work and in-class exercises.

---

## 🚀 How to Run the Code

1. Open **Apache NetBeans**.
2. Go to `File` -> `Open Project`.
3. Navigate to the specific folder for the question you want to run (e.g., `2025Exam/2025ExQ1`).
4. Ensure the "Main Class" is set correctly (usually the GUI form or the `Main`/`QuestionX` class).
5. Click the **Run** button (or press `F6`).

---

## ⚠️ FINAL SUBMISSION CHECKLIST (Do not skip this!)

When you think you are done with the exam, do NOT just close the window. Run through this checklist before submitting:

1. **Did you comment your code?** (General Requirement: 3 marks)
   * Did you put your Name, Student Number, and Question Number at the top of every file?
   * Did you add comments explaining the logic?
2. **Did you test the app?**
   * Click every button. Does it crash?
   * Are the `.txt` files being generated in the project folder?
   * Do the JUnit tests pass with a green bar?
3. **The Exam Submission Document (MS Word / Notepad):**
   * Did you create the file named exactly: `StudentNumber_PROG6112_Exam.docx`?
   * Did you include the **link to your designated space** (e.g., the Azure Lab drive or your GitHub repo link)?
4. **LMS Upload:**
   * Did you upload the Word document to the correct submission link on Learn?
   * Double-check that the file actually finished uploading before you close your browser.

*Created for PROG6112 exam revision.*
