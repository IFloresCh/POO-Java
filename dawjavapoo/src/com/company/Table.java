package com.company;

//Table class
public class Table extends Furniture {
    private int numberOfLegs, size;


    public Table(String material, String color, int price, int numberOfLegs, int size) {
        super(material, color, price);
        this.setNumberOfLegs(numberOfLegs);
        this.setSize(size);
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public int getSize() {
        return size;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public void assembled() {
        System.out.println("Table is assembled");
    }

    @Override
    public void folded() {
        System.out.println("Table is folded");
    }

    @Override
    public void painted() {
        System.out.println("Table is painted");
    }

    @Override
    public String showInfo() {
        return "Table:\n" +
                "numberOfLegs: " + numberOfLegs + "," +
                " material: " + getMaterial() + "," +
                " color: " + getColor() + "," +
                " price: " + getPrice() + "," +
                " size: " + size;
    }

}
