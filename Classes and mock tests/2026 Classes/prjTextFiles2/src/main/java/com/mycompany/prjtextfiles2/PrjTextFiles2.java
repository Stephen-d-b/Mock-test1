/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjtextfiles2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjTextFiles2 {

    private static String strUsername, strPassword, strConfirm;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter (1) to register or any other key to login a user: ");
        String strChoice = scan.nextLine();
        System.out.print("Enter Username: ");
        strUsername = scan.nextLine();
        System.out.print("Enter Password: ");
        strPassword = scan.nextLine();

        if (strChoice.equals("1")) {
            System.out.print("Confirm Password");
            strConfirm = scan.nextLine();
            registerUser();
        } else {
            login();
        }

    }

    private static void registerUser() {

        try {

            File saveFile = new File("contacts.txt");

            FileWriter fw = new FileWriter(saveFile.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(strUsername);
            bw.newLine();
            bw.write(strPassword);
            bw.newLine();
            bw.close();

            System.out.println("User registered");
        } catch (IOException io) {
            JOptionPane.showMessageDialog(null, "There was an error save to the text file");
        }

    }

    private static void login() {

        try {

            BufferedReader br = new BufferedReader(new FileReader("user.txt"));

            int count = 0;
            String currentLine = "";
            String currentUsername = "";
            String currentPassword = "";

            while ((currentLine = br.readLine()) != null) {//read till end of file null means no more lines or empty
                currentUsername = currentLine;//first line contains name
                currentLine = br.readLine();//next line contains sales ammount
                currentPassword = currentLine;

                if ((currentUsername.equals(strUsername)) && (currentPassword.equals(strPassword))) {
                    System.out.println("LOGIN SUCCESFULL");
                }
            }
        }
        catch(IOException io)
        {
            JOptionPane.showMessageDialog(null, "user not logged in");
        }
    }
}
