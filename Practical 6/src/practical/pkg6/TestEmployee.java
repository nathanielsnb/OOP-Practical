/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg6;

/**
 *
 * @author Nathaniel
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[3];

        // Declare objects for employee, commission employee and clerk
        empArray[0] = new Employee ("John Smith", 2015, 2500);
        empArray[1] = new CommissionEmployee ("Mike Jon", 2016, 2000, 100, 0.5);
        empArray[2] = new Clerk ("Mike Jon", 2015, 2040, 2000, 3);
        
        // Display object data fields
        printElements(empArray);

        // Compare the names of 2 objects
        System.out.println("Compare employee names of 2 objects (Employee & Commission Employee) : " + empArray[0].equals(empArray[1])); 
        System.out.println("Compare employee names of 2 objects ((Employee & Clerk) : " + empArray[0].equals(empArray[2])); 
        System.out.println("Compare employee names of 2 objects ((Commission Employee & Clerk) : " + empArray[1].equals(empArray[2])); 
}

public static void printElements(Employee[] eArray) {
      
    for (int i=0; i < eArray.length; i++ ) {
          // Print the type of employee
          if(eArray[i] instanceof Employee){
            System.out.println("\nType of employee is Employee");
          }
          else if(eArray[i] instanceof Clerk){
            System.out.println("Clerk\n=====");
          }
          else if(eArray[i] instanceof CommissionEmployee){
            System.out.println("Comission Employee\n==================");
          }

           // Print object data fields, use toString()
           System.out.println(eArray[i].toString());

           // Print calculated monthly salary
           System.out.printf("Monthly salary is RM%.2f", eArray[i].calcMonthlySalary());
           System.out.println("\n");
        }
    }
}