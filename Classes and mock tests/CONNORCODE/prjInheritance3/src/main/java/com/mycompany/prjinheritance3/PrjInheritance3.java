/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjinheritance3;

import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class PrjInheritance3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your ID: ");
        int intID = scan.nextInt();

        System.out.print("Enter your Name: ");
        String strName = scan.nextLine();

        System.out.print("Enter your Salary: ");
        Double dblSalary = scan.nextDouble();

        Person emp = new Person(intID, strName);
        System.out.println(emp.display());

        EmpA empA = new EmpA(intID, strName, dblSalary);
        System.out.println(empA.display());
        
        EmpB empB = new EmpB(intID, strName, dblSalary);
        System.out.println(empB.display());
        
    }
}
