/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mock2022q2;

import java.util.Scanner;

/**
 *
 * @author NLS - SMP
 */
public class Mock2022Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for input
        System.out.print("Enter the current staff number: ");
        int number = input.nextInt();
        input.nextLine();  // eat the leftover ENTER key

        System.out.print("Enter the staff hiring location: ");
        String location = input.nextLine();

        // Create object of subclass
        StaffHiring staff = new StaffHiring(number, location);

        // Print the report
        staff.printStaffHiring();

        input.close();
    }
}