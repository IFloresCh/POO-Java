package com.company;

abstract class Person {
    private String name, surname;

    abstract void breathe();

    public Person(String name, String surname){
        this.setName(name);
        this.setSurname(surname);
    }

    public Person(String surname){
        this(null, surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String showInfo(){
        return this.getName() + " " + this.getSurname();
    }
}
