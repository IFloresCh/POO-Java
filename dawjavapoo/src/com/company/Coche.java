package com.company;

public class Coche {
    private String marca, modelo, color;
    private int potencia, year, kilometros;


    public Coche(String marca, String modelo, String color, int potencia, int year, int kilometros) {
            this.setMarca(marca);
            this.setModelo(modelo);
            this.setColor(color);
            this.setPotencia(potencia);
            this.setYear(year);
            this.setKilometros(kilometros);
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getColor(){
        return color;
    }

    public int getPotencia(){
        return potencia;
    }

    public int getYear(){
        return year;
    }

    public int getKilometros(){
        return kilometros;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setKilometros(int kilometros){
        this.kilometros = kilometros;
    }



}