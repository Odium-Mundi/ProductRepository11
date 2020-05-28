package manager;

import domain.Book;
import domain.Product;
import domain.Smartphone;
import repository.ProductRepository;

public class ProductManager {
    private ProductRepository repository;

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(Product item) {
        repository.save(item);
    }

    public Product[] searchBy(String text) {
        Product[] conformity = new Product[0];
        for (Product product : repository.findAll()) {
            if (product.matches(text)) {
                Product[] tmp = new Product[conformity.length + 1];
                System.arraycopy(conformity, 0, tmp, 0, conformity.length);
                tmp[tmp.length - 1] = product;
                conformity = tmp;
            }
        }
        return conformity;
    }

}
