package accessories;

import interfaces.ISell;

public abstract class Accessory implements ISell {

    private String name;
    private double sellingPrice;
    private double purchasedPrice;

    public Accessory(String name, double sellingPrice, double purchasedPrice){
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.purchasedPrice = purchasedPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getPurchasedPrice() {
        return purchasedPrice;
    }

    public void setPurchasedPrice(double purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
    }

    public double calculateMarkup(){
        return sellingPrice - purchasedPrice;
    }
}
