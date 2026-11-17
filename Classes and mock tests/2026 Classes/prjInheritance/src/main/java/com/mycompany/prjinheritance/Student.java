/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance;

/**
 *
 * @author Stephen D
 */
public class Student {
    
    
    //parent class
    
    //Allows this class and the child classes to access strName
    
    protected String strName;
    
    public Student(String strName)
    {
        this.strName = strName;
    }
    
    public String getName()
    {
        return strName;
    }
    
    // common methods for all students and will be inherited by child classes
    
    public String attendClass()
    {
        return strName + " is attending class";
    }
    
    public String submitAssignemnt()
    {
        return strName + " submitted an assignment";
    }
    
    
}
