package Zadania.KlasyKonstruktory;

public class Circle {
    private double radius;
    private final double PI = 3.14159;
    public Circle( double radiu) {
        radius = radiu;
    }
    public Circle() {
        radius = 0.0;
    }
    public void setRadius(double radi) {
        radius = radi;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        double area = PI * radius * radius;
        return area;
    }
    public double getDiameter() {
        double diameter = radius * 2;
        return diameter;
    }
    public double getCircumference() {
        double circumference = 2 * PI * radius;
        return circumference;
    }
}
