/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjloops2;

/**
 *
 * @author Stephen D
 */
public class GradeResults {
    private int intPassCount = 0;
    
    public String checkStatus(double dblMark)
    {
        if (dblMark >= 50)
        {
            intPassCount++;
            return "PASS";
        } else 
        {
            return "FAIL";
        }
    }
    public int getPasscount()
    {
        return intPassCount;
    }
}
