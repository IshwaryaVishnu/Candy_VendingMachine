package se.lexicon.Model;

public abstract class Product {
    //Instance class
    private int id;
    private double price;
    private String productName;
    private Candy_List candyList;
    private Currency currency;

    public Candy_List getCandyList() {
        return candyList;
    }

    public void setCandyList(Candy_List candyList) {
        this.candyList = candyList;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    //Constructors
    public Product(int id, double price, String productName,Candy_List candyList,Currency currency) {
        this.id = id;
        this.price = price;
        this.productName = productName;
        this.candyList = candyList;
        this.currency = currency;
    }
    //Methods
    public abstract String examine();

    public abstract String use();

    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


}

