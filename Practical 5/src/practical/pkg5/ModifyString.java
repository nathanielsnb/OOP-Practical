/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg5;

/**
 *
 * @author Nathaniel
 */
  
import java.util.Scanner;

public class ModifyString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String newString = scan.nextLine();
        
        //convert to uppercase
        newString = newString.toUpperCase();
        
        //replace vowels to x
        newString = newString.replaceAll("A|E|I|O|U", "x");
        
        System.out.println("Modified string: "+ newString);
    }
}