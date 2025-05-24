
# Struttura di Studio: Java + Spring + Spring Boot

Organizzazione consigliata per studiare Java in modo progressivo e ordinato.

```
/java-studio
│
├── /00-introduzione
│   └── installazione-java-jdk-ide.txt
│
├── /01-base
│   ├── tipi-di-dati
│   ├── operatori
│   ├── array-e-stringhe
│   └── esercizi-base
│
├── /02-oop
│   ├── classi-e-oggetti
│   ├── ereditarietà
│   ├── interfacce
│   ├── polimorfismo
│   └── esercizi-oop
│
├── /03-collezioni
│   ├── liste-map-set
│   ├── lambda-stream
│   └── esercizi-collezioni
│
├── /04-avanzato
│   ├── eccezioni
│   ├── thread
│   ├── IO e File
│   └── JDBC (connessione DB semplice)
│
├── /05-frameworks
│   ├── /spring
│   │   ├── /core
│   │   │   ├── IOC-container
│   │   │   ├── beans
│   │   │   └── dependency-injection
│   │   ├── /mvc
│   │   ├── /security
│   │   ├── /data-jpa
│   │   └── /springboot
│   │       ├── progetto-demo
│   │       ├── configurazioni
│   │       ├── @SpringBootApplication
│   │       ├── REST API base
│   │       └── esempi con DB
│   └── /altri (opzionale in futuro)
│       └── hibernate, vaadin, ecc.
│
├── /06-progetti
│   ├── hello-world-console
│   ├── rubrica-oop
│   ├── rest-api-springboot
│   └── app-springboot-db
```

## Suggerimenti

- Usa nomi chiari per file e cartelle.
- Crea i progetti Spring Boot tramite IDE o Spring Initializr.
- Mantieni separati teoria, esercizi e progetti veri e propri.

## 📚 Principali Librerie Utili (Java + Spring)

### 🔹 Java (generali)
- **JUnit** – testing unitario
- **Mockito** – mocking per test
- **Lombok** – riduce il boilerplate (getter/setter, costruttori)
- **Log4j / SLF4J** – logging
- **Jackson / Gson** – serializzazione/deserializzazione JSON
- **Apache Commons** – utilità varie per collezioni, stringhe, IO
- **JDBC / HikariCP** – accesso ai database relazionali

### 🔹 Spring e Spring Boot
- **Spring Core** – contenitore di dipendenze, IOC, bean
- **Spring MVC** – costruzione di applicazioni web (REST controller)
- **Spring Boot Starter Web** – REST API semplificato
- **Spring Security** – autenticazione e autorizzazione
- **Spring Data JPA** – accesso ai database con JPA/Hibernate
- **Spring Boot DevTools** – ricaricamento automatico durante lo sviluppo
- **Spring Boot Actuator** – monitoraggio e gestione applicazione
- **Thymeleaf** – motore di template per frontend HTML

### 🔹 Database e strumenti correlati
- **H2 / PostgreSQL / MySQL Driver** – database embedded o relazionali
- **Flyway / Liquibase** – versionamento schema database
- **Hibernate** – ORM usato sotto Spring Data JPA

### 🔹 Tool e build
- **Maven / Gradle** – gestione delle dipendenze e build
- **Spring Initializr** – generatore di progetti Spring Boot
