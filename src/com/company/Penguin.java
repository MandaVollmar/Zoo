package com.company;

public class Penguin extends Animal {
    private double wingSpan;
    private int eggsLaid;

    public double getWingSpan() {
        return wingSpan;
    }

    public int getEggsLaid() {
        return eggsLaid;
    }

    public Penguin(String name, double weight, String countryOfOrigin, String type, double wingSpan, int eggsLaid) {
        super(name,weight, countryOfOrigin, type);
        this.wingSpan = wingSpan;
        this.eggsLaid = eggsLaid;
    }
@Override
    public void buildAnimal() {
        super.buildAnimal();
        System.out.println("This penguin has a wing span of " + wingSpan
        + "and has laid " +eggsLaid + " eggs.");
    }
}
