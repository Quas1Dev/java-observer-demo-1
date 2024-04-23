package com.mycompany.observerdemo1.observers;

import com.mycompany.observerdemo1.companies.Company;

public class Employee implements Observer {
    String nameOfObserver;

    public Employee(String nameOfObserver) {
        this.nameOfObserver = nameOfObserver;
    }
    
    @Override
    public void getNotification(Company company) {
        System.out.println(this.nameOfObserver + 
                " has received an alert from " + company.getName());
        System.out.println("The current stock price is: $" + 
                company.getStockPrice());
    }

    @Override
    public String getObserverName() {
        return this.nameOfObserver;
    }
    
}
