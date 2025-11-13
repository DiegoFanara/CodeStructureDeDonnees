package mv.sdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class ArraysTest {

    @Test
    void comparaisonTableaux() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        // Pour les tableaux, utiliser Arrays.equals
        assertTrue(Arrays.equals(a, b));
    }

    @Test
    void triEtRecherche() {
        int[] data = {5, 1, 4, 2};
        Arrays.sort(data);
        assertArrayEquals(new int[]{1, 2, 4, 5}, data);
        assertTrue(Arrays.binarySearch(data, 4) >= 0);
    }
}
