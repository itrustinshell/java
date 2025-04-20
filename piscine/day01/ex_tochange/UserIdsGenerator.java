import ex03.UserIdsGenerator;

public class UserIdsGenerator {

    private static UserIdsGenerator userId;
    private Integer id_number = 0;

    private UserIdsGenerator() {};

    public static UserIdsGenerator getInstance()
    {
        if (userId == null)
        {
            userId = new UserIdsGenerator();
        }
        return userId;
    }

    public Integer generateId() {
        id_number =  id_number +  1;
        return id_number;
    }


}