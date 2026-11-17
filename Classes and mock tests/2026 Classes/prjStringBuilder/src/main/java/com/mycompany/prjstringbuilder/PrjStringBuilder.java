/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjstringbuilder;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjStringBuilder {

    public static void main(String[] args) {
        
//        // with normal strings, every + / += create a completely new string in memory
//        
//        String text = "A";
//        text = text + "B";
//        text = text + "C";
//        
//        String msg = "";
//        
//        for (int index = 0; index < 10000; index++)
//        {
//            msg += index;
//        }
//        
//        // Creating new String, coping old text, using extra memory and slowing performance
//        
//        StringBuilder sb = new StringBuilder();
//        
//        sb.append("A");
//        sb.append("B");
//        sb.append("C");
//        
//        // only ONE object is used and updated
//        for (int index = 0; index < 10000; index++)
//        {
//            sb.append(index);
//        }
//        System.out.println(sb.toString());
        
        /*
        
            Text is added to the same object
            less memory is used
            fewer objects are created
        
        */
        
        String strStudentName;
        String strInput;
        
        int intMark;
        int intTotal = 0;
        
        final int intNUM_TESTS = 3;
        
        strStudentName = JOptionPane.showInputDialog(null,"Please enter student name: ");
        
        StringBuilder sb = new StringBuilder();
        
        for (int intIndex = 1; intIndex <= intNUM_TESTS; intIndex++)
        {
            strInput =JOptionPane.showInputDialog(null, "Please enter mark for Test " + intIndex + ": ");
            
            intMark = Integer.parseInt(strInput);
            
            intTotal = intTotal + intMark;
            
            sb.append("Test ").append(intIndex).append(": ").append(intMark).append("\n");
        } // end for brackets
        
        Student stud = new Student(strStudentName, intTotal);
        
        stud.calcResults();
        
        sb.insert(0, "STUDENT REPORST \n\n");
        
        sb.append("\nStudent Name: ").append(stud.getStudentName());
        
        sb.append("\nTotal: ").append(stud.getTotal());
        
        sb.append("\nAverage: ").append(stud.getAverage());
        
        sb.append("\nResults: ").append(stud.getResult());
        
        JOptionPane.showMessageDialog(null, sb.toString());
    
    }
}
