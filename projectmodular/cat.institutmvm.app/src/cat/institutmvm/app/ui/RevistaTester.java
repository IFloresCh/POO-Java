package cat.institutmvm.app.ui;

import cat.institutmvm.app.entities.Revista;

import java.util.Scanner;

public class RevistaTester {

    public static final String NEWBOOK = "Crear nueva Revista";
    public static final String REF = "Introduzca referencia: ";
    public static final String TITOL = "Introduzca el titulo de la revista";
    public static final String ANY  = "Introduzca el año de publicacion: ";
    public static final String NRO_PUB = "Introduzca el numero de publicacion: ";


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
