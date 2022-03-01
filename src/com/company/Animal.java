package com.company;

public class Animal {
    private String name;
    private double weight;
    private String countryOfOrigin;
    private String type;

public  Animal (String name, double weight, String countryOfOrigin, String type){
    this.name=name;
    this.weight=weight;
    this.countryOfOrigin=countryOfOrigin;
    this.type=type;
}
public void buildAnimal () {
    System.out.println("This animal's name is " +name+ " it weighs "
    + weight+" pounds. They originated from "+ countryOfOrigin+ "and is an "
    + type + ". ");
}

}
