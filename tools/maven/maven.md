# Guida semplice a Maven e primo progetto Spring

## Cos'è Maven?

Maven è un **tool per Java** che fa 3 cose fondamentali:

---

### 1. Gestisce le librerie (dipendenze)

In Java non tutto è incluso "di base", quindi ogni progetto spesso ha bisogno di librerie esterne, tipo:

- Spring
- Hibernate
- JUnit
- ecc.

Con Maven, ti basta scrivere il nome della libreria nel file [pom.xml](pom_xml.md), e lui:

- La scarica da internet (Maven Central)
- La aggiunge al tuo progetto
- La tiene aggiornata

Quindi, in Java, una **dipendenza** è una libreria esterna che il tuo progetto usa.  
Esempio: se vuoi usare Spring Security, devi "dirlo" a Java, così può scaricarla e usarla.

---

### 2. Gestisce la compilazione

Compila tutto il progetto con un semplice comando:

```bash
mvn compile
```

Maven sa **dove stanno i tuoi file**, **in che ordine compilarli**, e li mette nella cartella `target/`.

---

### 3. Organizza la struttura del progetto

Maven usa una **struttura standard**, che è quella che stiamo usando:

```
src/
  main/
    java/         → codice Java
    resources/    → file XML, config
```

Così non devi decidere ogni volta dove mettere cosa: Maven lo sa già.

---

## Attenzione: la struttura del progetto è fondamentale

**Se usi Maven, devi usare questa struttura di cartelle:**

```
src/
  main/
    java/         → codice Java
    resources/    → file XML, config
```

Maven si aspetta questa struttura per funzionare **correttamente**.

Se non la rispetti:
- I comandi `mvn compile`, `mvn exec:java`, ecc. **non funzionano**
- Devi configurare Maven a mano (molto più complicato)

> **Conclusione:** Segui la struttura standard, ti semplifica tutto.

---

## Esempio concreto

Come abbiamo già detto, in Java, una **dipendenza** è una libreria esterna che il tuo progetto usa.  
Esempio: se vuoi usare Spring Security, devi "dirlo" a Java, così può scaricarla e usarla. Andiamo a fare un esempio con una dipendenza che si chiama spring-context (Spring-context è una libreria Java del framework Spring, e contiene: il contenitore IoC (Inversion of Control), gestione dei bean, iniezione di dipendenze, supporto per @Component, @Autowired, @Configuration, @Bean, ecc. Insomma, è il cuore del meccanismo di configurazione di Spring).

Nel file `pom.xml`, scrivi:

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.30</version>
</dependency>
```

| Riga                  | Significato |
|-----------------------|-------------|
| `<dependency>`        | Stai dicendo "voglio usare una nuova libreria" |
| `<groupId>`           | Il gruppo a cui appartiene la libreria, l'organizzazione che produce la libreria (qui: Spring Boot) |
| `<artifactId>`        | Il nome esatto della libreria, il modulo/libreria specifica che vuoi usare (qui: spring-context) |
| `</dependency>`       | Fine |

Immagina Maven come un grande negozio di libri.

Per trovare il libro giusto, ti servono:
- groupId → il nome dell’editore (es: "Spring Framework")
- artifactId → il titolo esatto del libro (es: "Spring Context")
- version → l'edizione (es: 5ª edizione)


Maven fa:

- Cerca Spring su internet
- Lo scarica
- Lo mette in automatico tra le librerie del tuo progetto


---

## In pratica: Maven = npm/pip per Java

| Tool     | Linguaggio | Usa file...         | Installa...       |
|----------|------------|---------------------|--------------------|
| npm      | JavaScript | `package.json`      | librerie npm       |
| pip      | Python     | `requirements.txt`  | pacchetti pip      |
| Maven    | Java       | `pom.xml`           | librerie Java      |

---

# Inizio del progetto HelloSpring (senza Spring Boot)

### Obiettivo

Creare una semplice app Spring (senza Spring Boot) che stampa un messaggio tramite un bean gestito da Spring.

---

## Struttura del progetto

```
HelloSpring/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/example/hellospring/
        │       ├── MessageService.java
        │       ├── HelloPrinter.java
        │       └── App.java
        └── resources/
            └── beans.xml
```

---

## File `MessageService.java`

```java
package com.example.hellospring;

public class MessageService {
    public String getMessage() {
        return "Ciao dal mondo di Spring!";
    }
}
```

### Spiegazione

- Il `package` serve per organizzare le classi, come i namespace in C++.
- Il metodo `getMessage()` ritorna una stringa semplice.



