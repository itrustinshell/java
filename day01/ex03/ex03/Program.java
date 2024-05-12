package ex03;

import java.util.Scanner;
import java.util.UUID;


public class Program {
    public static void main(String[] args)
    {
        //creo la lista delle transazioni
        TransactionsLinkedList ListaTransazioni = new TransactionsLinkedList();

        //creo delle transazioni
        Transaction transazione1 = new Transaction(100);
        Transaction transazione2 = new Transaction(200);
        Transaction transazione3 = new Transaction(300);
        Transaction transazione4 = new Transaction(400);

        //stampo gli UUID per poterli cosi selezionare, copiare, incollare quando mi verrò chiesto di inserirli come output
        System.out.println(transazione1.Identifier);
        System.out.println(transazione2.Identifier);
        System.out.println(transazione3.Identifier);
        System.out.println(transazione4.Identifier);

        //aggiungo le 4 transazioni alla lista
        ListaTransazioni.addTransaction(transazione1);
        ListaTransazioni.addTransaction(transazione2);
        ListaTransazioni.addTransaction(transazione3);
        ListaTransazioni.addTransaction(transazione4);

        //chiedo di inserire un UUID (sarà sufficiente selezionarlo, copiarlo e incollarlo dalla stampa degli UUID)
        Scanner input = new Scanner(System.in);
        String insertion = input.nextLine();
        UUID uuid = UUID.fromString(insertion);
        
        //metodo di rimozione della transazione dalla lista
        ListaTransazioni.removeTransactionById(uuid);

        //QUI SOTTO INIZIA UN loop con cui si potrà constatare che il nodo inserito è stato tolto.
        Transaction x = ListaTransazioni.firstTransaction;
        while (x != null)
        {
            System.out.println(x.Identifier);
            x = x.next;
        }
        input.close();
    }
}
