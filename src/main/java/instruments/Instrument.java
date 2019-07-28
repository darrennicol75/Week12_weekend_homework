package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String make;
    private String model;
    private int buyingPrice;
    private int sellingPrice;

    public Instrument(String material, String make, String model, int buyingPrice, int sellingPrice) {
        this.material = material;
        this.make = make;
        this.model = model;
        this.buyingPrice= buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMaterial(){
        return this.material;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public int getBuyingPrice(){
        return this.buyingPrice;
    }

    public int getSellingPrice(){
        return this.sellingPrice;
    }
}
