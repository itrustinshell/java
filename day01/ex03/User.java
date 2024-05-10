


/*
 * DA SUBJECT:
 * We need to add transactions field of TransactionsList type to User class 
 * so that each user can store the list of their transactions. Done -> see TransactionsList
 */




public class User {
    Integer Identifier;
    String Name;
    Integer Balance;
    TransactionsList TransactionsList;

    public User (String theName, Integer TheBalance)
    {
	//Identifier    
        this.Identifier = UserIdsGenerator.getInstance().generateId();
	
	//Name
        this.Name = theName;
        
	//Balance
	if (TheBalance < 0)
        {
            TheBalance = 0;
        }
        this.Balance = TheBalance;
    }
}

