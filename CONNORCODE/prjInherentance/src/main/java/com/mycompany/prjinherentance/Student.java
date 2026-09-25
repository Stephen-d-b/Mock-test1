/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinherentance;

/**
 *
 * @author conno
 */
public class Student {
    //Parent Class
    
    //Allows this class and child classes to access strName
    protected String strName;
    
    public Student(String strName) {
        this.strName = strName;
    }
    
    public String getName() {
        return strName;
    }
    
    //common methods for all students and they will be inherited by the child
    
    public String attendClass() {
        return strName + " is attending class";
    }
    
    public String submitAssignment() {
        return strName + " submitted an assignment";
    }
}
