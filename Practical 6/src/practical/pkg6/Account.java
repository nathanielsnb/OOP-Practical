package practical.pkg6;

public class Account {
    private String accountNo;
    private double balance;

    public Account() {
    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
       
    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
         this.balance+=amount;
    }
    
    public boolean withdrawal(double amount){    
        if(this.balance < amount){
            return false;
        }else{
             this.balance-=amount;
             return true;
        }
    }

    public String toString() {
        return "AccountNo= " + accountNo + "\n" +
                "Balance= " + balance + "\n";
    }
    
    public boolean equals(Object obj){
        Account temp = (Account)obj;
        
        if(temp.getAccountNo().equals(accountNo)&& temp.getBalance()==(this.balance)){
            return true;
        }else{
            return false;
        }
    }   
}

