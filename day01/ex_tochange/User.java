
import java.util.Scanner;

public class User {
    Integer Identifier;
    String Name;
    Integer Balance;
    TransactionsList Transactions;

    public User (String theName, Integer TheBalance)
    {
        this.Identifier = UserIdsGenerator.getInstance().generateId();
        this.Name = theName;
        if (TheBalance < 0)
        {
            TheBalance = 0;
        }
        this.Balance = TheBalance;
    }
}

class Utils {
   
    
    public static User createNewUser()
    {
        User NewUser;
        String Name;
        Integer Balance;

        Scanner Input = new Scanner(System.in);
        clearConsole();
        System.out.println("Welcome to the Central Bank.\nWe are going to start your registration.\nPlease, insert your name: ");
        Name = Input.nextLine();
        if (Name.equals("")) {
    
            System.out.println("You didn't enter any name! The registration will be stopped!");
            Input.close();
            return null;
        }
       // clearConsole();
        System.out.println("Thank you " + Name + "\nPlease insert your balance: ");
        
        try {
            Balance = Integer.parseInt(Input.nextLine());
            //Input.close();
        } catch (Exception wrongBalance) {
            System.out.println("You didn't enter a correct amount! The registration will be stopped!");
            return null;
        }
        if (Balance < 0)
        {
            System.out.println("You entered a negative amount. It will be set to zero aoutmatically.");
        }
        NewUser = new User(Name, Balance);
        return NewUser;
    }

    public static void successfulRegistrationMessage(User user)
    {
        clearConsole();
        System.out.println("Thank you "+ user.Name);
        System.out.println("The registration is completed ");
        System.out.println("Your amount is: " + user.Balance);
        System.out.println("This is your Id: " + user.Identifier);
    }
      
    public static void clearConsole() {
        Integer i;
        i = 0;
        while (i < 50) {
            System.out.println();
            i++;
        }
    }

}