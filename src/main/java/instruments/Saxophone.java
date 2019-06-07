package instruments;

public class Saxophone extends Instrument {

    private boolean reedIncluded;

    public Saxophone(String name, double sellingPrice, double purchasedPrice, Family family, String material, boolean reedIncluded) {
        super(name, sellingPrice, purchasedPrice, family, material);
        this.reedIncluded = reedIncluded;
    }

    public boolean isReedIncluded() {
        return reedIncluded;
    }

    public void setReedIncluded(boolean reedIncluded) {
        this.reedIncluded = reedIncluded;
    }

    public String makeSound(){
        return "Jazzy blues";
    }
}
