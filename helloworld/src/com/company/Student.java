package com.company;

public class Student extends Person {
    private String RALC;

    public String getRALC() {
        return RALC;
    }

    public void setRALC(String RALC) {
        this.RALC = RALC;
    }

    public Student(String name, String surname, String RALC) {
        super(name, surname);
        this.RALC = RALC;
    }

    public String showInfo() {
        return "Student: " + getName() + " " + getSurname() + " " + getRALC();
    }

    @Override
    void breathe() {

    }
}
