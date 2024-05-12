import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import javax.swing.text.Style;

public class Program{
	static public void main(String Args[]){
	//mi servia' una variabile che 
	//conservi il path di un file
	//String path= "file.pdf";
    String path= "signature.txt";
    HashMap <String, String> mappa = new HashMap<String, String>();
    /*
     * 
     * 
     * qui inseriamo il try/catch per gestire una possibile eccezione relativa
     * al processo di ricerca del file.
     * in pratica se il file non viene trovato si genera una eccezione.
     * questa eccezione deve essere obbligatoriamente gestita.
     *
     * ora in pratica ho creato l'istanza input della classe FileInputStream, per leggere il file specificato con il path.
     * Questo ha comportato che il file è stato trovato e che è stato "aperto".
     * Pertanto quando utilizzo questo processo, devo poi ricordarmi di chiudere il tutto.
     * In altre parole devo fare il close() dell'istanza creata.
     * Inoltre è da considerare che anche il close() prevede la gestione OBBLIGATORIA di una eccezione,
     * ovvero l'eccezione che si genera qualora il processo di chiusura del file non vada a buon fine.
     * La chiusura e la relativa gestione dell'eccezione vanno fatti con un altro try/catch.
     * Quest'ultimo è da collocare dentro il try di cui sopra, in quanto è all'interno dello scope di questo try
     * che abbiamo creato l'istanza input. Pertanto se gestissimo la chiusura di input altrove, questa non verrebbe vista.
     * Non si avrebbe cioè visibilità di input che è stato creato in try.
     * 
     * 
     */
        try {
            FileInputStream input = new FileInputStream(path);
            System.out.println("file: " + path);
            System.out.println("The file was succesfully open.");
            try {
                /*
                 *
                 *  qui inserisco un altro try/catch perchè devo leggere nel filec che ho appena aperto
                 * anche qui devo mettere una exception ecco perchè c0è un altro try/catch...
                 * Uso la funzione read passandogli un buffer di tot byte in cui inserire quanto letto.
                 * In ffetti se faccio la rappresentazione esadecimale dei primi byte letti otterrò 
                 * il numero magico che indica il tipo del file (la sua estensione).
                 *
                 */
                    byte[] buffer = new byte[250];
                    input.read(buffer);
                    String longString = new String(buffer, StandardCharsets.UTF_8);
                    String[] splitbynl = longString.split("\n");
                    for (String x : splitbynl){
                        String[] newArray = x.split(",");
                        mappa.put(newArray[0], newArray[1]);
                        System.out.println("key: " + newArray[0] +", value: " + newArray[1]);
                    }
                    for (String x : mappa.keySet()) {
                        System.out.println(x + " "+  mappa.get(x));
                    }
            } catch (IOException e){
                    System.out.println("non ho letto nulla");
                }
            try{
                input.close();
                System.out.println("The file was succesfully closed.");

            } catch (IOException e){
                System.out.println("The file was not closed.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Il file non è stato trovato");
        }
        Scanner insertion = new Scanner(System.in);
        System.out.println("Please insert a file path: ");
        String path_inserted = insertion.nextLine();

        try {
            FileInputStream PathInsertion = new FileInputStream(path_inserted);
            System.out.println("You entered a good file path.");

            byte[] buffer_catch = new byte[20];
                   
        try {
                PathInsertion.read(buffer_catch);
                //ora ho un buffer con dentro qualcosa...e dovrei avere la signature
                //qindi procedo a convertire questi byte in esadecimale.
                //per farlo prendo ogni elemento dell'array e lo converto prima in integer unsigned e poi in hex
                //Quindi anzitutto vado a lavorare sugli integer. In java non puoi memorizzare 
                //valori esadecimali in un array di integer. Quindi prima ti fai l'array di integer
                //e poi quelli uno ad uno li trasformi in esadecimale...vado a memorizzare questi valori in un array di Integer
                Integer i = 0;
                Integer[] buffer_converted_toInt = new Integer[20];
                while (i < 20)
                {
                    Integer element_converted_to_integer = Byte.toUnsignedInt(buffer_catch[i]);
                    buffer_converted_toInt[i] = element_converted_to_integer;
                    i++;
                }
                i = 0;
                System.out.print("let us see");
                /* 
                questo è un check per vedere se viene stampato il nuovo array di integer
                while (i < 20)
                {

                    System.out.print(buffer_converted_toInt[i] + " ");
                    i++;
                }
                */

                //ora andiamo a trasformare questo array in una sequenza di testo in cui i vari elementi sono uno accanto all'altro
                //PER FARLO USEREMO la classe Stringbuilder. Quindi andremo a farci una istanza e gli passeremo con il metodo append
                //le varie trasformazioni in esadecimale dei numeri dell'array appena creato

                StringBuilder stringa_finale = new StringBuilder();
                i = 0;
                while (i < 20)
                {
                    //conversione integer in esadecimale (Attenzo che la conversione converte in stringa esadecimale)
                    String x = Integer.toHexString(buffer_converted_toInt[i]);
                    //aggiunta della stringa al nostro oggetto stringa_finale con il metodo append
                    stringa_finale.append(x);
                    i++;
                }
                //a questo punto dovremmo avere una stringa finale con i caratteri esadecimali riportati. Andiamo a stamparla
                System.out.println("questa è la stringa finale "+stringa_finale);
                //ora vediamo se in questa stringa finale sono contenuti le famose signature.
                //per farlo devo usare il metodo indexof() da applicare al mio oggetto StringBuilder.
                //in tal modo avrò un feedback della presenza o meno della stringa che sto cercando
                //il feedback in questione sarò l'inice della prima ooccorrenza della stringa cercata nell'oggetto Stringbuilder

                String bconv = stringa_finale.toString();
                System.out.println("bconv: "+bconv);

                for (String x : mappa.keySet() )
                {
                    if (bconv.contains(x))
                    {
                        System.out.println("il file che hai appena aperto ha formato: " + mappa.get(x));
                        System.out.println("questa è la signature da te memorizzata: " + x);
                        System.out.println("questa invece è la signature del file che hai appena aperto: " + stringa_finale);
                    }
                }
            

            } catch (Exception e) {
                System.out.println("problem in reading!");
            }
            try {
                PathInsertion.close();
            } catch (Exception e) {
                System.out.println("Problem in closing the file you just entered.");
            }
        } catch (FileNotFoundException e)
        {
            System.out.println("you entered a wrong path");
        }






        insertion.close();






	}
}


/*
 * 
 * idea da sviluppare
 * 1) prima leggi tutto il file signature.txt
 * 2) poi ti ricrei una map con key values prendendo la virgola e \n come elementi riferimento
 * 
 */