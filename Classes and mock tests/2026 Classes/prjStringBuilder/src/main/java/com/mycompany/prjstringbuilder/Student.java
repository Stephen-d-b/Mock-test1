/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjstringbuilder;

/**
 *
 * @author Stephen D
 */
public class Student {
    
    private String strStudentName;
    private int intTotal;
    private int intAverage;
    private String strResult;
    
    public Student(String strStudentName, int intTotal)
    {
        this.strStudentName = strStudentName;
        this.intTotal = intTotal;   
    
    }
    
    //method to calculate avg and result
    public void calcResults()
    {
        intAverage = intTotal / 3;
        
        
        if(intAverage >= 50)
        {
            strResult = "PASS";
        }
        else
        {
            strResult = "FALSE";
        }
    }
    
    public String getStudentName()
    {
        return strStudentName;
    }    
    
    public int getTotal()
    {
        return intTotal;
    }
    
    public int getAverage()
    {
        return intAverage;
    }
    
    public String getResult()
    {
        return strResult;
    }

}
