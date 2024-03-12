package oop4;


import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> items = new ArrayList<>();
    private boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public void add(Item item) {
        items.add(item);
    }


    public void remove(Item product) {
        items.remove(product);
    }
    public double calculateTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantityOfProduct();
        }
        return total;
    }
        public List<Item> getItems(){
        return items;
    }

}
