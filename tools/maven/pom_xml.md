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
