package se.lexicon.Model;

public class MilkCandy extends Product {

    private int discount;

    public MilkCandy( int discount,int id, double price, String productName, Candy_List candyList, Currency currency) {
        super(id, price, productName, candyList, currency);
        this.discount = discount;
    }


    public String examine() {
        return null;
    }

    public String use() {
        return null;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

}