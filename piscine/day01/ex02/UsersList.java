/*
 * una volta che la classe implementa l'interfaccia,
 * tutti i metodi dell'interfaccia DEVONO necessariamente essere inclusi nella classe.
 * Si suol dire, a tal riguardo, che l'interfaccia è come un contratto.
 */

interface UsersList {
    public void Add_user(User person);
    public User RetrieveUserById(Integer id) throws UserNotFoundException;
    public User RetrieveUserByIndex(Integer index);
    public Integer RetrieveNumberOfUsers();
    public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException (String message){
           super(message);
        }
    }
}
