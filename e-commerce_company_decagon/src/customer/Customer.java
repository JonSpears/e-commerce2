package customer;
import java.util.*;

import common.Person;
import enums.Designation;

import java.util.ArrayList;

public class Customer extends Person {

    private double walletBalance;
    private Map<Product, Integer> cart;
    private Map<Product, Integer> productBought;

    public Customer(String firstName, String lastName, String address, String email, String password, double walletBalance){
        super(firstName, lastName, address, email, password, Designation.CUSTOMER);
        walletBalance = 0.0;
        cart = new HashMap<Product, Integer>();
        productBought = new HashMap<Product, Integer>();
    }

    public double getWalletBalance() {return walletBalance;}
    public void setWalletBalance(double amount){walletBalance = amount;}
    public Map<Product, Integer> getCart(){ return cart;}
    public void setCart(Product product){
        cart.computeIfPresent(product, (Product, Integer) -> Integer + 1);
        cart.computeIfAbsent(product, (Product) -> 1);
    }
    public Map<Product, Integer> getProductBought(){return productBought;}
    public void setProductBought(Product product) {
        productBought.computeIfPresent(product, (Product, Integer) -> Integer +1);
        productBought.computeIfAbsent(product, (Product) -> 1);
    }

}