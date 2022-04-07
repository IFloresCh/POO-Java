package com.company;

public class Animal {
    private String race, color;
    private int legs, edad;


    public Animal(String race, String color, int legs, int edad) {
        this.setRace(race);
        this.setColor(color);
        this.setLegs(legs);
        this.setEdad(edad);
    }

    public String getRace() {
        return race;
    }

    public String getColor() {
        return color;
    }

    public int getLegs() {
        return legs;
    }

    public int getEdad() {
        return edad;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}



