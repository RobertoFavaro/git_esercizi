package testing1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main test = new Main();

    @Test
    void somma_di_due_integer() {
        Integer result = test.somma(1,2);
        assertEquals(3, result);
    }
    @Test
    void somma_di_integer_negativo() {
        Integer result = test.somma(-1,2);
        assertEquals(1, result);
    }
    @Test
    void somma_di_null_e_integer() {
        Integer result = test.somma(null,2);
        assertNull(result);
    }
}