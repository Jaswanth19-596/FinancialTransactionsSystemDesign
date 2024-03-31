package factory;

import transaction.DepositTransaction;
import transaction.Transaction;
import transaction.TransferTransaction;
import transaction.WithdrawTransaction;

/*
 * The TransactionFactory class is responsible for creating instances of Transaction objects based on the transaction type * 
 */

public class TransactionFactory{

    /*
     * Gets the transaction type and returns the object.
     */
    public Transaction getTransaction(String transactionType){
        switch (transactionType) {
            case "deposit":
                return new DepositTransaction();
            
            case "withdraw":
                 return new WithdrawTransaction();

            case "transfer":
                return new TransferTransaction();

            default:
                return null;
        }
    }

}