package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String material, String make, String model, int buyingPrice, int sellingPrice, int numberOfStrings){
        super(material, make, model,buyingPrice, sellingPrice);
        this.numberOfStrings= numberOfStrings;
    }

    public int getNumberOfStrings(){
        return this.numberOfStrings;
    }

    public String play(){
        return "Struuummm!";
    }

    public int calcProfitMargin() {
        return 150;
    }
}
