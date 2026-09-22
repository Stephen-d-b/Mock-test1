/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mock2024q2;

import java.util.Scanner;

/**
 *
 * @author NLS - SMP
 */
public class Mock2024Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the accident vehicle type: ");
        String vType = input.nextLine();

        System.out.print("Enter the city for the vehicle accidents: ");
        String city = input.nextLine();

        System.out.print("Enter the total car accidents for " + city + ": ");
        int total = input.nextInt();

        // Create object of the subclass
        RoadAccidentReport report = new RoadAccidentReport(vType, city, total);
        
        // Call the print method
        report.printAccidentReport();

        input.close();
    }
}

