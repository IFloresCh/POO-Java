package com.company;
import java.util.Scanner;

public class SquareTester {

    public static final String SIZE ="Ingrese el tamaño de un lado del cuadrado: ";
    public static final String AREA ="El area del cuadrado es: ";
    public static final String LADO ="Tamaño del lado: ";
    public static final String COLOUR = "Ingrese el color del cuadrado: ";
    public static void main(String[] args) {
        int side;
        String colour;
        System.out.println("Cuadrado\n");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(SIZE);
            side = sc.nextInt();
        } while (side < 1);
        System.out.println(COLOUR);
        colour = sc.next();
        Square cuadrado = new Square(side, colour);
        System.out.println(LADO + cuadrado.getSide());
        System.out.println("Color: " + cuadrado.getColour());
        System.out.println(AREA + cuadrado.getArea());
    }
}
