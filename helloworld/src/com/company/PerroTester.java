package com.company;
import java.util.Scanner;
public class PerroTester {

    public static final String COLOR = "Introduce el color : ";
    public static final String RACE = "Introduce la raza del perro: ";
    public static final String LEGS = "Introduce cuantas patas tiene: ";
    public static final String EDAD = "Introduce la edad: ";
    public static void main(String[] args) {
        String race, color;
        int legs, edad;
        System.out.println("Perro\n");
        Scanner sc = new Scanner(System.in);
        System.out.println(RACE);
        race = sc.next();
        System.out.println(COLOR);
        color = sc.next();
        System.out.println(LEGS);
        legs = sc.nextInt();
        System.out.println(EDAD);
        edad = sc.nextInt();
        Perro perro = new Perro(race, color, legs, edad);
        System.out.println("Raza: " + perro.getRace());
        System.out.println("Color: " + perro.getColor());
        System.out.println("Patas: " + perro.getColor());
        System.out.println("Edad: " + perro.getEdad());
    }
}