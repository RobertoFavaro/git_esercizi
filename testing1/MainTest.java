package testing1;

import org.junit.jupiter.api.Test;
import testing_generale_prova_video.Main;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private testing1.Main test = new testing1.Main();

    @Test
    void somma_di_due_integer() {
        Integer result = test.somma(1,2);
        assertEquals(3, result, "Somma di 1 + 2 dovrebbe essere 3");
    }
    @Test
    void somma_di_integer_negativo() {
        Integer result = test.somma(-1,2);
        assertEquals(1, result, "Somma di -1 + 2 dovrebbe essere 1");
    }
    @Test
    void somma_di_null_e_integer() {
        Integer result = test.somma(null,2);
        assertNull(result, "Se uno dei parametri è null risultato è null");
    }
}