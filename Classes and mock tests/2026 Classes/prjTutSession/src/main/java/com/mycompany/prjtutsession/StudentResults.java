/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjtutsession;

/**
 *
 * @author Vuyo
 */
public class StudentResults extends Student {

    public StudentResults(String strName, String strNumber, int[][] intMarks) {
        super(strName, strNumber, intMarks);
    }

    public String printReport() {
        String strReport = "Student Marks repor\n";
               
        strReport += "******************\n";

        strReport += "Student name: " + getName()
                + "\nStudent Number: " + getNumber();
        
        strReport += "\nMarks:\n\n";
        
        int[][] marks = getMarks();
        
        for (int row = 0; row < marks.length; row++) {
            
            for (int col = 0; col < marks[row].length; col++) {
                
                strReport += marks[row][col] + " ";
                
            }
            strReport += "\n";
        }
        
        strReport += "\nStudent mark Average: " + getAvg(marks) + "%";
        
        return strReport;
        
    }

}
