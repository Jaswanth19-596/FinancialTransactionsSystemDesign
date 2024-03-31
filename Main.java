
import java.util.Scanner;

import factory.TransactionFactory;
import transaction.Transaction;;

public class Main {


    public static void main(String[] args) {

        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Creating the object of the TransactionFactory
        // This factory will be used to create the desired transaction object.
        TransactionFactory factory = new TransactionFactory();

        // Initial Balance is 0
        double accountBalance = 0;

        // Used to ask user for further transactions or not
        boolean continueTransactions = true;


        while(continueTransactions){
            // Ask the user for the transaction type 
            System.out.println("Enter Transaction Type : (Deposit/Withdraw/Transfer/Exit)");
            String transactionType = sc.next().toLowerCase();

            // Based on the transaction type, perform the transaction
            switch(transactionType){
                case "deposit":
                    System.out.print("Enter the amount to deposit : ");
                    double amount = sc.nextDouble();
                    Transaction depositTransaction = factory.getTransaction(transactionType);
                    accountBalance = depositTransaction.performTransaction(accountBalance, amount);
                    break;
                case "withdraw":
                    System.out.print("Enter the amount to withdraw : ");
                    double withdrawAmount = sc.nextDouble();
                    Transaction withdrawTransaction = factory.getTransaction(transactionType);
                    accountBalance = withdrawTransaction.performTransaction(accountBalance, withdrawAmount);
                    break;
                case "transfer":
                    System.out.print("Enter the amount to transfer : ");
                    double transferAmount = sc.nextDouble();
                    Transaction transfeTransaction = factory.getTransaction(transactionType);
                    accountBalance = transfeTransaction.performTransaction(accountBalance, transferAmount);
                    break;
                case "exit":
                    continueTransactions = false;
                    break;
                default:
                    System.out.println("Invalid transaction type entered.");
                    break;
            }
        
            System.out.println("Updated Account Balance : "+accountBalance+" \n\n\n");
        }


        sc.close();

    }
    
}
