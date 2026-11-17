/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjifexample4;

/**
 *
 * @author Stephen D
 */
public class Sundae {

    private String strName;
    private String strSize;
    private final int intBasePrice = 20;
    private int intFinalPrice;

    public Sundae(String strName, String strSize) {
        this.strName = strName;
        this.strSize = strSize;
        this.intFinalPrice = intBasePrice;
    }

    public void CalculatePrice() {
        if (strSize.equalsIgnoreCase("small")) {
            intFinalPrice += 5;
        } else {
            if (strSize.equalsIgnoreCase("medium")) 
            {
                intFinalPrice += 10;
            } else {
                if (strSize.equalsIgnoreCase("Large"))
                {
                    intFinalPrice += 20;
                } else {
                    intFinalPrice = 0;
                }
            }
            
        }
    }
    public String getName()
    {
        return strName;
    }
    public String getSize()
    {
        return strSize;
    }
    public int getFinalPrice()
    {
        return intFinalPrice;
    }

}
