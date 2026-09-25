/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjinheritance2;

import javax.swing.JOptionPane;

/**
 *
 * @author emeris
 */
public class PrjInheritance2 {

    public static void main(String[] args) {
        String strType = JOptionPane.showInputDialog(null,
                "Please enter employee type: "
                + "\n 1 - Normal Employee"
                + "\n 2 - Overtime Employee");

        String strName = JOptionPane.showInputDialog(null, "Enter "
                + "Employee name: ");

        double dblBaseSalary = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter"
                + " base salary"));

        Employee emp;

        if (strType.equals("2")) {
            int intOvertime = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Please enter overtime hours: "));

            double dblOvertimeRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter overtime rate per hour: "));

            emp = new OvertimeEmployee(strName, dblBaseSalary, intOvertime, dblOvertimeRate);
        } else {
            emp = new Employee(strName, dblBaseSalary);
        }
        
        JOptionPane.showMessageDialog(null, emp.getName() + " total pay: R" + emp.calculatePay());
    }
}
