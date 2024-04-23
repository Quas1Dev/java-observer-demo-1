package com.mycompany.observerdemo1.observers;

import com.mycompany.observerdemo1.companies.Company;

public interface Observer {
    void getNotification(Company company);
    String getObserverName();
}
