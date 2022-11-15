package se.lexicon;

import se.lexicon.data.VendingMachine;
import se.lexicon.model.*;

public class App
{
            public static void main(String[] args) {
                Product[] products = {
                        new ChocolateCandy("white",1,50,"Marabou"),
                        new MilkCandy(2,40,"twix"),
                };
                VendingMachine vendingMachine = new VendingMachine(products);

                for (String string : vendingMachine.getProducts()) {
                    System.out.println(string);
                    System.out.println("-----");
                }

                vendingMachine.addCurrency(50);
                Product banana = vendingMachine.request(2);
                System.out.println(banana.use());
                System.out.println(vendingMachine.getBalance());


            }
        }



