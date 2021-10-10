/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical.pkg3;

import java.util.Scanner;
public class DenomBreakdown {
    public static void main(String[] args)
    {
       int denom[] = new int[]{100,50,20,10,5,1};
       int qty[] = new int[6];
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Denomination (RM)	Quantity");
	for(int i=0; i<=5; i++) {
           System.out.printf("%12d\t\t", denom[i]);
           qty[i] = sc.nextInt();
       }

       int sum = 0;
       System.out.println("Denomination(RM)         Quantity            Value (RM)");
       for(int i=0; i<=5; i++){
           sum = sum + (denom[i]*qty[i]);
           if(qty[i]>0)
           System.out.printf("%15s%17s%22s\n", denom[i], qty[i], (denom[i]*qty[i]));
       }    
       System.out.println("Total = RM " + sum);
    }  
}

			

