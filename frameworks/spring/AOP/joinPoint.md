
# 🔍 Spring AOP - `JoinPoint` spiegato facile e completo

## ✅ Cos'è `JoinPoint`?

`JoinPoint` è un oggetto che Spring AOP ti passa **automaticamente** nei metodi degli Aspect,  
per permetterti di sapere **cosa sta succedendo** nel punto in cui stai intercettando un metodo (AOP = Aspect-Oriented Programming).

---

## 🧪 A cosa serve?

`JoinPoint` ti permette di sapere:

| Cosa vuoi sapere                    | Metodo da usare                           |
|------------------------------------|-------------------------------------------|
| Nome del metodo intercettato       | `joinPoint.getSignature().getName()`      |
| Nome della classe                  | `joinPoint.getTarget().getClass().getSimpleName()` |
| Oggetto che esegue il metodo       | `joinPoint.getTarget()`                   |
| Parametri ricevuti dal metodo      | `joinPoint.getArgs()`                     |

---

## 📚 Esempio semplice

### Classe `Car`

```java
@Component
public class Car {
    public void drive() {
        System.out.println("Sto guidando...");
    }
}
```

### Aspect che intercetta `drive()`
Se ci fai caso la funzione log ha come parametro un tipo JointPoint.


```java
@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.demo.Car.drive(..))")
    public void log(JoinPoint joinPoint) {
        System.out.println("Metodo: " + joinPoint.getSignature().getName());
        System.out.println("Classe: " + joinPoint.getTarget().getClass().getSimpleName());
    }
}
```

### Output:

```
Metodo: drive
Classe: Car
Sto guidando...
```

---

## 🧠 Posso non usare `JoinPoint`?

✅ Sì, non è obbligatorio!

```java
@Before("execution(* com.example.demo.Car.drive(..))")
public void logSemplice() {
    System.out.println("LOG: sto per guidare!");
}
```

Funziona, ma **non puoi sapere che metodo è stato chiamato, né i parametri passati.**

---

## 🔄 Uso con parametri (`getArgs()`)

### Classe `Car` con metodo a 2 parametri

```java
@Component
public class Car {
    public void accelera(int velocita, String modalità) {
        System.out.println("Accelerazione a " + velocita + " km/h in modalità " + modalità);
    }
}
```

### Aspect che intercetta `accelera(...)`

```java
@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.demo.Car.accelera(..))")
    public void logArgs(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("Argomento 1 (velocità): " + args[0]);
        System.out.println("Argomento 2 (modalità): " + args[1]);
    }
}
```

### Quando chiami:
```java
car.accelera(120, "sport");
```

### Output:
```
Argomento 1 (velocità): 120
Argomento 2 (modalità): sport
Accelerazione a 120 km/h in modalità sport
```

---

## 🎯 Riassunto delle domande che ci siamo fatti

| Domanda                                      | Risposta |
|---------------------------------------------|----------|
| `JoinPoint` è parte dell’aspect?            | ❌ No, è solo un parametro |
| Serve obbligatoriamente?                    | ❌ No, è facoltativo       |
| Cosa rappresenta?                            | ✅ Il metodo intercettato  |
| Si riferisce alla classe `Car`?             | ✅ Se la intercetti tu     |
| Da dove escono gli argomenti (`args`)?      | ✅ Dai parametri del metodo chiamato |

---

## 🧠 In conclusione

> `JoinPoint` è come una scatola con dentro tutte le informazioni utili sul metodo intercettato:  
> nome, classe, parametri, oggetto...  
> E puoi usarlo per **loggare**, **fare controlli**, **debug**, ecc.

---

> _"JoinPoint è la lente d’ingrandimento dell’AOP: ti mostra cosa sta succedendo mentre il metodo sta per essere eseguito."_ 🔍✨