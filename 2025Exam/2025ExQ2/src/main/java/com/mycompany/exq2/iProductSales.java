/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.exq2;

/**
 *
 * @author NLS - SMP
 */


/*
 * Interface iProductSales
 * This is the contract that the ProductSales class must follow.
 */
public interface iProductSales {
    
    int[][] GetProductSales();
    
    int GetTotalSales();
    
    int GetSalesOverLimit();
    
    int GetSalesUnderLimit();
    
    int GetProductsProcessed();
    
    double GetAverageSales();
    
}
