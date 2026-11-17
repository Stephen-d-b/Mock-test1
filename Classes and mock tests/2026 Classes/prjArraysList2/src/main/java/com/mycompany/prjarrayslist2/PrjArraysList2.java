/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjarrayslist2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjArraysList2 {

    private static ArrayList<String> customer = new ArrayList<>();
    private static ArrayList<String> product = new ArrayList<>();
    private static ArrayList<Double> price = new ArrayList<>();
    
    private static int count = 0;

    public static void main(String[] args) {
        
        Customer c = new Customer();        
        
       try{
          
           String input = JOptionPane.showInputDialog(null,"Enter amount");
           
           if (input == null){
               JOptionPane.showMessageDialog(null, "Goodbye");
               System.exit(0);
           }
           
           count = Integer.parseInt(input);
           
           
       }
       
       catch (NumberFormatException nex){
           
           JOptionPane.showMessageDialog(null, "Please only enter numbers");
        
    }
       
      input(count, c);
      display(count, c);
       
}

    private static void input(int count, Customer c) {
        
        for (int i = 0; i < count; i++){
            c.setName(JOptionPane.showInputDialog(null,"Please enter a customer name"));
            customer.add(c.getName());
            c.setPrice(Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter a Product Price")));
            
            price.add(c.getPrice());
            c.setProduct(JOptionPane.showInputDialog(null,"Please enter a Product Name"));
            product.add(c.getProduct());
        }
    }
    

    private static void display(int count, Customer c) {
        
        double dblTotal = 0.0;
        double dblAvg = 0.0;
        
        
        
        
        
        
        for (int i = 0; i < count; i++){
            
            dblTotal += price.get(i);
            
            JOptionPane.showMessageDialog(null, "Customer \n" + customer.get(i) +
                                                "\nPrice \n" + price.get(i) + 
                                                "\nProduct \n" + product.get(i));
            
        }
        
        dblAvg = dblTotal / count;
        JOptionPane.showMessageDialog(null, "\nAverage \n" + dblAvg +
                                            "\nTotal \n" + dblTotal);
    }
}

