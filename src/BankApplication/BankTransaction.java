package BankApplication;

public class BankTransaction {
    int transactionID;
    int balance;
    int LastTransaction;
    BankTransaction(int cbalance, int TID) {
        balance = cbalance;
        transactionID = TID;
    }
    //defining deposit, withdraw, last transaction details
    void deposit(int amount){
        if (amount != 0){
            balance = balance+ amount;
            LastTransaction = amount;
        }
    }
    void withdraw(int amount){
        if (amount != 0){
            balance = balance - amount;
            LastTransaction = -amount;
        }
    }
    void LastTransaction(){
        if (LastTransaction > 0 ){
            System.out.println("Deposited: "+ LastTransaction);
        } else if (LastTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(LastTransaction));
        }
        else{
            System.out.println("No Transactions Occurred");
        }
    }
}
