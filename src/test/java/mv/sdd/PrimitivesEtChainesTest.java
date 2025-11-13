package mv.sdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimitivesEtChainesTest {

    @Test
    void entiersEtBooleens() {
        int a = 2, b = 3;
        assertEquals(5, a + b);
        assertTrue((a + b) > 0);
        assertFalse((a - b) > 0);
    }

    @Test
    void doublesEtDelta() {
        double x = 0.1 + 0.2; // précision binaire
        assertEquals(0.3, x, 1e-9); // tolérance
    }

    @Test
    void caracteres() {
        char c = 'A';
        assertEquals(65, (int) c);
        assertTrue(Character.isLetter(c));
    }

    @Test
    void chainesCaracteres() {
        String s = "  Bonjour  ";
        assertEquals("BONJOUR", s.trim().toUpperCase());
        assertTrue(s.contains("Bon"));
        assertEquals(7, s.trim().length());
    }
}
