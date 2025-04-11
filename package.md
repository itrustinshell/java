# Java Package: guida completa e semplice

## Cos'è un `package` in Java?

Un **package** è un contenitore logico per le classi Java, molto simile a:
- i **namespace** in C++
- i **moduli** in Python

Serve per:
- organizzare il codice
- evitare conflitti tra classi con lo stesso nome
- controllare la visibilità di classi e metodi (public, protected, default)

---

## Come si scrive un package?

Un package si dichiara **all'inizio di ogni file Java**, prima della classe:

```java
package com.example.hellospring;
```

> Questo indica che il file appartiene a un package (spazio di nomi) chiamato `com.example.hellospring`.

---

## Il package deve corrispondere alla cartella

Java **richiede** che il package corrisponda alla posizione del file nel filesystem.

### Esempio:
```java
package forchetta.hellospring;
```

Questa classe deve trovarsi in:
```
src/main/java/forchetta/hellospring/
```

Se il percorso non corrisponde, Java darà errore in compilazione.

---

## Come si sceglie il nome del package?

### Domanda: perché tanti package iniziano con `com`, `it`, `org`, ecc.?

### Risposta: è una **convenzione** basata sul dominio internet del progetto o dello sviluppatore.

| Dominio registrato     | Package Java consigliato       |
|------------------------|--------------------------------|
| `example.com`          | `com.example`                  |
| `miosito.it`           | `it.miosito`                   |
| `openai.org`           | `org.openai`                   |
| `luca.dev`             | `dev.luca`                     |
| `forchetta.tech`       | `tech.forchetta`               |

Questa convenzione:
- evita conflitti tra package nel mondo Java
- rende il codice identificabile e ordinato

---

## Posso usare nomi semplici?

Sì! Se stai lavorando su un progetto personale, va benissimo anche:
```java
package forchetta;
```

E metti i file in:
```
src/main/java/forchetta/
```

> L'importante è che **il package corrisponda sempre alla cartella** dove metti il file.

---

## Quanta “profondità” deve avere un package?

Dipende da quanto vuoi organizzare il tuo progetto:

### Esempi:

#### Progetto piccolo:
```java
package forchetta;
```

#### Progetto medio:
```java
package forchetta.hellospring;
```

#### Progetto grande:
```java
package it.miosito.app.service.user;
package it.miosito.app.model;
package it.miosito.app.controller;
```

---

## Quando usare `import`?

Se vuoi usare una classe che sta in un altro package, devi importarla:

```java
import forchetta.hellospring.MessageService;
```

---

## In sintesi

| Cosa fa un package         | Perché è utile                          |
|----------------------------|-----------------------------------------|
| Organizza classi           | Mantiene il progetto ordinato           |
| Evita nomi duplicati       | Due classi con lo stesso nome convivono |
| Gestisce la visibilità     | Alcuni metodi/classi sono visibili solo dentro il package |
| Segue la struttura delle cartelle | Java lo richiede                   |

---

## Conclusione

Puoi iniziare da package semplici, tipo `forchetta`, e poi approfondire man mano che il progetto cresce.  
Segui la convenzione `com.nomeazienda.progetto` solo se serve — Java non te lo impone, ma il tuo futuro "io" ti ringrazierà se lo fai.

