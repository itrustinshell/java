# Che cos'è `pom.xml`

Il file `pom.xml` è il cuore di un progetto gestito con **[Apache Maven](maven.md)**, uno strumento di build molto usato nel mondo Java.

Quindi il file pom.xml e' uno strumento nella "cassetta degli attrezzi" di Maven.

## Cosa significa POM

**POM** sta per **Project Object Model**. 

Il file `pom.xml` descrive:
- Le informazioni sul progetto (nome, versione, descrizione)
- Le dipendenze (le librerie esterne da includere)
- I [plugin](plugin.md) da usare durante la build
- Le configurazioni di compilazione, test, pacchettizzazione, ecc.
- I repository Maven da cui scaricare artefatti

## A cosa serve

Maven legge `pom.xml` per sapere:
- Come costruire il progetto
- Quali librerie esterne includere
- Come impacchettare il codice (es. in un file `.jar` o `.war`)
- Come eseguire i test automatici
- Come pubblicare l'applicazione

In breve, `pom.xml` definisce tutto il ciclo di vita del progetto.

## Esempio base di `pom.xml`

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    
    <modelVersion>4.0.0</modelVersion>
    
    <groupId>com.example</groupId>
    <artifactId>mio-progetto</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <!-- Dipendenze qui -->
    </dependencies>

</project>
```

## 📁 Il tag `<project></project>`

Questo è l'**elemento radice** del file `pom.xml`, e contiene informazioni che dicono:

> “Questo è un file XML valido secondo le regole di Maven”.

---

### 📌 Attributi del tag `<project>`

#### 🔹 `xmlns="http://maven.apache.org/POM/4.0.0"`

- Specifica il **namespace XML di Maven**.
- Serve per dire: "questo file segue le regole del POM (Project Object Model) versione 4.0.0".
- C'è scritto `apache` perché **Maven è un progetto sviluppato dalla Apache Software Foundation**. [chicca dell'ordine inverso](ordineinverso.md)

---

#### 🔹 `xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"`

- Abilita l'uso di **schema XML (XSD)** per validare la struttura del file.

#### 🔹 `xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd"`

- Indica **dove trovare il file XSD** (schema XML) per convalidare che il `pom.xml` sia scritto correttamente.

---

### 🧠 In parole semplici

> Questa riga dice:  
> “Questo file è un `pom.xml` valido secondo Maven 4.0.0, e può essere validato con questo schema online”.

✅ **Non devi mai modificarla**. Maven la usa per capire come leggere e validare il tuo progetto.
