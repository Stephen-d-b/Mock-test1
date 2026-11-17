/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjclasses6;

/**
 *
 * @author Stephen D
 */
public class Doctor {
    
    private String strDoctor, strPatient;
    private double dblFee;
    private int intConsultations;
    
    public Doctor(String strDoctorName, String strPatientName, double dblConsultationFee, int intNumConsoltations)
    {
        strDoctor = strDoctorName;
        strPatient = strPatientName;
        dblFee = dblConsultationFee;
        intConsultations = intNumConsoltations;
    }
    
    public String getDoctor()
    {
       return strDoctor;        
    }

    public String getPatient()
    {
        return strPatient;
    }
    
    public double getTotalDue()
    {
        return (dblFee * intConsultations);
    }
    
}
