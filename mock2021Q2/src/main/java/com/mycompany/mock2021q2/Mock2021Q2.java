/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mock2021q2;

import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class Mock2021Q2 {

    public static void main(String[] args) {
         // 1. Create Scanner for console input
        Scanner input = new Scanner(System.in);

        // 2. Get input from the user
        System.out.print("Enter the ingredients: ");
        String ingredients = input.nextLine();

        System.out.print("Enter time to make (in minutes): ");
        int time = input.nextInt();

        System.out.print("Enter difficulty level: ");
        int difficulty = input.nextInt();

        input.close();

        // 3. Create the object and call the method
        ProcessRecipe recipe = new ProcessRecipe(ingredients, time, difficulty);
        recipe.PrintRecipes();
    }
}