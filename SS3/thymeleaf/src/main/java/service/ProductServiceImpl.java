package service;

import model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImpl implements IProductService {
    private static final Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "Laptop", 1500.0, "Gaming laptop", "ASUS"));
        products.put(2, new Product(2, "Phone", 999.0, "Smartphone", "Apple"));
    }

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    public Product findById(int id) {
        return products.get(id);
    }

    public void save(Product product) {
        int newId = products.size() + 1;
        product.setId(newId);
        products.put(newId, product);
    }

    public void update(int id, Product product) {
        product.setId(id);
        products.put(id, product);
    }

    public void delete(int id) {
        products.remove(id);
    }

    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product p : products.values()) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }
}
