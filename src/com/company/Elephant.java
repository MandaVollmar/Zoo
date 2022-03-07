package com.company;

public class Elephant extends Animal {
    private double trunkLength;
    private boolean canRide;

    public double getTrunkLength() {
        return trunkLength;
    }

    public Elephant(String name, double weight, String countryOfOrigin, String type, double trunkLength, boolean canRide) {
        super(name,weight, countryOfOrigin, type);
        this.trunkLength = trunkLength;
        this.canRide = canRide;
    }
    @Override
    public void buildAnimal() {
        super.buildAnimal();
        System.out.println("This Elephant has a trunk length of " + trunkLength
                + "inches, and it is " + canRide + " that you can ride them.");
    }
}
