package se.lexicon.Model;

public enum Candy_List {

    MARABOU("Marabou", 25), KITKAT("Kitkat", 35), TWIX("Twix", 45),MUNCH("Munch", 50),SNICKERS("Snickers", 65),SMARTIES("Smarties", 40);
    private String candyName;
    private double candyPrice;

    private Candy_List(String candyName, double candyPrice){
        this.candyName = candyName;
        this.candyPrice = candyPrice;
    }

    public String getCandyName(){
        return candyName;
    }

    public double candyPrice(){
        return candyPrice;
    }
}


