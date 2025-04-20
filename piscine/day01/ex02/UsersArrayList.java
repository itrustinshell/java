
//questa classe implementa l'interfccia ed infatti ha tutti i metodi dell'interfaccia implementati.


public class UsersArrayList implements UsersList {

    User[] arrayUsers = new User[10];
    Integer size = arrayUsers.length;

    /*
    Add_user: accetta come parametro UNA ISTANZA di User.
    Va a posizionarla nell'Array di oggetti del tipo User.
    Non appena vede una posizione di quell'Array vuota: inserisce l'istanza passata tramite parametro.
    In tal modo avremo aggiunto un oggetto User (una istanza) alla lista di utenti.
    */
    public void Add_user(User person) {
        Integer i = 0;
        while (arrayUsers[i] != null && i < size)
        {
            i++;
            if (i.equals(size))
            {
                size = size + size/2;
                User[] NewArrayUsers = new User[size];
                arrayUsers = copyElementFromOldArray(arrayUsers, NewArrayUsers);
            }
        }
        arrayUsers[i] = person;
    }

    /*
     * copyElementFromOldArray mi facilita la copia degli elementi di un array in un altro
     * come in c, qui calcoliamo la lunghezza dell'array intesa cone numero di 
     * elementi presenti in quell'array.
     * Nel ciclo while ci fermiamo a poco prima di questa lunghezza perchè
     * il nostro conteggio parte da 0.
     */
    public User[] copyElementFromOldArray(User[] oldArray, User[] newArray) {

        Integer i = 0;
        Integer oldLength = oldArray.length;
        while (i < oldLength)
        {
            newArray[i] = oldArray[i];
            i++;
        }
        return newArray;
    }

    /*
     * RetrieveUserById, mi consente di fare il return di una intera istanza,
     * Ricordiamo che qui l'istanza è un elemento dell'array.
     * l'Array in questione è un array di istanze della classe User.
     * In particolare la funzione RetrieveUserById mi permette di recuperare 
     * l'user passando il suo Identificativo come parametro. Infatti ad ogni Utente
     * è stato associato in maniera univoca un preciso Id.
     * Sostanzialmente ciclo l'ungo l'array, e quando trovo l'utente il cui id
     * corrisponde al parametro allora ritorno l'utente corrispondente.
     */
    public User RetrieveUserById(Integer id) throws UserNotFoundException {
       Integer i = 0;
        while (arrayUsers[i] != null)
        {
            if (arrayUsers[i].Identifier.equals(id))
            {
                return arrayUsers[i];
            }
            i++;
        }
        UserNotFoundException e = new  UserNotFoundException("forse ci siamo");
        throw e;
        //return null;
    }

    //dando l'indice dell'array, ritorna l'utente che è collocato in quella posizione
    public User RetrieveUserByIndex(Integer index) {
        
        return arrayUsers[index];
    }

    /*
     * conta gli elementi non nulli dell'Array.
     * Ritorna il conteggio che pertanto equivale al numero di utenti effettivamente presenti
     */
    public Integer RetrieveNumberOfUsers() {
        Integer i = 0;
        while (arrayUsers[i] != null)
        {
            i++;
        }
        return i;
    }
}