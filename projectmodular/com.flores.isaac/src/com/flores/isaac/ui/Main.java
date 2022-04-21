package com.flores.isaac.ui;

import cat.institutmvm.app.entities.Revista;

import java.util.Scanner;

import static cat.institutmvm.app.ui.RevistaTester.*;

public class Main {
    public static void main(String[] args) {
        Revista rv = new Revista("Referencia", "Titulo de la Revista",  2014,  60);
        System.out.println(rv.showInfo());
        rv.isNew();


        //crear una nueva revista
        String referencia, titol;
        int  any, numero;
        System.out.println(NEWBOOK);
        Scanner sc = new Scanner(System.in);

        System.out.println(REF);
        referencia = sc.next();
        System.out.println(TITOL);
        titol = sc.next();
        System.out.println(ANY);
        any = sc.nextInt();
        System.out.println(NRO_PUB);
        numero = sc.nextInt();

        Revista rv2 = new Revista(referencia, titol, any, numero);
        System.out.println(rv2.showInfo());
        rv2.isUsed();
        rv2.isNotDisponible();
    }
}
