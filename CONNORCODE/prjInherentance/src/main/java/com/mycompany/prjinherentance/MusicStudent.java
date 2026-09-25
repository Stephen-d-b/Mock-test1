/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinherentance;

/**
 *
 * @author conno
 */
public class MusicStudent extends Student {

    public MusicStudent(String strName) {
        super(strName);
    }

    public String practiceInstrument() {
        return strName + " Is practing the congos";
    }

}
