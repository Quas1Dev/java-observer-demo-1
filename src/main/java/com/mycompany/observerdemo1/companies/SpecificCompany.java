package com.mycompany.observerdemo1.companies;

import com.mycompany.observerdemo1.observers.Observer;

public class SpecificCompany extends Company {

    public SpecificCompany(String name) {
        super(name);
    }

    @Override
    public void notifyRegisteredUsers() {
        for (Observer observer : this.observerList){
            observer.getNotification(this);
        }
    }

    @Override
    public void register(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        this.observerList.remove(o);
    }
    
}
