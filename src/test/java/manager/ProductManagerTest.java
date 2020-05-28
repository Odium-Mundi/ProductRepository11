package manager;

import domain.Book;
import domain.Product;
import domain.Smartphone;
import org.junit.jupiter.api.Test;
import repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    private ProductRepository repository = new ProductRepository();
    private ProductManager manager = new ProductManager(repository);

    private Product book1 = new Book(1, "book1", 100, "I am");
    private Product book2 = new Book(2, "book2", 200, "I am");
    private Product book3 = new Book(3, "book3", 30, "No I am");
    private Product smartphone1 = new Smartphone(1, "iphone", 100, "apple");


    @Test void shouldSearchBySmartphoneProducer() {

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);

        Product[] actual = manager.searchBy("apple") ;
        Product[] expected = new Product[]{smartphone1};

        assertArrayEquals(expected,actual);
    }

    @Test void shouldSearchBySmartphoneName() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);

        Product[] actual = manager.searchBy("iphone");
        Product[] expected = new Product[]{smartphone1};

        assertArrayEquals(expected,actual);
    }

    @Test void shouldSearchByBookName() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);

        Product[] actual = manager.searchBy("book1");
        Product[] expected = new Product[]{book1};

        assertArrayEquals(expected, actual);
    }

    @Test void shouldSearchByBookAuthor() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);

        Product[] actual = manager.searchBy("I am");
        Product[] expected = new Product[]{book1,book2};

        assertArrayEquals(expected, actual);
    }

    @Test void shouldSearchByNoExistsProduct() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);

        Product[] actual = manager.searchBy("");
        Product[] expected = new Product[]{};

        assertArrayEquals(expected, actual);
    }



}