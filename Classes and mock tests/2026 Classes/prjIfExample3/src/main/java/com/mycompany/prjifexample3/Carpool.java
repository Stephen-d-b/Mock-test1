/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjifexample3;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class Carpool {

    private String strEmpTown;
    private final String strMessage = "You can cpl";

    public Carpool(String strEmpTown) {
        this.strEmpTown = strEmpTown;
    }

    public String checkCarpool() {
        String strResult = "";

        if (strEmpTown.equals("woodstock")) {
            strResult = strMessage;
        } else if (strEmpTown.equals("wonderlake")) {
            strResult = strMessage;
        } else if (!strMessage.equals("")) {
            JOptionPane.showMessageDialog(null, strMessage);
        }
        return strResult;
    
}
