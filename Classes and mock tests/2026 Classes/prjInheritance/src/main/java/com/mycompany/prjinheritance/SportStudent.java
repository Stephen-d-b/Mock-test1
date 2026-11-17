/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance;

/**
 *
 * @author Stephen D
 */
public class SportStudent extends Student { //extends is important **NB**
    
    //child class 1
    
    public SportStudent(String strName)
    {
        super(strName); //class parent class constructer pass the name to the parent
    }
    
    // own spesific method
    
    public String playSport()
    {
        return strName + " is playing soccer for the school team";
    }
    
}
