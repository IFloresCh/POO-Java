package com.company;

public class Stool extends Chair{
    private int height, weight;

    //constructor
    public Stool(String material, String color, int price, int numberOfLegs, int height, int weight){
        super(material, color, price, numberOfLegs);
        this.setHeight(height);
        this.setWeight(weight);
    }
    //setter
    public void setHeight(int height){
        this.height = height;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
    //getter
    public int getHeight(){
        return height;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public void assembled(){
        System.out.println("Stool assembled");
    }

    @Override
    public void folded(){
        System.out.println("Stool folded");
    }

    @Override
    public void painted(){
        System.out.println("Stool painted");
    }
    @Override
    public String showInfo() {
        return "Stool:\n" +
                "numberOfLegs: " + getNumberOfLegs() + "," +
                " material: " + getMaterial() +  "," +
                " color: " + getColor() +  "," +
                " price: " + getPrice() +  "," +
                " height: " + getHeight() + "," +
                " weight: " + getWeight();
    }

}
