package instruments;

public class DrumKit extends Instrument {

    private int numberOfDrums;

    public DrumKit(String name, double sellingPrice, double purchasedPrice, Family family, String material, int numberOfDrums) {
        super(name, sellingPrice, purchasedPrice, family, material);
        this.numberOfDrums = numberOfDrums;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    public void setNumberOfDrums(int numberOfDrums) {
        this.numberOfDrums = numberOfDrums;
    }
}
