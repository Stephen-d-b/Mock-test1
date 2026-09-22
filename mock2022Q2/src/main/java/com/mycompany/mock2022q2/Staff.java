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
 * Staff Abstract Class - the parent.
 * Holds staff number and location.
 * Implements IStaff interface.
 */
public abstract class Staff implements IStaff {

    private int staffNumber;
    private String staffLocation;

    // Constructor - accepts staff number and location
    public Staff(int staffNumber, String staffLocation) {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }

    // Getters from interface
    @Override
    public int getStaffNumber() {
        return staffNumber;
    }

    @Override
    public String getStaffLocation() {
        return staffLocation;
    }

    // Logic: hire staff if less than 20 at this store
    @Override
    public String getStaffHiringProcess() {
        if (staffNumber < 20) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
