/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinherentance;

/**
 *
 * @author conno
 */
public class ArtStudent extends Student {
    
    public ArtStudent(String strName) {
        super(strName);
    }
    
    public String Painting() {
        return strName + " is painting right now";
    }
    
}
