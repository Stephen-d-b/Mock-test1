/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjifexample2;

/**
 *
 * @author Stephen D
 */
public class Student {
    private int intTest1;
    private int intTest2;
    private final int intTests =2;
    
    public Student(int intTest1, int intTest2)
    {
        this.intTest1 = intTest1;
        this.intTest2 = intTest2;
    }
    
    public double getAvg()
    {
        double dblAvg = (intTest1 + intTest2)/ intTests;
        return dblAvg;
    }
    
    public boolean isPassed(int intPassed)
    {
        return getAvg() >= intPassed;
         
   }
    
}
