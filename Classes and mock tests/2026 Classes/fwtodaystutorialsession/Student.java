/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.prjtestpractice;

/**
 *
 * @author Vuyo
 */
public abstract class Student implements iStudent{
    
    private String strName;
    private String strNumber;
    private int[][] intMarks;

    public Student(String strName, String strNumber, int[][] intMarks) {
        this.strName = strName;
        this.strNumber = strNumber;
        this.intMarks = intMarks;
    }
    
    @Override
    public String getName(){
       return strName; 
    }
    
    @Override
    public String getNumber(){
        return strNumber;
    }
    
    public int[][] getMarks(){//returnthe entire @d Array
        
        return intMarks;
        
    }
    
    public double getAvg(int[][] marks){
        
        double dblTotal = 0;
        int intCount = 0;
        
        for (int row = 0; row < marks.length; row++) {
            
            for (int col = 0; col < marks[row].length; col++) {
                
                dblTotal += marks[row][col];
                intCount++;
            }
            
        }
        
        return dblTotal/intCount;
        
    }
    
    

}
