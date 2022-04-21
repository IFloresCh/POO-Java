package cat.institutmvm.app.ui;

import cat.institutmvm.app.entities.Volum;

import java.util.Scanner;

public class VolumTester {


    public static final String NEWBOOK = "Crear nuevo libro";
    public static final String REF = "Introduzca referencia: ";
    public static final String TITOL = "Introduzca el titulo";
    public static final String AUTOR = "Introduzca el nombre del autor";
    public static final String PAGS = "Introduzca el numero de paginas";
    public static final String NRO_VOL = "Introduzca el número de volumen";


    public static void main(String[] args) {

        Volum vt = new Volum("Referencia", "Titulo de Obra", "Autor de la Obra",  60,  6);
        System.out.println(vt.showInfo());
        vt.isNew();
        vt.isDisponible();

        // Crear un nuevo libro
        String referencia, titol, autor;
        int nrePags, nro;
        System.out.println(NEWBOOK);
        Scanner teclat = new Scanner(System.in);

        System.out.println(REF);
        referencia = teclat.next();
        System.out.println(TITOL);
        titol = teclat.next();
        System.out.println(AUTOR);
        autor = teclat.next();
        System.out.println(PAGS);
        nrePags = teclat.nextInt();
        System.out.println(NRO_VOL);
        nro = teclat.nextInt();

        Volum vt2 = new Volum(referencia, titol, autor, nrePags, nro);
        System.out.println(vt2.showInfo());
        vt2.isUsed();
        vt2.isNotDisponible();
    }
}
