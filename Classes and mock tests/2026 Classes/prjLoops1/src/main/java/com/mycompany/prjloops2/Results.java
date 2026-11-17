/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjloops2;

/**
 *
 * @author Stephen D
 */
public class Results {
    double dblStudents;
    double dblTotalResults;
    
    public Results(double dblStudents, double dblTotalResults)
    {
        this.dblStudents = dblStudents; 
        this.dblTotalResults = dblTotalResults;
    }

    
    
    public double calculateAverage()
    {
        return dblTotalResults/dblStudents;
    }
}
