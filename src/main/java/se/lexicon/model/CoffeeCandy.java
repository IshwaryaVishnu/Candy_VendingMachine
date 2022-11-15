package se.lexicon.model;

public class CoffeeCandy extends Product {

    private final boolean alcoholic;
    private final int sugarPercentage;
    public CoffeeCandy(boolean alcoholic, int sugarPercentage,int id, double price, String productName) {
        super(id, price, productName);
        this.alcoholic = alcoholic;
        this.sugarPercentage = sugarPercentage;

    }

    public String examine() {
        return "{ id: " + getId() + ", beverage: " + getProductName() + " with " + sugarPercentage + "% sugar }";
    }

    @Override
    public String use() {
        String description = "You drink some " + getProductName();
        description += alcoholic ? " and feel a bit tipsy" : "";
        return description;
    }

}
