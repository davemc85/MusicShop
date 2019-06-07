package instruments;

public class Piano extends Instrument {

    private String type;

    public Piano(String name, double sellingPrice, double purchasedPrice, Family family, String material, String type) {
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
        return "Tickling the ivories";
    }
}
