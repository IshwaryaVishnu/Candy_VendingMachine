package se.lexicon.Model;

public class CoffeeCandy extends Product {

    private String surprise;
    public CoffeeCandy(String surprise,int id, double price, String productName, Candy_List candyList, Currency currency) {
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
