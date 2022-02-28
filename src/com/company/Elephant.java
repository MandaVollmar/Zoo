package com.company;

public class Elephant extends Animal {
    private double trunkLength;
    private boolean canRide;

    public double getTrunkLength() {
        return trunkLength;
    }

    public Elephant(double trunkLength, boolean canRide) {
        this.trunkLength = trunkLength;
        this.canRide = canRide;
    }
}
