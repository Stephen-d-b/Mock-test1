/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjarrays6;

/**
 *
 * @author Stephen D
 */
public class StudentManger {
    
    private String[] strNames;
    private int[] intAges;
    private String[] strCourses;
    private double[] dblMarks;
    
    private int size;
    
    //hint: remember you do not know the size of the arrays in your POE
    
    //constructor set values
    
    public StudentManger(String[] strNames, int[] intAges, String[] strCourses, double[] dblMarks)
    {
        this.dblMarks = dblMarks;
        this.intAges = intAges;
        this.strCourses = strCourses;
        this.strNames = strNames;
        
        this.size = strNames.length;
    }
    
    public int Search(String strFind)
    {
        for(int i = 0; i < size; i++)
        {
            if(strNames[i] != null && strNames[i].equalsIgnoreCase(strFind))
            {
                return i;
            }
        }
        
        return -1;
    }
    
    public void updateMark(int i, double newMark)
    {
        dblMarks[i] = newMark;
    }
    
    
    public String display()
    {
        String strDisplay = "\n--- STUDENT LIST ---\n";
        
        for(int i = 0; i < size; i++)
        {
            strDisplay += getStudentDetails(i) + "\n";
        }
        
        return strDisplay;
    }
    
    public String getStudentDetails(int i)
    {
        return strNames[i] + " | " + intAges[i] + " | " + strCourses[i] + " | " + dblMarks[i] + " | ";
    }
}
