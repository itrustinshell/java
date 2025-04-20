
package ex03;
import java.util.UUID;

public class Transaction {
    UUID Identifier;
    User Recipient;
    User Sender;
    String debits;
    String credits;
    Integer amount;
    Transaction next;
    Transaction prev;
    public Transaction(Integer ctorAmount) {
        this.amount = ctorAmount;
        this.Identifier = UUID.randomUUID();
    }
}
