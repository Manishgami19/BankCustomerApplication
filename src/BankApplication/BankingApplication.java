package BankApplication;

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args){
        BankAccount cust1 = new BankAccount("Manish Gami", "P1423");
        BankTransaction T1 = new BankTransaction(0,2346657);
        cust1.showOption();
        char option;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter an option: ");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':

                    System.out.println("Balance = " + T1.balance);
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("Enter an amount to deposit: ");
                    int amount = sc.nextInt();
                    T1.deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("Enter an amount to withdraw: ");
                    int amount2 = sc.nextInt();

                    if (amount2 < T1.balance)
                    {
                        T1.withdraw(amount2);
                        System.out.println("\n");
                    }
                    else {
                        System.out.println("\n");
                        System.out.println("Cannot withdraw due to insufficient balance");
                        System.out.println("\n");
                    }
                    break;
                case 'D':
                    T1.LastTransaction();
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("--------------------------------");
                    break;
                default:
                    System.out.println("Invalid Option!!. Please enter again");
                    break;
            }
        }while(option != 'E');

        System.out.println("Thank You for using our Application");

    }
}
