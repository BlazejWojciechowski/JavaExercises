package Zadania.KlasyKonstruktory;

import Zadania.KlasyKonstruktory.Rectangle;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 15);
        double area, size2;

        System.out.println("Długość prostokąta wynosi " + box.getLenght() + ".");
        System.out.println("Szerokość prostokąta wynosi " + box.getWidth() + ".");
        System.out.println("Powierzchnia prostokąta wynosi " + box.getArea() + ".");
    }
}
