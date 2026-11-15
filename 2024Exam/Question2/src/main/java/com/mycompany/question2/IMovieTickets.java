/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.question2;

/**
 *
 * @author ricka
 */

// Q.2.8 - The interface required by the exam paper.
public interface IMovieTickets {
    // Q.2.7 - Calculates total ticket price (must include 14% VAT).
    double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice);

    // Q.2.7 - Validates the captured data (name not empty, tickets > 0, price > 0).
    boolean ValidateData(MovieTicketData movieTicketData);
}
