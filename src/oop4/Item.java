package oop4;

public class Item {
    private int quantityOfProduct;
    private final Product product;
    private int price;

    public Item(int quantityOfProduct, Product product) {
        this.quantityOfProduct = quantityOfProduct;
        this.product = product;
    }


    public double getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public void setQuantityOfProduct(int quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    public Product getProduct() {
        return product;
    }
    public int getPrice(){
        return price;
    }

}
