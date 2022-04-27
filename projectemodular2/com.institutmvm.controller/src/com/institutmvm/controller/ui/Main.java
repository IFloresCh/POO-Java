package com.institutmvm.controller.ui;

import cat.institutmvm.applicacio.entities.Persona;
import cat.institutmvm.applicacio.utils.MyMath;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final String MSG = "Introduce un valor entero: ";

    public static void main(String[] args) {
        int valor;
        //persona falla Mymath esta bien
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();
        p.setTitol("pepito");

        System.out.println(p.getTitol());
        System.out.println(MSG);
        valor = sc.nextInt();
        System.out.println(MyMath.isEven(6)== false ? "Es fals" : "Es cert");
        System.out.println(MyMath.isEven(5)== false ? "Es fals" : "Es cert");
        System.out.println(MyMath.isOdd(valor)== true ? "Es fals": "Es cert");


        //randoms
        System.out.println(rnd.nextInt( 100));
        System.out.println(MyMath.nextInt(32));
        //System.out.println(rnd.nextInt(valor)); No funciona con valor negativo

        //numeros absolutos negativos a positivos
        System.out.println(MyMath.abs(-32));
        System.out.println(MyMath.abs1(-50));
        System.out.println(MyMath.abs1(valor));


        //numeros avg min max
        System.out.println("AVG, MIN, MAX");
        System.out.println(MyMath.avg(4,2));
        System.out.println(MyMath.min(4,2,3));
        System.out.println(MyMath.max(4,2,3));


    }
}
