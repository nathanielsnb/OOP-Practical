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
public class TestPatientBill {
     public static void main(String[] args) {
          PatientBill[] bills = new PatientBill[4];
          bills[0] = new OutpatientBill("Zoe Smith", 30.00);
          bills[1] = new OutpatientBill("Andy Lau", 50.00);
          bills[2] = new InpatientBill("Mary Yan", 500.00, 50.00, 'S', 8);
          bills[3] = new InpatientBill("Jack Burton", 200.00, 35.00, 'P', 10);

          // Display bills information
          for(int i=0; i<bills.length; ++i ) 
              System.out.println("\n" + bills[i]);
              System.out.println("Total Charges: " + bills[i].calcTotalCharges());
         
              //Display total charges of all bills
          double total = computeTotalCollection(bills);
          System.out.println("\nTotal charges of all bills = " + total);
     }
     
    public static double computeTotalCollection(PatientBill [] p){
        
    }
     
public static PatientBill[] selectionSort(PatientBill[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			int indexOfSmallest = i;	// assign the first index of the subarray as the initial indexOfSmallest
			for (int j = i+1; j < arr.length; ++j) {
				if (arr[j].compareTo(arr[indexOfSmallest]) < 0) // if the current array element is smaller than the
					indexOfSmallest = j;														// element at indexOfSmallest, update indexOfSmallest
			}
			// swap the element at indexOfSmallest with the current subarray's first element 																									
			PatientBill tempArr = arr[indexOfSmallest];
			arr[indexOfSmallest] = arr[i];
			arr[i] = tempArr;
		}
		return arr;
	}}