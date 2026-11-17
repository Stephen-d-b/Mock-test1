/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjbinary;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjBinary {

    // Validate binary input
    public static boolean isValidBinary(String binary) {
        if (binary == null || binary.isEmpty()) {
            return false;
        }

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) != '0' && binary.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    // Binary → Decimal
    public static long binaryToDecimal(String binary) {
        long decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }

        return decimal;
    }

    // Decimal → Binary
    public static String decimalToBinary(long decimal) {
        return Long.toBinaryString(decimal);
    }

    public static void main(String[] args) {

        String choice = JOptionPane.showInputDialog(
                "Choose conversion:\n1. Binary to Decimal\n2. Decimal to Binary");

        if (choice == null) return;

        switch (choice) {

            case "1": // Binary → Decimal
                String binary = JOptionPane.showInputDialog("Enter a binary number:");

                if (!isValidBinary(binary)) {
                    JOptionPane.showMessageDialog(null, "Invalid binary number. Only 0 and 1 allowed.");
                    return;
                }

                long decimal = binaryToDecimal(binary);
                JOptionPane.showMessageDialog(null, "Decimal equivalent: " + decimal);
                break;

            case "2": // Decimal → Binary
                String input = JOptionPane.showInputDialog("Enter a decimal number:");

                try {
                    long dec = Long.parseLong(input);
                    String result = decimalToBinary(dec);
                    JOptionPane.showMessageDialog(null, "Binary equivalent: " + result);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid decimal number.");
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid choice.");
        }
    }
}
