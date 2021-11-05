package service;

import entity.Product;
import repository.ProductRepository;
import ultils.SortProductByNameAsc;
import ultils.SortProductByPriceAsc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductService {
    private ProductRepository productRepository = new ProductRepository();

    public void addProduct(Product p) {
        productRepository.addProduct(p);
    }

    public boolean editProduct(Product p) {
        return productRepository.editProduct(p);
    }

    public boolean deleteProduct(int id) {
        return productRepository.deleteProduct(id);
    }

    public ArrayList<Product> getProductList() {
        return productRepository.getProductList();
    }

    public Product getProductById(int id) {
        return productRepository.getProductById(id);
    }

    public ArrayList<Product> findProductByName(String name) {
        return productRepository.findProductByName(name);
    }

    public void sortByNameAsc(List<Product> list) {
        Collections.sort(list, new SortProductByNameAsc());
    }
    public void sortByPriceAsc(List<Product> list) {
        Collections.sort(list, new SortProductByPriceAsc());
    }
}
