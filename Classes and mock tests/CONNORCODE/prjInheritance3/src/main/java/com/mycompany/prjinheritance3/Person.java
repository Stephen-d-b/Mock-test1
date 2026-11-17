/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance3;

/**
 *
 * @author emeris
 */
public class Person {
    // parent class
    private int intID;
    private String strName;
    
    public Person(int intID, String strName) {
        this.intID = intID;
        this.strName = strName;
    }
    
    public int getID() {
        return intID;
    }
    
    public String getName() {
        return strName;
    }
    
    public String display() {
        return intID + " " + strName;
    }
    
    public final String dontChangeMe() {
        return "I am a special method that cannot be overriden";
    }
}
