package practical.pkg5;

import java.util.Scanner;

public class P5Q2 {
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