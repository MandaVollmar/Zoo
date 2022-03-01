package com.company;

import java.util.ArrayList;
import java.util.List;

public class AnimalEnclosure extends Building{
    List<String> animals = new ArrayList<>();
    private int capacity;

    public List<String> getAnimals() {
        return animals;
    }

    public int getCapacity() {
        return capacity;
    }
    public AnimalEnclosure (List<String> newAnimals, int capacity){
        animals.addAll(newAnimals);
        this.capacity= capacity;
    }
}
