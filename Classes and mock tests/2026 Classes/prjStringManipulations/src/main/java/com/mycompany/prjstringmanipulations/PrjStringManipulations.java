/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjstringmanipulations;

import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class PrjStringManipulations {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Firstname");
        String name = scan.nextLine().trim();

        System.out.println("LastName");
        String surname = scan.nextLine().trim();

        if (name.length() < 2 || surname.length() < 2 ) {
            System.out.println("Name and Surname has to have atleast 2 characters");
        } else {

            String firstPart = name.substring(0, 2);
            String lastPart = surname.substring(surname.length() - 2);
            String username = firstPart + "_" + lastPart;
            System.out.println("Generated username is " + username);

        }
    }
}
