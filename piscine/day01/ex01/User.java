
public class User {
    Integer Identifier;
    String Name;
    Integer Balance;

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

