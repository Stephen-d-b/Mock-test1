/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question1;

/**
 *
 * @author ricka
 */
public class Question1 {
    // Q.1.1 - The main class that displays the movie report.
    // This is where all the printing and array population happens.
    public static void main(String[] args) {

        // Q.1.1 - 1D array for movie names (single-dimensional array).
        String[] movies = {"Napoleon", "Oppenheimer"};

        // Q.1.1 - 2D array for ticket sales.
        // Rows = movies, Columns = months (Jan, Feb, Mar).
        // Row 0: Napoleon -> [Jan=3000, Feb=1500, Mar=1700]
        // Row 1: Oppenheimer -> [Jan=3500, Feb=1200, Mar=1600]
        int[][] salesData = {
            {3000, 1500, 1700},
            {3500, 1200, 1600}
        };

        // Q.1.2 - Create an instance of MovieTickets to use its methods.
        MovieTicket mt = new MovieTicket();

        // Q.1.1 - Stores the total sales for each movie (to be used by TopMovie later)
        int[] totalSalesPerMovie = new int[movies.length];

        // Q.1.1 - Print the report header (as shown in the sample screenshot)
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println("--------------------------------");
        System.out.printf("%-15s %5s %5s %5s\n", "", "JAN", "FEB", "MAR");

        // Q.1.1 - Loop through each movie and print its row of monthly sales.
        // Also calculates the total sales for that movie using the interface method.
        for (int i = 0; i < movies.length; i++) {
            System.out.printf("%-15s %5d %5d %5d\n",
                    movies[i],             // Movie name
                    salesData[i][0],       // Jan sales
                    salesData[i][1],       // Feb sales
                    salesData[i][2]);      // Mar sales

            // Q.1.2 - Use the TotalMovieSales method to compute each movie's total
            totalSalesPerMovie[i] = mt.TotalMovieSales(salesData[i]);
        }

        // Q.1.1 - Print the total sales for each movie (as per the sample output)
        for (int i = 0; i < movies.length; i++) {
            System.out.println("Total movie ticket sales for " + movies[i] + " : " + totalSalesPerMovie[i]);
        }

        // Q.1.1 - Display the top performing movie using the TopMovie method
        System.out.println("Top performing movie: " + mt.TopMovie(movies, totalSalesPerMovie));
    }
}

