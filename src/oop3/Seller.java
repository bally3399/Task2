package oop3;

import java.util.ArrayList;
import java.util.List;

public class Seller extends User {
    private List<Item> item = new ArrayList<>();
    public Seller(int age, String emailAddress, String name, String password, String phone) {
        super(age, emailAddress, name, password, phone);
    }
}
