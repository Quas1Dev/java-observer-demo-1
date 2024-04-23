package com.mycompany.observerdemo1.observers;

import com.mycompany.observerdemo1.companies.Company;

public class Customer implements Observer {

    String nameOfObserver;

    public Customer(String name) {
        this.nameOfObserver = name;
    }

    @Override
    public void getNotification(Company company) {
        System.out.print(this.nameOfObserver + " is notified from " + company.getName());
        System.out.println("\nIts current stock price is: $" + company.getStockPrice());
    }

    @Override
    public String getObserverName() {
        return this.nameOfObserver;
    }

}
