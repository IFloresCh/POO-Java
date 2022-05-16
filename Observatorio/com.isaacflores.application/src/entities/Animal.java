package entities;

public abstract class Animal {
    private String name;
    private String scientificName;
    private int age;
    private int weight;
    private int size;
    private String diet;
    private String habitat;
    private String color;

    public Animal(String name, String scientificName, int age, int weight, int size, String eats, String habitat, String color) {
        this.setName(name);
        this.setScientificName(scientificName);
        this.setAge(age);
        this.setWeight(weight);
        this.setSize(size);
        this.setDiet(eats);
        this.setHabitat(habitat);
        this.setColor(color);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String eats) {
        this.diet = eats;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
