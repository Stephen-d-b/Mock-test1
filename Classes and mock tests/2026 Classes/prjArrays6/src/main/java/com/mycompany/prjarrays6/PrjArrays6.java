/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjarrays6;

import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class PrjArrays6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int SIZE = 4;
        
        String[] strNames = new String[SIZE];
        int[] intAges = new int[SIZE];
        String[] strCourses = new String[SIZE];
        double[] dblMarks = new double[SIZE];
        
        System.out.println("--- ENTER STUDENT DATA ---");
        
        for(int i = 0; i < SIZE; i++)
        {
            System.out.println("\n--- Student "+ (i + 1) + "---");
            
            System.out.print("Name: ");
            strNames[i] = scan.nextLine();
            
            System.out.print("Age: ");
            intAges[i] = Integer.parseInt(scan.nextLine());
            
            System.out.print("Course: ");
            strCourses[i] = scan.nextLine();
            
            System.out.print("Marks: ");
            dblMarks[i] = Double.parseDouble(scan.nextLine());
        }
        
        StudentManger sm = new StudentManger(strNames, intAges, strCourses, dblMarks);
        
        System.out.println(sm.display());
        
        searchStudent(sm, scan);
        updateStudent(sm, scan);
        
    }

    private static void searchStudent(StudentManger sm, Scanner scan) {
        System.out.println("Search Name: ");  
        String strFind = scan.nextLine();
        
        int strSearch = sm.Search(strFind);
        
        if (strSearch != -1 )
        {
            System.out.println("Student found: " + sm.getStudentDetails(strSearch));
        }
        else 
        {
                System.out.println("Student not found");
        }
        
    }

    private static void updateStudent(StudentManger sm, Scanner scan) 
    {
        System.out.println("\nUpdate name: ");
        String strName = scan.nextLine();
        
        int strUpdate = sm.Search(strName);
        
        if(strUpdate != -1) 
        {
            System.out.println("Enter the New Mark: ");
            double newMark = Double.parseDouble(scan.nextLine());
            
            sm.updateMark(strUpdate, newMark);
        }
        else
        {
            System.out.println("Student was not found");
        }
    }
    

}
