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

public class CheckPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        // Prompt user to enter a password
        System.out.println("A password must be: ");
        System.out.println("-at least 7 characters");
        System.out.println("-consists of only letters and digits");
        System.out.println("-must contain at least one letter and at least one digit");
        System.out.print("\n Enter a password: ");

        String password= scan.nextLine();
        boolean valid = ?;

           // Trim spaces found in front or at the back of the password entered
           password = ?.trim? ;

           // Check for password length, must be at least 7 characters
           if (password.?() < 7)
                valid = ? ;
           else {
                  int countLetter = ?, countDigit = ? ;   // Count number of letters & digits in the string which mustn't zero

	for (int i = 0; i<password.?() && valid; i++ ) {        // valid is to check for any symbols
	    char ch = password.charAt(?);
                      if (Character.isLetter(?))    // To check for letter
	         count?++;
	    else if (Character.is?(?))    // To check for digit
          	         count?++;
                      else		              // To check for non-letter & non-digit
	         valid = ?;
                  }
	// Password is invalid if it is not at least one letter or one digit found
	if (count? == ? || count? == ? )
                     valid = ?;
             }
              // Display final message
              if (valid) 
	// Display valid password
                 System.out........
              else
	// Display invalid password
                 System.out........
               }
     }
