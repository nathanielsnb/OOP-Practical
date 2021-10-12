package practical.pkg7;

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

    public double getConsultFees() {
        return consultFees;
    }

    public void setConsultFees(double consultFees) {
        this.consultFees = consultFees;
    }

    public double calcTotalCharges() {
        return registerFees + consultFees;
    }
}

