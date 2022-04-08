package com.company;

abstract class Vehicle {
    private String mark, model, color;
    private int year, price, weels;

    public Vehicle(String mark, String model, String color, int year, int price, int weels) {
        this.setMark(mark);
        this.setModel(model);
        this.setColor(color);
        this.setYear(year);
        this.setPrice(price);
        this.setWeels(weels);

    }

    public Vehicle() {

    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public int getWeels() {
        return weels;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeels(int speed) {
        this.weels = weels;
    }

    public abstract void move();

    public abstract void stop();


    public abstract String showInfo();
}





