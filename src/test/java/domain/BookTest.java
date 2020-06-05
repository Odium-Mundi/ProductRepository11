package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

        private Book book4 = new Book(4, "book4", 10, "Who");

    @Test
    void shouldSearchBookOfAuthor() {
        boolean actual = book4.matches("Who");

        assertTrue(actual);
    }

    @Test
    void shouldSearchBookOfName() {
        boolean actual = book4.matches("book4");

        assertTrue(actual);
    }

}