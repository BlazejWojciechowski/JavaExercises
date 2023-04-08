package Zadania.KlasyObiekty;

import javax.swing.*;

public class CircleDemo {
    public static void main(String[] args) {
        double radius = 10;
        double radius2 = 15;
        boolean status;

        Circle circ = new Circle(radius);
        Circle circ2 = new Circle(radius2);

        status = circ2.greaterThan(circ);

        if (status)
            JOptionPane.showMessageDialog(null, "Obiekt przekazany jako argument ma powierzchnię " +
                                        "większą niż drugi obiekt.");
        else
            JOptionPane.showMessageDialog(null, "Pole obiektu jest mniejsze.");
    }
}
