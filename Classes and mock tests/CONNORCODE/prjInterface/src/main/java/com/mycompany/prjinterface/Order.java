/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.prjinterface;

/**
 *
 * @author conno
 */
public interface Order {
    /*
    Difference between abstract classes and interfaces
    
    abstract classes - here is the foundation and add onto it
    interfaces - here is a contract you must follow
    (Any class that implements the interface MUST have these methods)
    
    Interface defiens the rules - no actual code into the interface
    Cannot create an object of the interface
    
     */
    
    public void setAmount(int intAmount);
    public void setPrice(double dblPrice);
    public double getTotal();
    

}
