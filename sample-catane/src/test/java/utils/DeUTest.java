package utils;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;

public class DeUTest {

    
    @Test
    @DisplayName("6000 lancé de dé pour un dé à 6 faces")
    void lanceDe6faces() {
        De de1 = new De(6);
        int i = 0;
        //On va tester 6000 lancé de Dé pour être sur que ça marche bien
        while (i < 6000) {
            de1.lanceDe();
            assertThat(de1.getValeurDe()).isBetween(1, 6);
            i++;
        }
    }


}
