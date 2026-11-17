/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjforloops2;

import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class PrjForLoops2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //input 3 student numbers
        for(int intIndex = 1; intIndex <= 3; intIndex++)
        {
            System.out.println("Enter student number for student " + intIndex + ":");
            int intStudentNum = scan.nextInt();
            
            Student stud = new Student(intStudentNum);
            
            System.out.println("Welcome, Student #" + stud.getStudentNum());
            
        }
        
    }
}
