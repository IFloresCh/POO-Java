package com.company;

import java.util.Scanner;

public class Main {
    public static final String MARCA = "Introduce la marca del coche: ";
    public static final String MODELO = "Introduce el modelo del coche: ";
    public static final String COLOR = "Introduce el color : ";
    public static final String YEAR = "Introduce el año del coche: ";
    public static final String POTENCIA = "Introduce la potencia del coche: ";
    public static final String KMS = "Introduce el kilometraje del coche: ";

    public static final String RACE = "Introduce la raza del perro: ";
    public static final String LEGS = "Introduce cuantas patas tiene: ";
    public static final String EDAD = "Introduce la edad: ";
    public static final String MATERIAL = "Introduce el material: ";
    public static final String PRICE = "Introduce el precio: ";


    public static void main(String[] args) {
/* alumno
        Alumne alumn = new Alumne();
        alumn.setName("Perez");
        System.out.println(alumn.getName());
*/
/* coche
        String marca, modelo, color;
        int year, potencia, kms;
        System.out.println("Coche");
        Scanner sc = new Scanner(System.in);
        System.out.println(MARCA);
        marca = sc.next();
        System.out.println(MODELO);
        modelo = sc.next();
        System.out.println(COLOR);
        color = sc.next();
        System.out.println(YEAR);
        year = sc.nextInt();
        System.out.println(POTENCIA);
        potencia = sc.nextInt();
        System.out.println(KMS);
        kms = sc.nextInt();
        Coche coche = new Coche(marca, modelo, color, year, potencia, kms);
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Color: " + coche.getColor());
        System.out.println("Año: " + coche.getYear());
        System.out.println("Potencia: " + coche.getPotencia());
        System.out.println("Kilometros: " + coche.getKilometros() + "km");
*/
        /*
        // Perro

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
        System.out.println("Patas: "+ perro.getColor());
        System.out.println("Edad: " + perro.getEdad());

*/
        // Silla
        String color, material;
        int legs;
        float price;
        System.out.println("Silla\n");
        Scanner sc = new Scanner(System.in);
        System.out.println(COLOR);
        color = sc.next();
        System.out.println(MATERIAL);
        material = sc.next();
        System.out.println(LEGS);
        legs = sc.nextInt();
        System.out.println(PRICE);
        price = sc.nextFloat();
        Silla silla = new Silla(color, material, legs, price);
        System.out.println("Color: " + silla.getColor());
        System.out.println("Material: " + silla.getMaterial());
        System.out.println("Patas: "+ silla.getLegs());
        System.out.println("Precio: " + silla.getPrice());



    }
}


