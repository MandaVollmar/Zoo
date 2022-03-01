package com.company;

import java.util.ArrayList;
import java.util.List;

public class GuestServices extends Building{
    List services = new ArrayList();
    int capacity;

    public List getServices() {
        return services;
    }

    public int getCapacity() {
        return capacity;
    }
    public GuestServices(List <String> allServices, int capacity){
        services.addAll(allServices);
        this.capacity=capacity;
    }
}
