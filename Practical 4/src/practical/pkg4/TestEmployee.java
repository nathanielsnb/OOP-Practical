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
public class TestEmployee {
    public static void main(String[] args){
        Employee emp01 = new Employee("Ali Muhamad", 2500.00);

        System.out.println("Employee Name: " + emp01.getName(""));
        System.out.println("Employee Salary: " + emp01.getSalary());
        emp01.raiseSalary(8);
        System.out.println("New Salary: " + emp01.getSalary() + " for " +emp01.getName(""));

        Employee emp1 = new Employee("Jonathan", 2000);

        Employee emp2 = new Employee("Muthu");
        emp2.setSalary(3000.0);

        if(emp1.getSalary() > emp2.getSalary())
            System.out.println(emp1.getName("") + " Salary is greater than " + emp2.getName(""));
        else
            System.out.println(emp2.getName("") + " salary is greater than " + emp1.getName(""));

        System.out.println("Total Salary: " + (emp1.getSalary() + emp2.getSalary()));
    }
}

 