import ex00.User;

public class UsersArrayList implements UsersListInterface {

    User[] arrayUsers = new User[10];

    Integer size = arrayUsers.length;

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

    public User RetrieveUserByIndex(Integer index) {
        
        return arrayUsers[index];
    }

    public Integer RetrieveNumberUfUsers() {
        Integer i = 0;
        while (arrayUsers[i] != null)
        {
            i++;
        }
        return i;
    }

}