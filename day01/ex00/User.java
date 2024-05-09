
public class User {
    Integer Identifier;
    String Name;
    Integer Balance;
   
    public User (String theName, Integer TheBalance)
    {
    	this.Name = theName;
        if (TheBalance < 0)
        {
            TheBalance = 0;
        }
        this.Balance = TheBalance;
    }

    public void setname(String name)
    {
	    this.Name = name;
    }
	
    public String getName()
    {
	return this.Name;	    
    }
	   
}

