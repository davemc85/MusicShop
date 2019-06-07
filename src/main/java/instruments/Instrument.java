package instruments;

public abstract class Instrument {

    private String name;
    private double sellingPrice;
    private double purchasedPrice;
    private Family family;
    private String material;

    public Instrument(String name, double sellingPrice, double purchasedPrice, Family family, String material){
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.purchasedPrice = purchasedPrice;
        this.family = family;
        this.material = material;
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

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
