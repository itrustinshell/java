import java.util.Scanner;

public class appLogic {
    public static void choseOptions()
    {
        String optionChosen = "3";
        Scanner aaa = new Scanner(System.in);



        while (!optionChosen.equals("1"))
        {
            User person = Utils.createNewUser();
            Utils.successfulRegistrationMessage(person);
            System.out.println("Please digit one of the following options:");
            System.out.println("1 -> Menu");
            System.out.println("2 -> Exit");
            System.out.println("Insert: ");
            optionChosen =  aaa.nextLine();
            while (!optionChosen.equals("1") && !optionChosen.equals("2")) {
                System.out.println("You didn't digit a valid option. The Program will quit.");
                System.out.println("Please, try again.");
                System.out.println("Digit one of the following options:");
                System.out.println("1 -> Menu");
                System.out.println("2 -> Exit");
                System.out.print("Insert: ");
              
                optionChosen = aaa.nextLine();
            }

        } 
        aaa.close();
                  
        //transaction
        System.out.println("WE ARE IMPLEMENTING THIS PART FOR TRANACTION.");
        
    }
}

