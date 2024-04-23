package com.mycompany.observerdemo1;

import com.mycompany.observerdemo1.companies.Company;
import com.mycompany.observerdemo1.companies.SpecificCompany;
import com.mycompany.observerdemo1.observers.Customer;
import com.mycompany.observerdemo1.observers.Employee;
import com.mycompany.observerdemo1.observers.Observer;

public class Observerdemo1 {

    public static void main(String[] args) {
        System.out.println("*** An Observer demo 1 ***");
        
        // We have 4 different oabservers.
        Observer roy = new Employee("Roy");
        Observer kevin = new Employee("Kevin");
        Observer bose = new Customer("Bose");
        Observer jacklin = new Customer("Jacklin");
        
        System.out.println("\nWorking with the company: ABC ltd.\n");
        Company abcLtd = new SpecificCompany("ABC Ltd.");
        
        // Registering the observers Roy, Kevin and Bose
        abcLtd.register(roy);
        abcLtd.register(kevin);
        abcLtd.register(bose);
        
        System.out.println("\nABC Ltd.'s current stock price is $5.");
        abcLtd.setStockPrice(5);
        System.out.println("-----");
        
        // Kevin doesn't want to get further notification.
        System.out.println("\nABC Ltd. is removing Kevin from the Observer" + 
                " list now.");
        abcLtd.unregister(kevin);
        
        // No notification sent to Kevin anymore.
        System.out.println("\n ABC Ltd.'s new stock price is $50.");
        abcLtd.setStockPrice(50);
        System.out.println("-----");
        
        System.out.println("\nKevin registers again to get notification " + 
                "from ABC Ltd.");
        abcLtd.register(kevin);
        
        System.out.println("\n ABC Ltd.'s new stock price is $100.");
        abcLtd.setStockPrice(100);
        System.out.println("-----");
        
        // Creating another company
        System.out.println("\n Working with another company: XYZ Co.");
        Company xyzCo = new SpecificCompany("XYZ Co.");
        
        // Registering the observers - Roy and Jacklin
        xyzCo.register(roy);
        xyzCo.register(jacklin);
        
        System.out.println("\n XYZ Co.'s new stock price is $500.");
        xyzCo.setStockPrice(500);
        
    }
}
