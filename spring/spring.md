# 🌱 Spring Framework - Introduzione

## Cos'è Spring?

**Spring** è un framework open-source per lo sviluppo di applicazioni Java. È progettato per semplificare la creazione di applicazioni robuste, flessibili e manutenibili.

---

## 🔧 Caratteristiche Principali

- **[Inversion of Control (IoC)](inversion_of_control.md)**  
  Gestione automatica delle dipendenze tra oggetti, tramite container Spring.

- **Aspect-Oriented Programming (AOP)**  
  Separazione delle logiche trasversali come logging, sicurezza, gestione transazioni, ecc.

- **Spring MVC**  
  Modulo per sviluppare applicazioni web seguendo il pattern Model-View-Controller.

- **Spring Boot**  
  Tool che semplifica la configurazione e il deployment di applicazioni Spring.

- **Modularità**  
  Spring è composto da vari moduli: Core, Web, Security, Data, Cloud, ecc.

---

## 📦 Esempio di Applicazione Spring Boot

```java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Ciao da Spring!";
    }
}
```

---

## 🚀 Perché Usare Spring?

- Ampiamente usato nel settore enterprise  
- Documentazione completa e community attiva  
- Facilita lo sviluppo di microservizi  
- Compatibile con numerose tecnologie (JPA, REST, WebSocket, Kafka, ecc.)

---

## 📚 Risorse Utili

- [Sito ufficiale Spring](https://spring.io/)
- [Spring Boot Guida Introduttiva](https://spring.io/guides/gs/spring-boot/)

---

> _"Write once, run everywhere... ma con Spring, anche bene!"_