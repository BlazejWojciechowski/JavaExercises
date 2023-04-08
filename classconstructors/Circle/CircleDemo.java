package Zadania.KlasyKonstruktory;

import Zadania.KlasyKonstruktory.Circle;

import javax.swing.*;

public class CircleDemo {
    public static void main(String[] args) {
        String input;
        double radius;

        Circle circ = new Circle();

        input = JOptionPane.showInputDialog("Podaj promień koła:");
        radius = Double.parseDouble(input);
        circ.setRadius(radius);
        JOptionPane.showMessageDialog(null, "Powierzchnia koła to " + circ.getArea()
                                    + "\nŚrednica to: " + circ.getDiameter() +
                                    "\nObwód koła to: " + circ.getCircumference());
    }
}
