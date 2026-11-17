/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjtutsession;

import java.util.Scanner;

/**
 *
 * @author Vuyo
 */
public class PrjTestPractice {

    private static Scanner scan = new Scanner(System.in);
    private static final int rows = 2;
    private static final int cols = 2;

    public static void main(String[] args) {
        int intCout = 0;

        System.out.print("Enter student name here: ");
        String strName = scan.nextLine();

        System.out.print("Enter student number: ");
        String strNumber = scan.nextLine();

        int[][] intMarks =  new int[rows][cols];
        
        for (int row = 0; row < rows; row++) {
            
            for (int col = 0; col  < cols; col++) {
                
                intCout++;
                
                System.out.print("Enter student mark " +intCout +": ");
                intMarks[row][col] = Integer.parseInt(scan.nextLine());
                
            }
            
        }

        StudentResults sr = new StudentResults(strName, strNumber, intMarks);

       
        System.out.println("\n" + sr.printReport());

    }
}
