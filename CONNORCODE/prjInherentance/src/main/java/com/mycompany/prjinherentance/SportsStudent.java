/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinherentance;

/**
 *
 * @author conno
 */
public class SportsStudent extends Student {
    //child class 1
    
    public SportsStudent(String strName) {
        super(strName);
    }
    
    public String playSport() {
        return strName + " Is playing gundamStyle for the school team";          
    }
}
