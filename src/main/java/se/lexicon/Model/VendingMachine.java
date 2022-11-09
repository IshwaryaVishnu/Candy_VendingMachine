package se.lexicon.Model;

import java.util.Arrays;

public class VendingMachine implements IVendingMachine {

    private Product[] products;
    private int depositPool;


    public void addCurrency(int amount) {
        if (amount % 2 == 0 && amount % 5 == 0)
            depositPool = depositPool + amount;
    }

    public int getBalance() {
        return depositPool;
    }

    public Product request(int id) {
        double price = 0;

        for(int i = 0; i < products.length; i++)
        {
            if(products[i].getId() == id){
                price = products[i].getPrice();
            }
        }

        if (price <= depositPool)
        {
            //How to buy product
        }
        return null;
    }

    public int endSession() {
        setDepositPool(0);
        return depositPool;
    }

    public String getDescription(int id) {
        for(int i = 0; i < products.length; i++)
        {
            if(products[i].getId() == id){
                return products[i].getProductName();
            }
        }
        return ("No Products available with this id:"+ id );
    }

    public String[] getProducts() {
        String[] availableProducts = new String[]{};
        int count = 0;
        for (Product i: products) {
            availableProducts[count] += products[count];
            count++;
        }
        return availableProducts;
    }

    public void setDepositPool(int depositPool) {
        this.depositPool = depositPool;
    }
}
