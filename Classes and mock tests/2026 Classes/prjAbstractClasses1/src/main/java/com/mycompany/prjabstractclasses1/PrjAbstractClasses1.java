/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjabstractclasses1;

import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class PrjAbstractClasses1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter product name: ");
        String strProduct = scan.next();
        System.out.print("Please enter product price: ");
        Double dblPrice = Double.parseDouble(scan.next());
        System.out.print("Please enter quanitity: ");
        int intQty = Integer.parseInt(scan.next());
        
        ProcessOrder po = new ProcessOrder(strProduct, dblPrice, intQty);
        
        System.out.println(po.printReport());

    }
}
