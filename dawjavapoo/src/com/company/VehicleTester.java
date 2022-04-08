package com.company;

public class VehicleTester {

    public static void main(String[] args) {
        Car car = new Car("marca", "modelo", "color", 2020, 20000, 4, "ABC123", 5);
        Patinete patinete = new Patinete("marca", "modelo", "color", 2020, 500, 2, 50);


        System.out.println(car.showInfo());
        System.out.println(patinete.showInfo());

        System.out.println("ruedas: " + car.getWeels());

    }
}

