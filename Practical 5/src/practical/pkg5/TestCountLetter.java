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

public class TestCountLetter {
     public static void main(String[] args) {
           Scanner scn = new Scanner (System.in);
           
            // Prompt user to enter a string
           System.out.print("Enter a word: ");
           String word = scn.nextLine();
           
            // Prompt user to enter letter to count
            System.out.print("Enter the letter you want to count: ");
            
            char letter = scn.nextLine().charAt(0);    // To accept a single character

            int count = countLetter(word, letter);     //  Call the method to count the letter
            // Output
            System.out.println(word + " contains " + count + letter );
    }
}
