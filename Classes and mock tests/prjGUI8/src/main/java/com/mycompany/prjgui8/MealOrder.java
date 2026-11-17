/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjgui8;

/**
 *
 * @author tswan
 */
public class MealOrder implements IMealOrder{

    private static final double VAT = 0.15;
    private int numMeals;
    private double price;
    private String meal;

    public MealOrder(int numMeals, double price, String meal) {
        this.numMeals = numMeals;
        this.price = price;
        this.meal = meal;
    }
    
    @Override
    public double calculateTotal(int numMeals, double price) {
        
       double subTotal = numMeals*price;
       double vat = subTotal*VAT;
       return subTotal+vat;
        
    }

    @Override
    public boolean validateData(String meal, int NumMeals, double price) {
        
        if(meal==null || meal.isEmpty()){
            return false;
        }
        
        if(price <= 0){
            return false;
        }
        
        return numMeals > 0;
        
    }
    
    public double calcVAT(){
        return (numMeals*price)*VAT;
    }

    public int getNumMeals() {
        return numMeals;
    }

    public double getPrice() {
        return price;
    }

    public String getMeal() {
        return meal;
    }
    
    
    
}
