/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1;

/**
 *
 * @author ricka
 */
// Q.1.2 - The class that implements the interface.
// It contains the logic for calculating totals and finding the top movie.
public class MovieTicket implements IMovieTicket {

    // Q.1.2 - Calculates the total sales for a single movie.
    // Loops through each month's sales and adds them together.
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0; // Accumulator starts at 0
        for (int sales : movieTicketSales) {
            total += sales; // Add each month's sales to the running total
        }
        return total; // Return the final sum
    }

    // Q.1.2 - Finds the movie with the highest total sales.
    // Assumes the first movie is the top, then checks if any other movie beats it.
    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        int maxSales = totalSales[0];       // Assume first movie is top
        String topMovie = movies[0];        // Store its name

        for (int i = 1; i < totalSales.length; i++) { // Start from second movie
            if (totalSales[i] > maxSales) {           // If a movie has MORE sales...
                maxSales = totalSales[i];             // ...update the max
                topMovie = movies[i];                 // ...and remember its name
            }
        }
        return topMovie; // Return the movie that had the highest sales
    }
}
