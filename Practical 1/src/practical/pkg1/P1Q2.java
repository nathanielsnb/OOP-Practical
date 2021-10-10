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

public class P1Q2 {
    public static void main(String[] args) {
        final int MAX = 300;

	Scanner scanner = new Scanner(System.in);
	//Input
        System.out.print("--------------------Configuration: <Default>--------------------");
  	System.out.print("\nEnter Your age (years): ");
 	int ageYears = scanner.nextInt();

	// Process
	int ageDays = ageYears * 365;
	int ageSeconds= ageDays * 86400;

	// Output
	System.out.println("Age in years: " + ageYears + " years");
        System.out.println("Age in days: " + ageDays + " days" );
        System.out.println("Age in seconds: " + ageSeconds + " seconds" );
	System.out.println("\nProcess complete.");	
       }

}

