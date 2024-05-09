interface UsersListInterface {
    public void Add_user(User person);
    public User RetrieveUserById(Integer id) throws UserNotFoundException;
    public User RetrieveUserByIndex(Integer index);
    public Integer RetrieveNumberUfUsers();
    public class UserNotFoundException extends RuntimeException {

 public UserNotFoundException (String message){
           super(message);
        }
    }
}
