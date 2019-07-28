import interfaces.ISell;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private ArrayList<ISell> inventory;


    public MusicShop(String name){
        this.name = name;
        this.inventory = new ArrayList<ISell>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<ISell> getInventory(){
        return this.inventory;
    }

    public int inventoryCount(){
        return this.inventory.size();
    }

    public void addItem(ISell item){
        this.inventory.add(item);
    }

    public void removeItem(ISell item){
        this.inventory.remove(item);
    }

    public int calcProfitMargin() {
        int profit = 0;
        for(ISell item : this.inventory) {
            profit += item.calcProfitMargin();
        }
        return profit;
    }
}
