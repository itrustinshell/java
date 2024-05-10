import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        //creo 3 utenti (3 istanze della classe User)
        User person1 = new User("Ciccio", 10);
        User person2 = new User("Franco", 20);
     	User person3 = new User("Mario!", 30);

        //creo un'array di utenti. Questa lista è una istazna della classe UserArrayList
        UsersArrayList UserList = new UsersArrayList();
        /* 
        //in pratica l'istanza della classe contiene una lista di 10 elementi e tutti i metodi
        //che ho implementato dall'interfaccia. La lista in questa istanza ha un nome ben preciso che puoi
        //controllare nella classe: l'hai chiamata arrayUsers. Ora le funzioni interne vanno a fare riferimento
        a questo array. Quindi qundo chiami l'istanza che hai appena creata e i vari metodi associai, questi andranno
        a riempire quell'array. Per chiamare l'array dovrai digitare nomeIstanza.nomeArray
        */
        //vado ad aggiungere questi utenti ad una lista
        UserList.Add_user(person1);
        UserList.Add_user(person2);
        UserList.Add_user(person3);
        //per verificare l'inserimento vado a stampare i nomi ciclando lungo l'array
        Integer i = 0;
        while (UserList.arrayUsers[i] != null)
        {
            System.out.println(UserList.arrayUsers[i].Name);
            i++;
        }
        //gli utenti sono correttamente aggiunti.

        //ora andiamo a verificare se la funzinoe di recuper user tramite index funziona
        System.out.println("insrisci l'index 2 e comparirà il nome di Mario. Attenzione: inserisci esattamnte il numero 2 perchè questo programma non gestisce ancora le eccezioni. pertanto un inserimento diverso potrebbe portare ad errori inattesi da parte del programma.");
        /* 
         * qui sotto andiamo a prendere l'input della tastiera.
         * In particolare abbiamo importato java.util.Scanner;
         * Poi andiamo a creare una istanza della classe scanner.
         * la chiamiamo input. Ci servirà per catturare un inserimento 
         * da tastiera con il metodo nextLine().
         * Importante dovremo alla fine chiudere con input.close();
         * quando cioè non abbiamo più bisogno di input.
         * 
         */
        Scanner input = new Scanner(System.in);
        String inserimento = input.nextLine();
        //attenzione qui quando usi l'operatore logico == perchè può portare ad errori. E' consigliabile 
        //la funzione builtin equals() la quale va "applicata" agli oggetti che vuoi verificare
        if (inserimento.equals("2"))
        {
            //ricorda che UserList è l'istanza della classe che hai creato
            User utenteRecuperato = UserList.RetrieveUserByIndex(2);
            System.out.println(utenteRecuperato.Name);
            input.close();
        }


    }
}
