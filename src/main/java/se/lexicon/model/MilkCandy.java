package se.lexicon.model;

public class MilkCandy extends Product {

    public MilkCandy( int id, double price, String productName) {
        super(id, price, productName);
    }


    public String examine() {
        return "{ id: " + getId() + ", snack: " + getProductName() + " }";
    }

    @Override
    public String use() {
        return "You eat some " + getProductName();
    }


}