package transaction;

public class TransferTransaction implements Transaction {

    @Override
    public double performTransaction(double accountBalance, double amount) {
        System.out.println("Transferred the money to the account successfully !!! ");
        return accountBalance - amount;
    }
    
}
