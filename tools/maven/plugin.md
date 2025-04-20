## Plugin nella build Maven

I **plugin** sono componenti fondamentali di Maven e servono ad estendere le funzionalità di Maven.  

Significa che:
- Maven, di base, ha un comportamento minimo
- Tutte le funzionalità principali (compilazione, testing, impacchettamento, ecc.) vengono eseguite **tramite plugin**
- Gli sviluppatori possono **aggiungere nuovi plugin**, **sostituire quelli esistenti** o **personalizzarli**, direttamente nel file `pom.xml`

### Perché è utile?

Questa architettura rende Maven:
- **Flessibile**: puoi adattarlo a qualsiasi tipo di progetto
- **Modulare**: puoi usare solo i plugin di cui hai bisogno
- **Estensibile**: puoi anche creare i tuoi plugin personalizzati

## Esempio pratico

Senza plugin, Maven non saprebbe nemmeno compilare il codice Java.  
Serve dire esplicitamente:

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.10.1</version>
</plugin>
```

Con questa configurazione, Maven "impara" a compilare il progetto.

---

In sintesi:
> Un **componente estendibile** è come una base alla quale puoi aggiungere strumenti, funzionalità o comportamenti, senza modificarne il nucleo originale.

I plugin sono usati per eseguire operazioni durante il ciclo di build come compilazione, testing, creazione di JAR, deploy, ecc.

I plugin si configurano all'interno della sezione `<build>` del `pom.xml`.

### Esempi di plugin

#### 1. Maven Compiler Plugin
Serve per compilare il codice Java e specificare la versione del linguaggio da usare:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.10.1</version>
            <configuration>
                <source>17</source>
                <target>17</target>
            </configuration>
        </plugin>
    </plugins>
</build>
```

#### 2. Maven Surefire Plugin
Serve per eseguire i test automatici durante la build (es. test scritti con JUnit):

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.0.0</version>
</plugin>
```

### Dove si usano

Maven esegue questi plugin automaticamente nelle varie fasi del [ciclo di build](build.md) (validate, compile, test, package, verify, install, deploy).
