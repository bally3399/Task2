package oop4;

import java.util.ArrayList;
import java.util.List;

public class SuperMarket {
    private final List<Product> products = new ArrayList<>();
    private final List<Customer> customers = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public boolean productExists(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    public void join(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomer() {
        return customers;
    }

    public void left(Customer customer) {
        customers.remove(customer);
    }


    public boolean isEmpty() {
        return true;
    }
}
