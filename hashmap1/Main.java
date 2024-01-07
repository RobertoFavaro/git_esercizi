package hashmap1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> primo = new HashMap<>();
        primo.put("Uno", 1);
        primo.put("Due", 2);
        primo.put("Tre", 3);
        System.out.println(primo);


        HashMap<String, Integer> secondo = new HashMap<String, Integer>() {{
            put("Quattro", 4);
            put("Cinque", 5);
            put("Sei", 6);
        }};
        System.out.println(secondo);

        // Metodo 3: Utilizzo di Stream API (Java 8 e versioni successive)
        HashMap<String, Integer> terzo = new HashMap<>();
        terzo.put("Sette", 7);
        terzo.put("Otto", 8);
        terzo.put("Nove", 9);
        System.out.println(terzo);
    }
}
