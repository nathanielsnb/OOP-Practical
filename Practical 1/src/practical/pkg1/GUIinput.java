/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg1;

///import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nathaniel
 */
public class GUIinput {
 
    public static void main(String[] args) {
        //input
    
        String input = JOptionPane.showInputDialog("Enter Your Name: ");
        String string = JOptionPane.showInputDialog(null, "Enter your name: ", "Welcome", JOptionPane.QUESTION_MESSAGE);
                
        //output
        System.out.println("Welcome ");
        
    }
}
