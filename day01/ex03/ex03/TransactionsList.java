
package ex03;
import java.util.UUID;

/*
 * Da Subject:
 * TransactionsListinterface describing the following behavior:
 * Add a transaction
 * Remove a transaction by ID (in this case, UUID string identifier is used) Transform into array (ex. Transaction[] toArray())
 */

interface TransactionsList  {
    public void addTransaction(Transaction transaction);
    public void removeTransactionById(UUID id);
    public Transaction[] transformToArray(Transaction x);

}

