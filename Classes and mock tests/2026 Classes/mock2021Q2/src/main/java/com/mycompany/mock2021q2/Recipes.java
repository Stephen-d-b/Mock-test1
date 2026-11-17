/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mock2021q2;

/**
 *
 * @author Stephen D
 */
public abstract class Recipes implements IRecipes {

    protected String ingredients;
    protected int timeToMake;
    protected int difficulty;

    // Constructor
    public Recipes(String ingredients, int timeToMake, int difficulty) {
        this.ingredients = ingredients;
        this.timeToMake = timeToMake;
        this.difficulty = difficulty;
    }

    // Getters
    public String getIngredients() { return ingredients; }
    public int getTimeToMake()     { return timeToMake; }
    public int getDifficulty()     { return difficulty; }

    // PrintRecipes() is inherited from IRecipes and stays abstract
}
