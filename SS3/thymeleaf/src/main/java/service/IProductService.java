package service;

import java.util.List;

import model.Product;

public interface IProductService {
    List<Product> findAll();
    Product findById(int id);
    void save(Product product);
    void update(int id, Product product);
    void delete(int id);
    List<Product> searchByName(String name);
}
