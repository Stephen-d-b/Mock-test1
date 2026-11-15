/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.question1;

/**
 *
 * @author ricka
 */
// Q.1.2 - The interface required by the exam paper.
// It defines the contract: any class implementing this MUST provide these 2 methods.
public interface IMovieTicket {

    // Q.1.2 - Calculates the total sales for ONE movie across all months.
    // Takes an array of monthly sales and returns the sum.
    int TotalMovieSales(int[] movieTicketSales);

    // Q.1.2 - Determines the top performing movie.
    // Compares totalSales array and returns the movie name at the highest index.
    String TopMovie(String[] movies, int[] totalSales);
}
