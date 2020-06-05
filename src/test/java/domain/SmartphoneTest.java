package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    private Smartphone smartphone2 = new Smartphone(4, "smart2", 10, "China");

    @Test
    void shouldSearchSmartphoneOfProducer() {
        boolean actual = smartphone2.matches("China");

        assertTrue(actual);
    }

    @Test
    void shouldSearchSmartphoneOfName() {
        boolean actual = smartphone2.matches("smart2");

        assertTrue(actual);
    }

}