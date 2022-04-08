package com.company;

// Furniture class
abstract class Furniture {
    // Fields
    private String material;
    private String color;
    private int price;


    // constructor
    public Furniture(String material, String color, int price) {
        this.setMaterial(material);
        this.setColor(color);
        this.setPrice(price);
    }

    //getter
    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    // setter
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    //methods
    public abstract void assembled();
    public abstract void folded();
    public abstract String showInfo();
    public abstract void painted();

}

