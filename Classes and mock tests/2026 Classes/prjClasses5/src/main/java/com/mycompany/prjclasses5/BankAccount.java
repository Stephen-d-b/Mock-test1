/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjclasses5;

/**
 *
 * @author Stephen D
 */
public class BankAccount {

    private String strAccountHolder;
    private String strAccountType;
    private Double dblCurrentBalance;

    public void setHolder(String strHolder) {
        strAccountHolder = strHolder;
    }

    public String getHolder() {
        return strAccountHolder;
    }

    public void setType(String strType) {
        strAccountType = strType;
    }

    public String getType() {
        return strAccountType;
    }

    public void setBalance(Double dblBalance) {
        dblCurrentBalance = dblBalance;
    }

    public Double getBalance() {
        return dblCurrentBalance;
    }
    
    public void addInterest() {
        dblCurrentBalance = dblCurrentBalance + (dblCurrentBalance * 0.05);
    }
}

