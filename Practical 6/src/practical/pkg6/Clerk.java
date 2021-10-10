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
public class Clerk extends Employee{
	private double allowance;
        private int overtimeHours;
	private static double overtimeRate = 5;
	
	public Clerk () { 
	}
        
        public Clerk(String name, int yearJoined, double basicSalary, double allowance, int overtimeHours) {
            super(name, yearJoined, basicSalary);
            this.allowance = allowance;
            this.overtimeHours = overtimeHours;
        }

  	// use Alt-Insert to insert all the getters and setters

        public double getAllowance() {
            return allowance;
        }

        public int getOvertimeHours() {
            return overtimeHours;
        }

        public static double getOvertimeRate() {
            return overtimeRate;
        }

        public void setAllowance(double allowance) {
            this.allowance = allowance;
        }

        public void setOvertimeHours(int overtimeHours) {
            this.overtimeHours = overtimeHours;
        }

        public static void setOvertimeRate(double overtimeRate) {
            Clerk.overtimeRate = overtimeRate;
        }
        
	public double calcMonthlySalary() {
            return super.calcMonthlySalary()+this.allowance+(this.overtimeHours*this.overtimeRate);
        }

	public String toString() {
            return super.toString()+"\n"+
                    "Allowance: " + String.format("%.2f",allowance) + "\n"+
                    "OvertimeHours: " + overtimeHours+ "\n"+
                    "Overtime Rates: "+ String.format("%.2f",overtimeRate);
        }

	public boolean equals(Object obj) {
            if(super.equals(obj)){
                return true;
            }
            else{
                return false;
            }
        }
    }

