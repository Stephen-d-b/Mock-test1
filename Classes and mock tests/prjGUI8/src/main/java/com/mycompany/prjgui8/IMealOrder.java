/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.prjgui8;

/**
 *
 * @author tswan
 */
public interface IMealOrder {
    double calculateTotal(int numMeals, double price);
    boolean validateData(String meal, int NumMeals, double price);
}
