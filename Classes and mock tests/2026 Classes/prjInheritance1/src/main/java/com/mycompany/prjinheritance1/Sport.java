/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance1;

/**
 *
 * @author Stephen D
 */
public class Sport {
    
    
    final private double dblTennis = 500;
    final private double dblCricket = 300;
    final private double dblGolf = 750;
    final private double dblSoccer = 385;
    private String strSportEvent = "";
    
    public Sport (String strSportEvent)
    {
        this.strSportEvent = strSportEvent.toLowerCase();
    }
    
    public double getFee()
    {
        double dblFee = 0.0;
        
        if (strSportEvent.equals("tennis"))
        {
            dblFee = dblTennis;
        }
        if (strSportEvent.equals("cricket"))
        {
            dblFee = dblCricket;
        }
        if (strSportEvent.equals("golf"))
        {
            dblFee = dblGolf;
        }
        if (strSportEvent.equals("soccer"))
        {
            dblFee = dblSoccer;
        }
        
        return dblFee;
    }
}
