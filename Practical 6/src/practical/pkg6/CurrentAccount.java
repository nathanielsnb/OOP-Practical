package practical.pkg6;

public class CurrentAccount extends Account{
    private final static double TRANS_CHARGES=0.50;
    private final static int FREE_TRANS_LIMIT=3;
    private int transactionCount;

    public CurrentAccount() {
    }

    public CurrentAccount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    public CurrentAccount(String accountNo, double balance) {
        super(accountNo, balance);
    }
    
    private void resetTransactionCount(){
        transactionCount = 0;
    }
    
    public static double getTRANS_CHARGES() {
        return TRANS_CHARGES;
    }

    public static int getFREE_TRANS_LIMIT() {
        return FREE_TRANS_LIMIT;
    }

    public int getTransactionCount() {
        return transactionCount;
    }      
    
    public void increaseTransactionCount(){
        transactionCount++;
    }
    
    public void addCharges(){
        super.withdrawal(TRANS_CHARGES);
    }
    
    public boolean withdrawal(double amount){
        if( super.withdrawal(amount)){
            increaseTransactionCount();
            if(transactionCount>FREE_TRANS_LIMIT){
                addCharges();
                System.out.println("Charges: "+ CurrentAccount.getTRANS_CHARGES());
            }
            return true;
        }else{
            return false;
        }     
    }

    public void deposit(double amount){
        super.deposit(amount);
        increaseTransactionCount();
        if(transactionCount>FREE_TRANS_LIMIT){
                addCharges();
                System.out.println("Charges: "+ CurrentAccount.getTRANS_CHARGES());
        }
    }
    
    public String toString(){
        return super.toString() + "\n"+ "transactionCount: "+ transactionCount;
    }
}

