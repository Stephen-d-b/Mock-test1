/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

/**
 *
 * @author ricka
 */

// Q.2.7 - Class implementing the interface with calculation and validation logic.
public class MovieTickets implements IMovieTickets {

    // Q.2.4 - Calculates the total price INCLUDING 14% VAT.
    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        double subtotal = numberOfTickets * ticketPrice;
        double vat = subtotal * 0.14; // 14% VAT amount
        return subtotal + vat;
    }

    // Q.2.7 - Validates the captured ticket data against the exam's rules.
    @Override
    public boolean ValidateData(MovieTicketData data) {
        // Rule 1: Movie name cannot be empty
        if (data.movieName == null || data.movieName.trim().isEmpty()) return false;
        // Rule 2: Number of tickets must be greater than 0
        if (data.numberOfTickets <= 0) return false;
        // Rule 3: Ticket price must be greater than 0
        if (data.ticketPrice <= 0) return false;
        
        return true; // All checks passed
    }
}
