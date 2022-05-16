package entities;

public class AirAnimal extends Animal {

    private int altitude;
    private int speed;
    private int direction;
    private int wingSpan;

    public AirAnimal(String name, String scientificName, int age, int weight, int size, String diet, String habitat, String color, int altitude, int speed, int direction, int wingSpan) {
        super(name, scientificName, age, weight, size, diet, habitat, color);
        this.setAltitude(altitude);
        this.setSpeed(speed);
        this.setDirection(direction);
        this.setWingSpan(wingSpan);
   }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }
}
