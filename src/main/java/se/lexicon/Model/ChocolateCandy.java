package se.lexicon.Model;

public class ChocolateCandy extends Product {

    private double surprise;
    public ChocolateCandy(double surprise,int id, double price, String productName, Candy_List candyList, Currency currency) {
        super(id, price, productName, candyList, currency);
        this.surprise = surprise;
    }

    public String examine() {
        return null;
    }

    public String use() {
        return null;
    }
}
