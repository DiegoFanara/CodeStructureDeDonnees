package mv.sdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class CollectionsTest {

    @Test
    void listMutableEtLecture() {
        List<String> fruits = new ArrayList<>(List.of("pomme", "banane"));
        fruits.add("poire");
        assertEquals(3, fruits.size());
        assertEquals("banane", fruits.get(1));
        assertIterableEquals(List.of("pomme", "banane", "poire"), fruits);
    }

    @Test
    void setUniciteEtOrdre() {
        Set<String> tags = new HashSet<>();
        tags.add("java"); tags.add("java"); tags.add("junit");
        assertEquals(2, tags.size());         // unicité
        assertTrue(tags.contains("java"));
    }

    @Test
    void mapInsertionLectureValeurs() {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        assertEquals(2, ages.size());
        assertEquals(30, ages.get("Alice"));
        assertTrue(ages.containsKey("Bob"));
        assertTrue(ages.containsValue(25));
    }

    @Test
    void collectionsImmatEtVue() {
        List nonModifiable = List.of("a", "b");
        assertThrows(UnsupportedOperationException.class, () -> nonModifiable.add("c"));

        List vue = Arrays.asList("x", "y"); // taille fixe
        assertThrows(UnsupportedOperationException.class, () -> vue.add("z"));
        vue.set(0, "X");                   // mais remplaçable
        assertEquals(List.of("X", "y"), vue);
    }
}
