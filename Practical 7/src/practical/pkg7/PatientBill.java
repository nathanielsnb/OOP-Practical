package practical.pkg7;

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




