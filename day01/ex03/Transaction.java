
import java.util.UUID;


/*
 * da subject
 * Therefore, each transaction shall contain a field with a link to the next transaction object. -> done! vedi Transaction next;
 * 
 * 
 */


public class Transaction {
    UUID Identifier;
    User Recipient;
    User Sender;
    String debits;
    String credits;
    Integer amount;
    Transaction next;

    public Transaction(Integer ctorAmount) {
        this.amount = ctorAmount;
    }
}




/*
 * 
 * If an attempt is made to remove a transaction with non-existent ID, TransactionNotFoundException runtime exception must be thrown.
 * 
 */