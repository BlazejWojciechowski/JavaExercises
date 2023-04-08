package Zadania.KlasyKonstruktory;

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private int registration;
    private int parkedMinutes;
    public ParkedCar(String make, String model, String color, int registration, int parkedMinutes) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.registration = registration;
        this.parkedMinutes = parkedMinutes;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getRegistration() {
        return registration;
    }
    public int getParkedMinutes() {
        return parkedMinutes;
    }
}
