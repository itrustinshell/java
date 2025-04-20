public class UserIdsGenerator {
  private Integer Id = 0;
  private static UserIdsGenerator instance;
  
  //rendo il costruttore volutamente privato
  private UserIdsGenerator(){};

  //creo un metodo statico con cui dall'esterno
  //posso generare l'istanza che ho messo sopra
  public static UserIdsGenerator getInstance(){
        if(instance == null){
            instance = new UserIdsGenerator();
	}
	 return instance;
    }
//questo metodo non statico può  essere
  //chiamato solo da da una istanza 
public Integer generateId(){
        Id = Id + 1;
        return Id;
    }
}
