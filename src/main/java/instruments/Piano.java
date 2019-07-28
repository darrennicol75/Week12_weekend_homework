package instruments;

public class Piano extends Instrument{

    private int numberOfKeys;

    public Piano(String material, String make, String model, int buyingPrice, int sellingPrice, int numberOfKeys){
        super(material, make, model,buyingPrice, sellingPrice);
        this.numberOfKeys = numberOfKeys;
    }


    public int getNumberOfKeys(){
        return this.numberOfKeys;
    }

    public String play(){
        return "plink plonk!";
    }

    public int calcProfitMargin() {
        return 300;
    }

}
