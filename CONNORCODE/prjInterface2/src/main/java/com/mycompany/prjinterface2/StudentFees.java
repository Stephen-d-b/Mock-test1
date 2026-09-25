/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinterface2;

/**
 *
 * @author conno
 */
public class StudentFees implements Student, StudentDetails { // bother interfaces
    private double dblMonthlyFees = 0;
    private String strName, strCourse;
    
    public StudentFees(double dblMonthlyFees, String strName, String strCourses) {
        this.dblMonthlyFees = dblMonthlyFees;
        this.strCourse = strCourses;
        this.strName = strName;
    }
    
    @Override
    public double fullTime() {
        return dblMonthlyFees * 12;
    }
    
    @Override
    public double partTime() {
        return dblMonthlyFees * 6;
    }
    
    @Override
    public String getName() {
        return strName;
    }
    
    @Override
    public String getCourse() {
        return strCourse;
    }
}
