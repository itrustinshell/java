import java.util.UUID;


public class Transaction {
    UUID Identifier;
    User Recipient;
    User Sender;
    Integer amount;
	static enum Category {
		credit,
		debit
	}

    private boolean set_amount(Category cat, Integer money)
	{
		boolean check_money;
		check_money = true;

		if (cat == Category.credit && money < 0)
			check_money = false;
		if (cat == Category.debit && money > 0)
			check_money = false;
		return check_money;
	}

    public Transaction(Category cat, Integer money) {
 	if (set_amount(cat, money) == false)
		System.out.println("Attention, you entered an invalid amount.");
	else
		System.out.println("Transaction validated!");
    }
}

