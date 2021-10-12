package practical.pkg7;

public class PatientBillDriver {
     public static void main(String[] args) {
          PatientBill[] bills = new PatientBill[4];
          bills[0] = new OutpatientBill("Zoe Smith", 30.00);
          bills[1] = new OutpatientBill("Andy Lau", 50.00);
          bills[2] = new InpatientBill("Mary Yan", 500.00, 50.00, 'S', 8);
          bills[3] = new InpatientBill("Jack Burton", 200.00, 35.00, 'P', 10);


        System.out.println(bills[0].compareTo(bills[1]));
        selectionSort(bills);
         
        for (PatientBill p : bills) {
            System.out.print("\nPatient's Bill Information\n===========================\n");
            System.out.println(p.toString()+ "\n" + "Total Charges: RM " + p.calcTotalCharges() + "\n");
        }
        
        System.out.println("\nTotal Collection Fees: RM " + computeTotalCollection(bills));
    }
    
    public static double computeTotalCollection(PatientBill [] p){
      double total=0;
      for (PatientBill pList : p) {
          total+=pList.calcTotalCharges();
      }
      return total;
    }
    
    public static PatientBill[] selectionSort(PatientBill[] arr) {
      for (int i = 0; i < arr.length; ++i) {
        int indexOfSmallest = i;	

        for (int j = i+1; j < arr.length; ++j) {
            if (arr[j].compareTo(arr[indexOfSmallest]) < 0) 
                    indexOfSmallest = j;	
         }

        PatientBill tempArr = arr[indexOfSmallest];
        arr[indexOfSmallest] = arr[i];
        arr[i] = tempArr;
        }
       return arr;
    }
}
