/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjloops2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class prjLoops1 {
    public static Scanner scan = new Scanner(System.in);
    
    

    public static void main(String[] args) {
        double dblStudents;
        double dblResults;
        int intCurrentStudent;
        double dblAdd;
        
        
        dblStudents = 0;
        dblResults = 0;
        
        intCurrentStudent = 1;
        dblAdd = 0;
        
        System.out.println("Please enter the total amount of students");
        dblStudents = scan.nextInt();
        
        while(intCurrentStudent <= dblStudents)
        {
            System.out.println("Please enter the Result of the Student " );
            dblAdd = scan.nextDouble();
            dblResults = dblResults + dblAdd;
            intCurrentStudent = intCurrentStudent + 1;
        }
        
       DecimalFormat df = new DecimalFormat("#.00");
       Results result = new Results(dblStudents, dblResults);
       DisplayResults(scan, result, df);
    }
    
    private static void DisplayResults(Scanner scan, Results results, DecimalFormat df)    //(Farrel, J 2019)
    {
        System.out.println("Your average is mark for the class is: " + df.format(results.calculateAverage()));
    }
}
