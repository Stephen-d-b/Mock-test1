/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjifexample5;

/**
 *
 * @author Stephen D
 */
public class Sign {

    private String strName;
    private String strWoodType;
    private String strCharColour;
    private int intFinalPrice;
    private int intChar;
    private int intCharPrice;
    
    private final int intBasePrice = 30;
    private final int intTotalChar = 6;

    public Sign(String strName, String strWoodType, String strCharColour, int intChar) {
        this.strName = strName;
        this.strWoodType = strWoodType;
        this.strCharColour = strCharColour;
        this.intFinalPrice = intBasePrice;
        this.intChar = intChar;
    }

    public void CalculatePrice() {
        if (strWoodType.equalsIgnoreCase("Oak")) {
            intFinalPrice += 15;
        } else {
            if (strWoodType.equalsIgnoreCase("Pine")) {
                intFinalPrice += 0;
            } else {
                intFinalPrice = 0;
            }
        }
    }

    public void CalculatePrice2() {
        if (strCharColour.equalsIgnoreCase("Black")) {
            intFinalPrice += 0;
        } else {
            if (strCharColour.equalsIgnoreCase("White")) {
                intFinalPrice += 0;
            } else {
                if (strCharColour.equalsIgnoreCase("Gold")) {
                    intFinalPrice += 12;
                } else {
                    intFinalPrice = 0;
                }
            }

        }
    }

    public void CalculatePrice3() {
        if (intTotalChar == intChar) {
            intFinalPrice += 0;
        } else {
            if (intTotalChar < intChar) {
                intCharPrice = (intChar - intTotalChar) * 3;
            }
            intFinalPrice = (intFinalPrice + intCharPrice);
        }

    }

    public String getName() {
        return strName;
    }

    public String getWoodType() {
        return strWoodType;
    }

    public String getCharColour() {
        return strCharColour;
    }

    public int getFinalPrice() {
        return intFinalPrice;
    }

    public int getintChar() {
        return intChar;
    }

}
