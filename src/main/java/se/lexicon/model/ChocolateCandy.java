package se.lexicon.model;

public class ChocolateCandy extends Product {

    private String color;
    public ChocolateCandy(String color,int id, double price, String productName) {
        super(id, price, productName);
        this.color = color;
    }

    public String examine() {
        return "{ id: " + getId() + ", fruit: " + color + " " + getProductName() + " }";
    }

    @Override
    public String use() {
        return getProductName() + " taste delicious!";
    }
}
