package com.example.demo;

/* Serve per usare l'annotazione @Autowired, che dice a Spring:
   Inietta automaticamente un oggetto qui.*/
import org.springframework.beans.factory.annotation.Autowired; 

/*serve per dire a Spring che questa classe è un componente gestito.
Spring, all’avvio, crea automaticamente un oggetto di questa classe 
e lo tiene pronto per essere iniettato dove serve.*/
import org.springframework.stereotype.Component;

/*qui utiliziamo component che appunto abbiamo importato 
In pratia diremo a spring: creami un’istanza e mettila 
nel contenitore (IoC container).*/
@Component 
public class Car 
{

    private final Engine engine;

    /*costruttore con @Autowired:
    - Spring vede che Car ha bisogno di un Engine
    - Cerca un oggetto Engine con @Component (se la classe Egine cnon ha l'annotazione component viene generato un errore di compilazione)
    - Lo crea (se non esiste già) e lo passa al costruttore
    Questo è Dependency Injection via costruttore — uno dei modi più consigliati.*/
    @Autowired 
    public Car(Engine engine){this.engine = engine;}

    public void drive() {
        System.out.println(engine.start());
        System.out.println("Sto guidando...");
    }
}
