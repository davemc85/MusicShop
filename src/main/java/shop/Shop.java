package shop;

import interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stockItems;

    public Shop(String name){
        this.stockItems = new ArrayList<ISell>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int stockItemCount(){
        return stockItems.size();
    }

    public void addStock(ISell item){
        stockItems.add(item);
    }

    public void sellStock(ISell item){
        stockItems.remove(item);
    }

    public double calcuateProfit(){
        double profit = 0;
        for( ISell item : this.stockItems){
            profit += item.calculateMarkup();
        }
        return profit;
    }
}
