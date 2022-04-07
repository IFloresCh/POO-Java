package com.company;

// Cuadrado.java
public class Square {
    private int side;
    private String colour;

    public Square(int side, String colour){
        this.side = side;
        this.colour = colour;
    }

    public Square(int side){
        this(side, "#ffffff");
    }
    public Square(){
        this(2, "#ffffff");
    }

    public int getSide(){
        return side;
    }

    public String getColour(){
        return colour;
    }

    public void setSide(int side){
        this.side = side;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public int getArea(){
        return side * side;
    }
}


