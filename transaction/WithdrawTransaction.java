package transaction;

public class WithdrawTransaction implements Transaction{

    @Override
    public double performTransaction(double accountBalance, double amount) {
        System.out.println("Withdrawed money successfully !!!");
        return accountBalance - amount;
    }
    
}
