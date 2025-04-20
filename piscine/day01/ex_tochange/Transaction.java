
import java.util.UUID;

import ex00.Transaction;
import ex00.User;

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

