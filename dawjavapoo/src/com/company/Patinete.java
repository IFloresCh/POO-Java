package com.company;

public class Patinete extends Vehicle {
    private int PESO;

    public int getPESO(){
        return PESO;
    }

    public void setPESO(int peso){
        PESO = peso;
    }

    public Patinete(String mark, String model, String color, int year, int price, int weels, int PESO) {
        super(mark, model, color, year , price, weels);
        this.PESO = PESO;
    }



    @Override
    public void move() {

    }

    @Override
    public void stop() {

    }

    @Override
    public String showInfo() {
        return "Patinetes:\n" + getMark() + " " + getModel() + " " + getColor() + " " + getYear() + " " + getPrice() + " " + getWeels() + " " + getPESO();
    }
}