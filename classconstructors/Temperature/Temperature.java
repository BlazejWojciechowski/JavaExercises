package Zadania.KlasyKonstruktory;

public class Temperature {
    private double fahrenheit;
    public Temperature(double ftemp) {
        fahrenheit = ftemp;
    }
    public void setFahrenheit(double ftemp) {
        fahrenheit = ftemp;
    }
    public double getFahrenheit(double ftemp) {
        return fahrenheit;
    }
    public double getcelsius(double ftemp) {
        double celsius;
        celsius = 0.55 * (ftemp - 32);
        return celsius;
    }
    public double getkelvin(double ftemp) {
        double kelvin;
        kelvin = (0.55 * (ftemp - 32)) + 273;
        return kelvin;
    }
}
