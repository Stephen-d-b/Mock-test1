/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjabstractclasses;

/**
 *
 * @author conno
 */
public class StudentResult extends Student {

    private String strName;
    private Double dblResult;

    //concrete child class
    // implementation of the abstract methods
    @Override
    public void setName(String strName) {
        this.strName = strName;
    }

    @Override
    public String getName() {
        return strName;
    }

    @Override
    public void setResult(double dblResult) {
        this.dblResult = dblResult;
    }

    @Override
    public double getResult() {
        return dblResult;
    }

    //Normal methods, new methods created in the child class are allowed
    public double getNewResult() {
        return dblResult += dblResult * 0.15;
    }

}
