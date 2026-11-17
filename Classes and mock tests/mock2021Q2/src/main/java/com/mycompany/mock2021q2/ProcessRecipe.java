/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mock2021q2;

/**
 *
 * @author Stephen D
 */
public class ProcessRecipe extends Recipes {

    // Constructor
    public ProcessRecipe(String ingredients, int timeToMake, int difficulty) {
        super(ingredients, timeToMake, difficulty);
    }

    // Implement the abstract method from the interface
    @Override
    public void PrintRecipes() {
        System.out.println("........................................");
        System.out.println("INGREDIENTS: " + ingredients);
        System.out.println("TIME TO MAKE: " + timeToMake + " minutes");
        System.out.println("DIFFICULTY LEVEL: " + difficulty);
        System.out.println("........................................");
    }
}
