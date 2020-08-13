package BankApplication;

public class BankAccount {
    String CustomerName;
    String CustomerID;
    //int balance;
    //int LastTransaction;

    //defining the class and objects
    BankAccount(String cname, String cid){
        CustomerName = cname;
        CustomerID = cid;
    }

    void showOption() {
        System.out.println("Welcome " + CustomerName);
        System.out.println("Your ID is:  " + CustomerID);
        System.out.println("\n");
        System.out.println("Following options available: ");
        System.out.println("A : Check Balance");
        System.out.println("B : Deposit");
        System.out.println("C : Withdraw");
        System.out.println("D : Know your Last Transaction");
        System.out.println("E : EXIT");
    }
}
