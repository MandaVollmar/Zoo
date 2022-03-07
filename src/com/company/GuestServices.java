package com.company;

import java.util.ArrayList;
import java.util.List;

public class GuestServices extends Building{
    List services = new ArrayList();
    private boolean isOpen;

    public List getServices() {
        return services;
    }
    public GuestServices(String name, String location, List <String> allServices, boolean isOpen){
        super(name, location);
        services.addAll(allServices);
        this.isOpen=isOpen;
    }
    @Override
    public void buildingInfo() {
        super.buildingInfo();
        System.out.println("We offer the following services: " +services+ "\n Are we open?"+ isOpen+ ".");
    }
}
