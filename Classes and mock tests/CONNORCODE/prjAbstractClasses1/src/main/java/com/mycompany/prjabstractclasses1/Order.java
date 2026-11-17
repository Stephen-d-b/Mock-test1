/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjabstractclasses1;

/**
 *
 * @author conno
 */
public abstract class Order {
    //does not HAVE to be have abstract methods
    
    // an abstract class can have normal implemented methods, constructors etc, while still
    // preventing objets from being created
    
    private String strProduct;
    private double dblPrice;
    private int intQty;
    
    public Order(String strProduct, double dblPrice, int intQty) {
        this.strProduct = strProduct;
        this.dblPrice = dblPrice;
        this.intQty = intQty;
    }
    
    public double getTotalDue() {
        return (dblPrice * intQty);
    }
    
    public String printReport() {
        return "\nINVOICE \n" + "PRODUCT: " + strProduct + "\n" +
                "TOTAL DUE: R" + getTotalDue();
    }
    
}
