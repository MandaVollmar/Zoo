package com.company;

import java.util.ArrayList;
import java.util.List;

public class AnimalEnclosure extends Building{
    List<String> animals = new ArrayList<>();
    private boolean isOpen;

    public List<String> getAnimals() {
        return animals;
    }
    public AnimalEnclosure (String name, String location, List<String> newAnimals, boolean isOpen){
        super(name, location);
        animals.addAll(newAnimals);
        this.isOpen= isOpen;
    }
    @Override
    public void buildingInfo(){
        super.buildingInfo();
        System.out.println("Our current animal enclosures include: "+ animals + "\n Are we open? " +isOpen+".");
    }
}
