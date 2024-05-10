
/*
 * Da Subject:
 * A list of transactions shall be implemented as a linked list (LinkedList) in TransactionsLinkedList class
 * 
 *  A transaction must be added with a SINGLE operation (O(1))

 * 
 */


/*
 * 
 * qui ho fatto una classe che rappresenta una idea di linked list.
 * in pratica quando creo una istanza di questa classe ho creato un'oggetto che ha:
 * una firstTransaction
 * una currentTransaction
 * Questo oggetto ha la possibilità di aggiungere "nodi" al current transaction.
 * e Siccome tutti questi sono transazioni avranno di volta i volta anche un UUID.
 * 
 * 
 * 
 * 
 */


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