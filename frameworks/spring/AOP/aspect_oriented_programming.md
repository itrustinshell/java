
# 🧙‍♂️ Spring AOP - Aspect-Oriented Programming

## ✨ Cos'è AOP?

AOP (Aspect-Oriented Programming) è un paradigma che ti permette di:
> **aggiungere comportamenti comuni** (log, sicurezza, transazioni, ecc.)  
> a più parti della tua applicazione **senza toccare direttamente il loro codice**.

---

## 🔁 Perché serve?

Per evitare di scrivere **le stesse cose ovunque**, come:
- `System.out.println("Metodo chiamato")`
- Controlli di sicurezza
- Misurazione del tempo
- Gestione delle transazioni

Queste sono **logiche trasversali** (si ripetono in tanti punti, ma non fanno parte della logica principale).

---

## 📦 Come funziona in Spring?

Spring intercetta le chiamate ai metodi e ti permette di:
- eseguire qualcosa **prima** (`@Before`)
- **dopo** (`@After`)
- **intorno** (`@Around`) a quel metodo

---

## 👨‍💻 Esempio completo

### `Car.java`

```java
package com.azienda;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public void drive() {
        System.out.println("Sto guidando...");
    }
}
```

### `LoggingAspect.java`

```java
package com.azienda;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.azienda.Car.drive(..))")
    public void logPrimaDelMetodo(JoinPoint joinPoint) {
        System.out.println("LOG: metodo → " + joinPoint.getSignature().getName());
    }
}
```

### ▶️ Output:

```
LOG: metodo → drive
Sto guidando...
```

---

## 📚 Sintassi spiegata

```java
@Before("execution(* com.azienda.Car.drive(..))")
```

| Parte | Significato |
|-------|-------------|
| `@Before` | esegue il metodo **prima** di `drive()` |
| `execution` | specifica quale metodo intercettare |
| `*` | qualsiasi tipo di ritorno |
| `com.azienda.Car` | nome completo della classe |
| `drive(..)` | metodo con qualsiasi parametro |

---

## 🔄 Più metodi diversi, stesso messaggio

### `Plane.java`
```java
@Component
public class Plane {
    public void fly() {
        System.out.println("Sto pilotando...");
    }
}
```

### `Ship.java`
```java
@Component
public class Ship {
    public void sail() {
        System.out.println("Sto navigando...");
    }
}
```

### `Aspect` comune:

```java
@Aspect
@Component
public class MezzoAspect {

    @Before("execution(* com.azienda.Car.drive(..)) || execution(* com.azienda.Plane.fly(..)) || execution(* com.azienda.Ship.sail(..))")
    public void guidaUniversale() {
        System.out.println("Sto guidando...");
    }
}
```

🔁 Così ogni metodo stampa “Sto guidando...” anche se internamente fa cose diverse.

---

## 🎯 Logica trasversale vs logica specifica

| Esempio                          | È trasversale? | Dove va?          |
|----------------------------------|----------------|--------------------|
| `Sto guidando...` per tutti      | ✅              | Aspect             |
| `Sto navigando...` solo per Ship | ❌              | Dentro `Ship.java` |
| Logging                          | ✅              | Aspect             |
| Sicurezza                        | ✅              | Aspect             |

---

## 📁 Organizzazione dei file

| File                 | Contenuto principale         |
|----------------------|------------------------------|
| `Car.java`           | Logica della macchina        |
| `Plane.java`         | Logica dell’aereo            |
| `LoggingAspect.java` | Logging automatico           |
| `MezzoAspect.java`   | Comportamenti comuni         |

---

## ✅ Vantaggi di AOP

- Scrivi comportamenti **una sola volta**
- Codice principale **pulito**
- Facile da aggiornare: cambi l’aspect, non 10 classi
- Perfetto per logging, sicurezza, audit, performance...

---

> _"AOP è come mettere una videocamera invisibile attorno al tuo codice: vede e agisce, senza essere dentro."_ 🎥✨