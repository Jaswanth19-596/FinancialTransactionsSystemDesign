package transaction;


/*
 * The Transaction interface provides a bluprint for all the classes.
 * All classes that implement this interface, must override the method performTransaction().
 */
public interface Transaction {
    
    double performTransaction(double accountBalance, double amount);

}
