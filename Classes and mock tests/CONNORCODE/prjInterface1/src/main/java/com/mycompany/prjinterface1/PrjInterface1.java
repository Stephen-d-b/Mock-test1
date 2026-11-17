/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinterface1;

import javax.swing.JOptionPane;

/**
 *
 * @author conno
 */
public class PrjInterface1 {

    public static void main(String[] args) {
        Circle newCircle = new Circle(67);
        Rectangle newRec = new Rectangle(67, 21);
        RectangularPrism RP = new RectangularPrism(67, 20, 20);
        
        JOptionPane.showMessageDialog(null, "Circle area: " + newCircle.getArea());
        JOptionPane.showMessageDialog(null, "Rectangle area: " + newRec.getArea());
        JOptionPane.showMessageDialog(null, "Rec Prism Area: " + RP.getArea());
    }
}
