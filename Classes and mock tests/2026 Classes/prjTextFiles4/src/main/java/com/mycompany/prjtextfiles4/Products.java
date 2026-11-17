/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjtextfiles4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Stephen D
 */
public class Products implements IProducts{
    
    private static String[] strProductId = new String[3];
    private static String[] strProduct = new String[3];
    private static double[] dblCost = new double[3];
    
    @Override
    public String loadProducts()
    {
        try
        {
            int index = 0;
            
            BufferedReader br = new BufferedReader(new FileReader("products.txt"));
            String strCurrentLine;
            
            while((strCurrentLine = br.readLine()) != null)
            {
                strProductId[index] = strCurrentLine;
                strCurrentLine = br.readLine();
                strProduct[index] = strCurrentLine;
                strCurrentLine = br.readLine();
                dblCost[index] = Double.parseDouble(strCurrentLine);
                index += 1;
            }
            return "Products loaded Successfully";
        }
        catch(IOException io)
        {
            return "Errors";
        }
    }
    
    @Override
    public String searchProducts(String strSearchId)
    {
        String strDisplay = "";
        boolean blnFound = false;
        
        for (int index = 0; index < 3; index++) 
        {
            if(strSearchId.equals(strProduct[index]))
            {
                strDisplay += "PRODUCT ID: " + strProductId[index] + "\n" + "PRODUCT: " + strProduct[index] + "\n" + "PRICE: R" + dblCost[index];
                
                blnFound = true;
            }
        }
        
        if (blnFound)
        {
            return strDisplay;
        }
        else
        {
            return "Sorry, the produc ID you entered cannot be found";
        }
        
    }
    
    
}
