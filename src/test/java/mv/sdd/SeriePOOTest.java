
package mv.sdd;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeriePooTest {

    @Test
    @DisplayName("Convertir une chaine en miniscule")
    void chaineMajToMin() {
        String resultat = SeriePOO.chaineMajToMin("Bonjour!");
        assertEquals("bonjour!", resultat);
    }

    @Test
    @DisplayName("Convertir une chaine en majuscule")
    void chaineMinToMaj() {
        String resultat = SeriePOO.chaineMinToMaj("Bonjour!");
        assertEquals("BONJOUR!", resultat);
    }

    @Test
    @DisplayName("Test avec chaine contient des caractères spéciaux et lettres")
    void chaineAlphabSansCharSpeciaux() {
        String resultat = SeriePOO.chaineSansCharSpeciaux("Bonj@u%r!");
        assertEquals("Bonjur", resultat);
    }

    @Test
    @DisplayName("Test avec chaine contient des caractères spéciaux, des lettres et des chiffres")
    void chaineAlphNumSansCharSpeciaux(){
        String resultat = SeriePOO.chaineSansCharSpeciaux("Bonjour2!");
        assertEquals("Bonjour2", resultat);
    }

    @Test
    @DisplayName("Rejette le calule pour un montant négatif")
    void claculerTaxesVenteMontantNegatif(){
        assertThrows(IllegalArgumentException.class, ()-> SeriePOO.claculerTaxesVente(-100, false, false));
    }
}
