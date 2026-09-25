/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinsertionsort4;

import javax.swing.JOptionPane;
/**
 *
 * @author conno
 */
public class PrjInsertionSort4 {

    public static void main(String[] args) {
        
        /*
        skibidi ohio rizz
        
        Search a String array for a student number (2D array)
        */
        
        String[][] arrStudents = {{"ST105","Steve Jobless","55"}, 
                                                    {"ST123","Ohio Rizzler","85"},
                                                    {"ST67","Connor Van Heerden","67"}};
        
        String choice = JOptionPane.showInputDialog(null, "Press (1) to show all results else any other key for individual results: ");
        
        if (choice.equals("1")) {
            displayResults(arrStudents);
        } else {
            displayIndividual(arrStudents);
        }
        
        
        
    }
    
    public static void displayResults(String[][] arrStudents) {
        //insertion sort via the highest to lowest results tehehehhe
                int n = arrStudents.length;
                
        for (int pass = 1; pass < n; pass++) {
            String[] tempRow = arrStudents[pass];
            int tempMark = Integer.parseInt(tempRow[2]); // current mark as int
            int index = pass - 1;
            
            // Shift rows while the previous mark is smaller (for descending order)
            while (index >= 0 && Integer.parseInt(arrStudents[index][2]) < tempMark) {
                arrStudents[index + 1] = arrStudents[index];
                index--;
            }
            // Insert the current row into its correct position
            arrStudents[index + 1] = tempRow;
        }
        
        // Build output string
        StringBuilder sb = new StringBuilder();
        sb.append("Sorted Results (Highest to Lowest):\n\n");
        for (String[] row : arrStudents) {
            sb.append("\nStudent ID: ").append(row[0])
              .append("\nName: ").append(row[1])
              .append("\nMark: ").append(row[2])
              .append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
        
    }
    
    public static void displayIndividual(String[][] arrStudents){
        String input = JOptionPane.showInputDialog("Enter the Student ID you would like the result of (e.g. ST67):");
        boolean bFound = false;
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < arrStudents.length; row++)
        {
            if (input.equals(arrStudents[row][0])) {
                sb.append("Student Information:\n\n")
                .append("\nStudent ID: " + arrStudents[row][0])
                .append("\nName: " + arrStudents[row][1])
                .append("\nMark: " + arrStudents[row][2]);        
                bFound = true;
            } 
        }
        
        if (bFound == true) {
        JOptionPane.showMessageDialog(null, sb.toString());
        } else {
        JOptionPane.showMessageDialog(null,  "Error, No Student ID found :(");    
        }
    }
    
    
}

