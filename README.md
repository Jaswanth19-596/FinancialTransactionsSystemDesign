
## User Input Format
The program prompts the user to enter the type of transaction they want to perform. Users should enter one of the following options:
- `deposit`: To make a deposit into their account.
- `withdraw`: To make a withdrawal from their account.
- `transfer`: To transfer money to another account.
- `exit`: To exit the program.

Depending on the transaction type chosen, the program will prompt the user for additional information such as the amount to deposit/withdraw/transfer.

## Execution
- Make sure you are in the FINANCIALTRANSACTIONSYSTEMDESIGN folder.
- Execute the command : javac Main.java
- Then Execute the command : java Main



## Seamless Expansion
The program has been designed to support seamless expansion by incorporating new transaction types. This is achieved through the use of a `TransactionFactory` class, which encapsulates the creation of transaction objects. To add a new transaction type:
1. Create a new class for the transaction type, implementing the `Transaction` interface.
2. Update the `TransactionFactory` class to return an instance of the new transaction type based on user input.

For example, to add a new transaction type called `balance_inquiry`, you would:
1. Create a new class `BalanceInquiryTransaction` implementing the `Transaction` interface.
2. Update the `TransactionFactory` class to handle the `"balance_inquiry"` type and return an instance of `BalanceInquiryTransaction`.

With this design, adding new transaction types requires minimal changes to the existing codebase, ensuring ease of maintenance and adaptability.

