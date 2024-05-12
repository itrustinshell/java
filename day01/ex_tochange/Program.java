import ex00.Transaction;
import ex00.User;
import ex03.TransactionsLinkedList;
import ex03.UsersArrayList;

public class Program {
    
   
    public static void main(String[] args)
    {
        //appLogic.choseOptions();
        User person1 = new User("Pippo", -3);
        User person2 = new User("ciccio", 33);
        User person3 = new User("francesco", -3);
      

        UsersArrayList usersArrary = new UsersArrayList();

        usersArrary.Add_user(person1);
        usersArrary.Add_user(person2);
        usersArrary.Add_user(person3);
        usersArrary.Add_user(person3);
        usersArrary.Add_user(person1);
        usersArrary.Add_user(person1);
        usersArrary.Add_user(person1);
        usersArrary.Add_user(person1);
        usersArrary.Add_user(person1);
        usersArrary.Add_user(person1);
        usersArrary.Add_user(person1);
        usersArrary.Add_user(person1);
        Integer i = 0;
        System.out.println(usersArrary.arrayUsers.length);
        while (usersArrary.arrayUsers[i] != null)
        {
            System.out.println("Name: " + usersArrary.arrayUsers[i].Name + ", Id: " +  usersArrary.arrayUsers[i].Identifier );
            i++;
        }

       // usersArrary.RetrieveUserById(4);


        /*Example about Transactions*/
        Transaction transaction1 = new Transaction(100);
        Transaction transaction2 = new Transaction(200);
        Transaction transaction3 = new Transaction(300);

        TransactionsLinkedList transactionLinkedList = new TransactionsLinkedList();
      transactionLinkedList.addTransaction(transaction1);
        transactionLinkedList.addTransaction(transaction2);
         transactionLinkedList.addTransaction(transaction3);

    System.out.println(transactionLinkedList.firstTransaction.amount);
       System.out.println(transactionLinkedList.firstTransaction.next.amount);
       System.out.println(transactionLinkedList.firstTransaction.next.next.amount);

    }
}