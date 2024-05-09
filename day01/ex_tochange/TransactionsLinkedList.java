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

    /*
    removeTransactionById(UUID id){
    }
    transformListIntoArray(ex. listof Transaction[] into Array(){
 
    }
    */
}