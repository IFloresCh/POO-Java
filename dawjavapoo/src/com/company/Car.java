package com.company;

public class Car extends Vehicle {
    private String MATRICULA;
    private int doors;


    public String getMATRICULA() {
        return MATRICULA;
    }
    
    public void setMATRICULA(String MATRICULA) {
        this.MATRICULA = MATRICULA;
    }
    
    public int getDoors() {
        return doors;
    }
    
    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Car(String mark, String model, String color, int year, int price, int weels, String MATRICULA, int doors) {
        super(mark, model, color, year , price, weels);
        this.MATRICULA = MATRICULA;
        this.doors = doors;
    }
    
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }

    @Override
    public String showInfo() {
        return "Car:\n" + getMark() + " " + getModel() + " " + getColor() + " " + getYear() + " " + getPrice() + " " + getWeels() + " " + getMATRICULA() + " " + getDoors();
    }

    }

