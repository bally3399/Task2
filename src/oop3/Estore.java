package oop3;

import java.util.ArrayList;
import java.util.List;

public class Estore {
    private final List<Customer> customers = new ArrayList<>();
    private final List<Seller> sellers = new ArrayList<>();
    private List<Admin> admin = new ArrayList<>();

    public void add(Seller seller) {
        sellers.add(seller);
    }
}