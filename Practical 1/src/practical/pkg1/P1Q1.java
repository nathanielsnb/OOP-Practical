package practical.pkg1;

import java.util.Scanner;
public class P1Q1 {

    public static void main(String[] args) {
        
        //input
        System.out.print("Enter Your Name: ");
        Scanner input = new Scanner(System.in); 
        String name = input.nextLine();
        
        System.out.print("\nEnter Your Year of Study: ");
        Scanner scanner = new Scanner(System.in);
        int intValue = scanner.nextInt();         

        System.out.print("\nWhat is your targer GPA for this semester?: ");
        double doubleValue = scanner.nextDouble();  

        //output
        System.out.println("\nWelcome " + name + "!");
        System.out.println("Work hard to achieve your target GPA of " + doubleValue + " this semester of your Year " + intValue);
    }
    
}
