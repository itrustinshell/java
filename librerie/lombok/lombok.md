# Lombok - Cos'è e cosa fa

**Lombok** è una **libreria Java** progettata per ridurre il _boilerplate code_, ovvero tutto quel codice ripetitivo che si scrive spesso nei progetti Java (getter, setter, costruttori, `toString()`, `equals()`, ecc.).

## Cosa fa Lombok?

Lombok usa delle **annotazioni speciali** per generare automaticamente codice durante la compilazione, semplificando notevolmente le classi Java.

### Esempio senza Lombok

```java
public class Persona {
    private String nome;
    private int età;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getEtà() { return età; }
    public void setEtà(int età) { this.età = età; }
}
```

### Esempio con Lombok

```java
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {
    private String nome;
    private int età;
}
```

## Annotazioni più comuni

- `@Getter` / `@Setter`: genera automaticamente i metodi getter e setter.
- `@ToString`: genera il metodo `toString()`.
- `@EqualsAndHashCode`: genera `equals()` e `hashCode()`.
- `@NoArgsConstructor`, `@AllArgsConstructor`, `@RequiredArgsConstructor`: generano costruttori.
- `@Data`: combina `@Getter`, `@Setter`, `@ToString`, `@EqualsAndHashCode`, e `@RequiredArgsConstructor`.
- `@Builder`: abilita l’uso del **builder pattern** per creare oggetti in modo fluido.
- `@Slf4j`: crea automaticamente un logger con `private static final Logger log = LoggerFactory.getLogger(...)`.

## In sintesi

Lombok è molto utile per scrivere meno codice ripetitivo e concentrarsi sulla logica dell’applicazione.  
Tuttavia, poiché genera codice in fase di compilazione, può richiedere una corretta configurazione dell’IDE per essere usato senza problemi.
