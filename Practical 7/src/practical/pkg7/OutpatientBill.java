/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg7;

/**
 *
 * @author Nathaniel
 */
public class OutpatientBill extends PatientBill {
     private static double registerFees = 30.00;
     private double consultFees;

     public OutpatientBill() {
     }

     public OutpatientBill(String name, double fees) {
             super(name);
             consultFees = fees;
     }

   public static double getRegisterFees() {
         return registerFees;
   }

    // Insert getters and setters
    public double getConsultFees() {
        return consultFees;
    }

    public void setConsultFees(double consultFees) {
        this.consultFees = consultFees;
    }

    
     @Override
    public double calcTotalCharges() {
        return registerFees + consultFees;
    }
}

