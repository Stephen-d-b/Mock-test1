/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjloops4;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjLoops4 {

    public static void main(String[] args) {
        
        int intTeacherId;
        String strTeacherName;
        final int intQuit = 999;
        
        final int intTOTAL_MAIN_QUESTIONS = 3;
        final int intTOTAL_SUB_QUESTIONS = 5;
        
        intTeacherId = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter Teacher ID or " + intQuit + " To exit the Program"));
        
        while (intTeacherId != intQuit)
        {
            strTeacherName = JOptionPane.showInputDialog(null, "Please enter Teacher Name ");
            
            String strTestPaper = "Generating Tests Paper for " + strTeacherName + "\n\n";
            
            //nested For loop
            for (int intMainQuestion = 1; intMainQuestion <= intTOTAL_MAIN_QUESTIONS; intMainQuestion++)
            {
                strTestPaper += "Question " + intMainQuestion + "\n";
                
                for (int intSubQuestion = 1; intSubQuestion <= intTOTAL_SUB_QUESTIONS; intSubQuestion++ )
                {
                    strTestPaper += " " + intMainQuestion + "." + intSubQuestion + "________________________\n";
                }//endfor for sub
                strTestPaper += "\n";
            }//endfor for main questions
            JOptionPane.showMessageDialog(null, strTestPaper);
            
            //Next input
            intTeacherId = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter Teacher ID or " + intQuit + " To exit the Program"));
        
        }//endwhile  for sentinal loop
        
        JOptionPane.showMessageDialog(null, "Outside loop, program ended");
        
    }
}
