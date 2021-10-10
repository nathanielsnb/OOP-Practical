/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg4;

/**
 *
 * @author Nathaniel
 */
import java.util.Scanner;

public class TestCarRegistration {
    public static void main(String[] args) {
        
        CarType []carTypeArr = { new CarType("Toyota","Vios",1.5),
                            new CarType("Nissan","Teana",2.0),
                            new CarType("Honda","City",1.6)
                           };
        
        Registration []regArr = new Registration[1];
        
  	Scanner scanner = new Scanner(System.in);
  	
  	for (int i = 0; i < regArr.length; ++i) {

            System.out.println("\nRegistration number: " + Registration.getnextRegNo());

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("IC No : ");
            String ic = scanner.nextLine();

            Owner owner = new Owner(name,ic);

            System.out.print("Plate No: ");
            String plateNo = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Year: ");
            int year = scanner.nextInt();

            System.out.println("\nCar Types: ");

            for(int j = 0 ;j<carTypeArr.length ;j++){
                System.out.println( (j+1) + ". " + carTypeArr[j].toString() );
            }

            System.out.print("\nSelect car type [1 - " + carTypeArr.length + "]: ");
            int selection = scanner.nextInt();

            Car car = new Car(plateNo,color,year,carTypeArr[selection-1]);
           

            regArr[i] = new Registration(owner, car);
   
  
            scanner.nextLine();
  	}
  
        displayListing(regArr);
    }
  
    public static void displayListing(Registration[] regArr) {
  	System.out.printf("\n\n%57s\n", "Car Registration Listing");
  	System.out.printf("%-10s %-12s %-12s %-12s %-9s %-9s %-9s %-9s %9s\n", 
  		"Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
  	for (int i = 0; i < regArr.length; ++i) 
  		System.out.println(regArr[i]);
    }
}
