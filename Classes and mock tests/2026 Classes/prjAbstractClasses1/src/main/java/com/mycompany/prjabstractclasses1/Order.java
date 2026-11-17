/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjabstractclasses1;

/**
 *
 * @author Stephen D
 */
public class Order {
    
    // does not mean you HAVE to have abstract methods
    
    //an abstract class can have normal implementation methods, constructor etc
    //while still prevneting objects from being created
    
    private String strProduct;
    private double dblPrice;
    private int intQty;
    
    public Order (String strProduct, double dblPrice, int intQty)
    {
        this.strProduct = strProduct;
        this.dblPrice = dblPrice;
        this.intQty = intQty;
    }
    
    public double getTotalDue()
    {
        return (dblPrice * intQty);
    }
    
    public String printReport()
    {
        return "\n INVOICE: \n" + "PRODUCT: " + strProduct + "\n" + "TOTAL DUE: R" + getTotalDue();
    }
    
}
