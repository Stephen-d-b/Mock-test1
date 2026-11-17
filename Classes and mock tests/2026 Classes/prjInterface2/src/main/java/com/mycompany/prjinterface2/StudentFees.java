/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinterface2;

/**
 *
 * @author Stephen D
 */
public class StudentFees implements Student, StudentDetails {
    
    private double dblMonthlyFees = 0;
    private String strName, strCourse;
    
    public StudentFees(double dblMonthlyFees, String strName, String strCourse)
    {
        this.dblMonthlyFees = dblMonthlyFees;
        this.strCourse = strCourse;
        this.strName = strName;
    }
    
    @Override
    public double fulltime()
    {
        return dblMonthlyFees * 12;
    }
    
    @Override
    public double parttime()
    {
        return dblMonthlyFees * 6;
    }
    
    @Override
    public String getName()
    {
        return strName;
    }
    
    @Override
    public String getCourse()
    {
        return strCourse;
    }
    
    
    
}
