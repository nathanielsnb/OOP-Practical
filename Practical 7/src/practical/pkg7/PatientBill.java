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
public abstract class PatientBill implements Comparable{
    protected int visitID;
    protected String name;
    protected static int lastAssignedID = 1001;
    
   protected PatientBill () {
   }

   protected PatientBill (String name) {
           this.name = name;
           visitID = lastAssignedID++;
   }

   // Insert getters and setters

   public abstract double calcTotalCharges();

    @Override
    public String toString() {
        return "PatientBill{" + "visitID=" + visitID + ", name=" + name + '}';
    }

    @Override
    public int compareTo(Object t) {
        PatientBill compareBill = (PatientBill)t;
        return this.name.compareTo(compareBill.name);
    }
  
    
}




