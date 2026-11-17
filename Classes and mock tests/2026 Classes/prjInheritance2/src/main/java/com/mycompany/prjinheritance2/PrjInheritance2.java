/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinheritance2;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjInheritance2 {

    public static void main(String[] args) {
        
        String strType = JOptionPane.showInputDialog(null, "Please enter employee type: \n -NORMAL EMPLOYEE\n" +
                                                     "2 OVERTIME EMPLOYEE");
        
        String strName = JOptionPane.showInputDialog(null, "Please enter Employee Name");
        
        
        double dblBaseSalary = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter Base salary"));
        
        
        //declare employ reference
        
        
        Employee emp;
        
        if(strType.equals("2"))
        {
            int intOvertimeHours = Integer.parseInt(JOptionPane.showInputDialog(null, "Please eneter overtime hours: "));
            double dblOvertimeRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Please eneter overtime rate per hour"));
            
            
            emp = new OvertimeEmployee(strName, dblBaseSalary, intOvertimeHours, dblOvertimeRate);
        }
        else
        {
            emp = new Employee(strName, dblBaseSalary);
        }
        
        JOptionPane.showMessageDialog(null, emp.getName() + "Total Pay: R" + emp.calculatePay());
    }
}
