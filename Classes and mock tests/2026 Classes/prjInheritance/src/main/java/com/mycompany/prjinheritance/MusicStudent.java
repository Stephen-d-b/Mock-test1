/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance;

/**
 *
 * @author Stephen D
 */
public class MusicStudent extends Student {
    
    //child class 2
    
    public MusicStudent(String strName)
    {
        super(strName);
    }
    
    public String practiceInstrument()
    {
        return strName + " is playing piano";
    }
    
}
