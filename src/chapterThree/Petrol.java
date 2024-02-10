package chapterThree;

public class Petrol {
    private String location;
    private String petrol;
    private int quantity;
    private double litre;
    private double discount;
    private double purchaseAmount;
    public Petrol(String location, String petrol, int quantity, double litre, double discount){
        this.location = location;
        this.petrol = petrol;
        this.quantity = quantity;
        this.litre = litre;
        this.discount = discount;
        this.purchaseAmount = purchaseAmount;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getPetrol(){
        return petrol;
    }
    public void setPetrol(String petrol){
        this.petrol = petrol;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public double getLitre(){
        return litre;
    }
    public void setLitre(double litre){
        this.litre = litre;
    }
    public double getDiscount(){
        return discount;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
    public double getPurchaseAmount(){
        purchaseAmount = litre*quantity*(1-discount/100.0);
        return purchaseAmount;
    }
    public void setPurchaseAmount(double purchaseAmount){
        this.purchaseAmount = purchaseAmount;
    }


}

