/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg6;

import java.util.Objects;

/**
 *
 * @author Nathaniel
 */
public class Employee {
	private String name;
        private int yearJoined;
        private double basicSalary;
	
	public Employee() { 
	}
        
        public Employee(String name, int yearJoined, double basicSalary) {
        this.name = name;
        this.yearJoined = yearJoined;
        this.basicSalary = basicSalary;
	}

        public String getName() {
        return name;
        }

        public int getYearJoined() {
        return yearJoined;
        }

        public double getBasicSalary() {
        return basicSalary;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setYearJoined(int yearJoined) {
            this.yearJoined = yearJoined;
        }

        public void setBasicSalary(double basicSalary) {
            this.basicSalary = basicSalary;
        }
        
  	// use Alt-Insert to insert all the getters and setters

	public double calcMonthlySalary() {
            return this.basicSalary;
        }

	public String toString() {
            return  "Name: " + name + "\n"+
                    "YearJoined: " + yearJoined + "\n"+
                    "BasicSalary: " + String.format("%.2f",basicSalary) ;
        }


	public boolean equals(Object obj) {
            Employee temp = (Employee)obj;
            
	    if(temp.getName().equals(this.name))
	        return true;
	    else
	        return false;
            }
        }
    



