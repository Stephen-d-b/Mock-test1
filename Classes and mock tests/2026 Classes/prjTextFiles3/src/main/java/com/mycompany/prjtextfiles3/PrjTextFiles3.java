/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjtextfiles3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Stephen D
 */
public class PrjTextFiles3 {

    public static void main(String[] args) {
        
        String[] arrEmp;
        String strRead = "";
        String strDelimiter = ",";
        int intId;
        String strName;
        double dblPayRate;
        double dblGross;
        final double hrsInWeek = 40;
        double dblTotal = 0;
        
        Path file = Paths.get("employees.txt");
        
        try
        {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            
            try(BufferedReader br = new BufferedReader(new InputStreamReader(input)))
            {
                strRead = br.readLine();
                
                while(strRead != null)
                {
                    arrEmp = strRead.split(strDelimiter);
                    
                    intId = Integer.parseInt(arrEmp[0]);
                    strName = arrEmp[1];
                    dblPayRate = Double.parseDouble(arrEmp[2]);
                    
                    dblGross = dblPayRate * hrsInWeek;
                    
                    System.out.println("ID: " + intId + " " +"\nName: " + strName + " " + "\nPay Rate: " + dblPayRate
                                        + " " + "\nGross: R" + dblGross);
                    
                    dblTotal += dblGross;
                    
                    //Read the next line from the file before end of loop
                    strRead = br.readLine();
                }
            }
        }
        catch (IOException io)
        {
            System.out.println("Error Message: " + io.toString());
        }
        
        System.out.println("\nTotal gross payroll is R" + dblTotal);
    }
}