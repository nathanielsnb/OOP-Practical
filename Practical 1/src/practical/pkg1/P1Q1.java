/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg1;

/**
 *
 * @author Nathaniel
 */
import java.util.Scanner;
public class P1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //input
        System.out.print("Enter Your Name: ");
        Scanner input = new Scanner(System.in); 
        String name = input.nextLine();
        
        System.out.print("Enter Your Year of Study: ");
        Scanner scanner = new Scanner(System.in);
        int intValue = scanner.nextInt();         

        System.out.print("What is your targer GPA for this semester?: ");
        double doubleValue = scanner.nextDouble();  

        //output
        System.out.println("Welcome " + name + "!");
        System.out.println("Work hard to achieve your target GPA of " + doubleValue + " this semester of your Year " + intValue);
    }
    
}
