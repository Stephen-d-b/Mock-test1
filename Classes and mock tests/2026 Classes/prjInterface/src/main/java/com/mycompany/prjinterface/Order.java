/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.prjinterface;

/**
 *
 * @author Stephen D
 */
public interface Order {

    // difference between abstract and interface
    
    // abstract classes here is the foundation to build on
    // interfaces contract here is a contract you must follow
    
    // interfaces defines the rules, any class that implements this interface
    // MUST  have these methods no actual code inside the interface
    // and cannot create an object of interface
    
    public void setAmount(int intAmound);
    public void setPrice (double dblPrice);
    public double getTotal();
    
    
}
