package com.company;

public class Silla {

    private String color, material;
    private int legs;
    private float price;

    public Silla(String color, String material, int legs, float price){
        this.setColor(color);
        this.setMaterial(material);
        this.setLegs(legs);
        this.setPrice(price);
    }

    public String getColor(){
        return color;
    }

    public String getMaterial(){
        return material;
    }

    public int getLegs(){
        return legs;
    }

    public float getPrice(){
        return price;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }

    public void setPrice(float price){
        this.price = price;
    }



}
