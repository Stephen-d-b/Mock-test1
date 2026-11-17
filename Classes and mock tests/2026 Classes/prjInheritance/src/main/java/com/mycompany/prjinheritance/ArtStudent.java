/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance;

/**
 *
 * @author Stephen D
 */
public class ArtStudent extends Student {
    
    //Child class 3
    
    public ArtStudent(String strName)
    {
        super(strName);
    }
    
    public String IsPainting()
    {
        return strName + " is painting a rainbow";
    }
    
}
