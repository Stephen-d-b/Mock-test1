/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjclasses5;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjClasses5 {

    public static void main(String[] args) {
        String strHolder = JOptionPane.showInputDialog(null, "Please enter the name of the account holder: ");

        String strType = JOptionPane.showInputDialog(null, "Please enter the account type of: " + strHolder);

        double dblBalance = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the balance of the Account: "));

        BankAccount bank = new BankAccount();

        bank.setBalance(dblBalance);
        bank.setHolder(strHolder);
        bank.setType(strType);
        bank.addInterest();

        print(bank);
    }

    public static void print(BankAccount bank) {
        String strDisplay = "Bank account holder: " + bank.getHolder() + 
                            "\nThe Account Type: " + bank.getType() + 
                            "\nank Account Balance is: " + bank.getBalance();
         JOptionPane.showMessageDialog(null, strDisplay);
    }
}
