package com.company;

public class Chair extends Furniture {
    private int numberOfLegs;

    //constructor
    public Chair(String material, String color, int price, int numberOfLegs) {
        super(material, color, price);
        this.setNumberOfLegs(numberOfLegs);
    }

    //getter
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    //setter
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }


    @Override
    public void assembled() {
        System.out.println("Chair is assembled");

    }

    @Override
    public void folded() {
        System.out.println("Chair is folded");
    }

    @Override
    public void painted() {
        System.out.println("Chair is painted");
    }

    @Override
    public String showInfo() {
        return "Chair:\n" +
                "numberOfLegs: " + numberOfLegs + "," +
                " material: " + getMaterial() + "," +
                " color: " + getColor() + "," +
                " price: " + getPrice();
    }

}
