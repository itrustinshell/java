import ex00.Transaction;
import ex03.TransactionsList;

class TransactionsLinkedList implements TransactionsList {
    Transaction firstTransaction;
    Transaction currentTransaction;

    public void addTransaction(Transaction newTransaction) {
        if (firstTransaction == null)
        {
            firstTransaction = newTransaction;
        } else {
            currentTransaction.next = newTransaction ;
        }
        currentTransaction = newTransaction;
    }
}