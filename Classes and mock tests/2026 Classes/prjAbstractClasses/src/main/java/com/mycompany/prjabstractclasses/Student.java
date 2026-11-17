/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjabstractclasses;

/**
 *
 * @author Stephen D
 */
public abstract class Student { //NB add the abstract keyword
    
    // Abstract class=  blueprint for child classe
    // cannot create an object directly from an abstrac class

    // Abstract mehtods(no body, no implementaiotns)
    // The methods must be implemented in the child clas
    
    public abstract void setName(String strName);
    
    public abstract String getName();
    
    public abstract void setResult(double dblResult);
    
    public abstract double getResult();
    
    //Normal method(has body, already implemented) -  inherited by the child class
    
    public String getStatus()
    {
        return "This method ran inside the student class";
    }
            
    
    
}
