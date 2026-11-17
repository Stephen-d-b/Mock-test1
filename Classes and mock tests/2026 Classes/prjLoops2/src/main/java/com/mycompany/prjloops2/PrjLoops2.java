/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjloops2;

import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class PrjLoops2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int intChoice = -1;

        GradeResults gr = new GradeResults();

        while (intChoice != 0)
        {
            System.out.println("\n ---- Grade Checker Menu ----");
            System.out.println("1. Enter a mark");
            System.out.println("2. Show number of students who passed");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice: ");

            if (scan.hasNextInt()) {

                intChoice = scan.nextInt();

                switch (intChoice) {
                    case 1:

                        System.out.println("Enter the mark of the Students");
                        double dblMark = scan.nextDouble();

                        String strResult = gr.checkStatus(dblMark);

                        System.out.println("Numberof students that passed: " + strResult);
                        break;

                    case 2:

                        System.out.println("Enter the number of the Students who passed" + gr.getPasscount());
                        break;

                    case 0:

                        System.out.println("\nExiting Program");
                        break;

                    default:
                        System.out.println("invalid option try agian");

                }

            } else {
                System.out.println("\nInvalid Input. please enter a number.");
                scan.next();
                intChoice = -1;
            }

        }
        System.out.println("Programm endedd");
    }
}
