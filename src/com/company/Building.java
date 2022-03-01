package com.company;

public class Building {
    private String name;
    private String location;

    public String getLocation() {
        return location;
    }
    public String getName() {
        return name;
    }
    public Building (String name, String location){
        this.name=name;
        this.location=location;
    }
    public void buildingInfo (){
        System.out.println("The building, "+name+ " is located "+location+". ");

    }
}
