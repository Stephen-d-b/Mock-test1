/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mock2022q2;

/**
 *
 * @author NLS - SMP
 */

/*
 * StaffHiring Subclass - extends Staff.
 * Adds printStaffHiring() method that prints the report.
 */
public class StaffHiring extends Staff {

    // Constructor - passes values to parent
    public StaffHiring(int staffNumber, String staffLocation) {
        super(staffNumber, staffLocation);
    }

    // Prints the hiring report matching sample output
    public void printStaffHiring() {
        System.out.println("STAFF HIRING REPORT");
        System.out.println("***************************");
        System.out.println("LOCATION: " + getStaffLocation());
        System.out.println("STAFF NUMBER: " + getStaffNumber());
        System.out.println("HIRE STAFF: " + getStaffHiringProcess());
    }
}