/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjabstractclasses;

/**
 *
 * @author conno
 */
public abstract class Student { //NB! add the abstract keyword
    
    // abstract class = blueprint for the child classes
    
    // cannot create an object directly from an abstract class
    
    // abstract methods (no body, no implementation) - they must be implemented in teh child class
    
    public abstract void setName(String strName);
    
    public abstract String getName();
    
    public abstract void setResult(double dblResult);
    
    public abstract double getResult();
    
    //Normal method allowed(has body, already implemented)
    // inherited by the child class
    
    public String getStatut() {
        return " this method ran inside the student class";
    }
    
}
