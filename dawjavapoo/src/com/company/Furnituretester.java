package com.company;

public class Furnituretester {

    public static void main(String[] args) {

        Chair chair = new Chair("material", "color", 50, 4);
        Table table = new Table("material", "color", 100, 4, 6);
        Stool stool = new Stool("material", "color", 50, 4, 60, 5);

        //sout chair
        System.out.println(chair.showInfo());
        chair.assembled();
        chair.folded();

        //sout table
        System.out.println(table.showInfo());
        table.assembled();
        table.folded();

        //sout stool
        System.out.println(stool.showInfo());
        stool.assembled();
        stool.painted();

    }

}
