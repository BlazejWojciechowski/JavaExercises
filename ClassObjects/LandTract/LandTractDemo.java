package Zadania.KlasyObiekty;

import javax.swing.*;

public class LandTractDemo {
    public static void main(String[] args) {
        double length, width, area;
        String input;
        boolean status;

        input = JOptionPane.showInputDialog("Podaj długość pierwszej działki:");
        length = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Podaj szerokość pierwszej działki:");
        width = Double.parseDouble(input);

        LandTract object1 = new LandTract(length, width);

        input = JOptionPane.showInputDialog("Podaj długość drugiej działki:");
        length = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Podaj szerokość drugiej działki:");
        width = Double.parseDouble(input);

        LandTract object2 = new LandTract(length, width);

        JOptionPane.showMessageDialog(null, object1.toString(object2));

        status = object1.equals(object2);

        if (status)
            JOptionPane.showMessageDialog(null, "Działki są takie same.");
        else
            JOptionPane.showMessageDialog(null, "Działki są różne.");
    }
}
