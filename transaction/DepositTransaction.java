package transaction;

public class DepositTransaction implements Transaction {

    /*
     * The Class overrides the default method in the Transaction Interface.
     * This method implements the logic for the DepositTransaction.
     */
    @Override
    public double performTransaction(double accountBalance, double amount) {
        System.out.println("Deposited Money Into the account successfully !!!!");
        return accountBalance + amount;
    }
}
