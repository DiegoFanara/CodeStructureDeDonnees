
package mv.sdd;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
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
    @Tag("Calculer Montant")
    @DisplayName("Rejette le calcule pour un montant négatif")
    void claculerTaxesVenteMontantNegatif(){
        assertThrows(IllegalArgumentException.class, ()-> SeriePOO.claculerTaxesVente(-100, false, false));
    }

    @Test
    @DisplayName("Losque le montant est null ou == 0")
    void calculerTaxeVenteMontantNull(){
        double resultat = SeriePOO.claculerTaxesVente(0, false, false);
        assertEquals(0, resultat);
    }

    @Test
    @DisplayName("Lorsque le montant = 100 et F, F")
    void calculerTaxeVenteMontantFF(){
        double resultat = SeriePOO.claculerTaxesVente(100, false, false);
        assertEquals(100, resultat);
    }

    @Test
    @DisplayName("Lorsque le montant = 100 et F, T")
    void calculerTaxeVenteMontantFT(){
        double resultat = SeriePOO.claculerTaxesVente(100, false, true);
        assertEquals(105, resultat, 0.1);
    }

    @Test
    @DisplayName("Lorsque le montant = 100 et T, F")
    void calculerTaxeVenteMontantTF(){
        double resultat = SeriePOO.claculerTaxesVente(100, true, false);
        assertEquals(109.97, resultat, 0.1);
    }

    @Test
    @DisplayName("Lorsque le montant = 100 T, T")
    void calculerTaxeVenteMontantTT(){
        double resultat = SeriePOO.claculerTaxesVente(100, true, true);
        assertEquals(114.97, resultat, 0.1);
    }

}
