package se.lexicon.Model;

public interface IVendingMachine {
        public void addCurrency(int amount);
        public int getBalance();
        public Product request(int id);
        public int endSession();
        public String getDescription(int id);
        public String[] getProducts();
    }

