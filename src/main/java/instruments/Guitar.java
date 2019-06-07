package instruments;

import interfaces.IPlay;

public class Guitar extends Instrument implements IPlay {

    private String type;

    public Guitar(String name, double sellingPrice, double purchasedPrice, Family family, String material, String type){
        super(name, sellingPrice, purchasedPrice, family, material);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String makeSound(){
        return "Strummy strum strum";
    }
}
