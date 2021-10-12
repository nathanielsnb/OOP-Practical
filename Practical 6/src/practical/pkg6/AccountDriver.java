package practical.pkg6;

import java.util.Scanner;

public class AccountDriver {
    public static void main(String[] args) {
        int selection=4;
        double amount;
        Scanner scan= new Scanner(System.in);
        CurrentAccount cAcc= new CurrentAccount("C0001",1000.00);
        CurrentAccount cAcc2= new CurrentAccount("C0001",1000.00);
      
       do{
            System.out.print("\n\nMain menu\n"+
                    "1. Deposit\n"+
                    "2. Withdrawal\n"+
                    "3. Check Balance\n"+
                    "4. Account Details\n"+
                    "5. Quit\n"+
                    "\nEnter a choice: ");
            
            selection= scan.nextInt();
            switch(selection){
                case 1:
                    System.out.print("Enter amount of deposit: ");
                    amount=scan.nextDouble();
                    cAcc.deposit(amount);                    
                    break;  
                    
                case 2:
                    System.out.print("Enter amount of withdrawal: ");
                    amount=scan.nextDouble();
                    if(cAcc.withdrawal(amount)==true){           

                        System.out.println("Completed.");
                    }else{
                        System.out.println("Withdrawal failed.");
                    }        
                    break;                    
                case 3:
                    System.out.println("Your current balance is "+ cAcc.getBalance());
                    break;  
                case 4:
                    System.out.println(cAcc.toString());
                    break;
                default:
                    System.out.println("Terminating program...");
            }
        }while(selection >= 1 && selection <= 4);
        
    }
}



