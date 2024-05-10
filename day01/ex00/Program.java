

public class Program {
    public static void main(String[] args)
    {
        //user with balance > 0
	User person1 = new User("Pippo", 3);
	System.out.println("the amount for "+person1.Name+ " is: " + person1.Balance);

	//user with balance < 0
	User person2 = new User("cicco", -33);
	System.out.println("the amount for "+person2.Name+ " is: " + person2.Balance);


       //Example for valid transaction
	    Transaction transaction1 = new Transaction(Transaction.Category.CREDIT, 100);
	//Example of invalid transaction
	    Transaction transaction2 = new Transaction(Transaction.Category.DEBIT, -100);

    }
}
