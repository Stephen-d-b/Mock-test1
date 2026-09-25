/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheretence;

/**
 *
 * @author conno
 */
public class Sports {

    final private double dblTennis = 500;
    final private double dblCricket = 360;
    final private double dblGolf = 750;
    final private double dblSoccer = 385;
    private String strSportEvent = "";

    public Sports(String strSportEvent) {
        this.strSportEvent = strSportEvent;
    }

    public double getFee() {
        double dblFee = 0.0;

        if (strSportEvent.equals("Tennis")) {
            dblFee = dblTennis;
        }
        if (strSportEvent.equals("Cricket")) {
            dblFee = dblCricket;
        }
        if (strSportEvent.equals("Golf")){
            dblFee = dblGolf;
        }
        if (strSportEvent.equals("Soccer")){
            dblFee = dblSoccer;
        }
        
        return dblFee;

    }
}
