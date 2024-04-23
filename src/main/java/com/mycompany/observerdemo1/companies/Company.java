package com.mycompany.observerdemo1.companies;

import com.mycompany.observerdemo1.observers.Observer;
import java.util.ArrayList;
import java.util.List;

public abstract class Company {
    List<Observer> observerList = new ArrayList<Observer>();
    
    // Name of the subject
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    // For the stock price
    private int stockPrice;
    
    public int getStockPrice(){
        return this.stockPrice;
    }
    
    public void setStockPrice(int stockPrice){
        this.stockPrice = stockPrice;
        // Stock price is changed.
        // So notify observer(s).
        notifyRegisteredUsers();
    }
    
    // To register an observer
    public abstract void register(Observer o);
    
    // To unregister an oabserver
    public abstract void unregister(Observer o);
    
    // To notify a registered user
    public abstract void notifyRegisteredUsers();
}
