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

    public Penguin(double wingSpan, int eggsLaid) {
        this.wingSpan = wingSpan;
        this.eggsLaid = eggsLaid;
    }

    public Penguin buildPenguin() {
        System.out.println("This penguin has a wing span of " + wingSpan
        + "and has laid " +eggsLaid + " eggs.");
        return buildPenguin();
    }
}
