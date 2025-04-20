
import java.util.Scanner;

public class Program {

    public static void main (String[] args)
    {
        Integer i;
        Scanner input = new Scanner(System.in);
        System.out.print("Hey write a number: ");
        String input_number = input.nextLine();
        try 
        {
            Integer parsed_number = Integer.valueOf(input_number);
            if (parsed_number <= 0 || parsed_number == 1)
            {
                System.err.println("IllegalArgument");
                input.close();
                System.exit(-1);
            }
       
            i = 2;
            while ((i * i) < parsed_number)
            {
                if (parsed_number % i == 0)
                {
                    System.out.println("false " + i);
                    input.close();
                    return;
                }
                i++;
            }   
            input.close();
            System.out.println("true " + i);
          
        } catch (Exception e)
        {
            System.err.println("You didn't insert a number!");
            System.exit(-1);
        }
    }
}



