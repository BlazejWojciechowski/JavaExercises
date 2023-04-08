package Zadania.KlasyObiekty;

import javax.swing.*;

public class GeometryDemo {
    public static void main(String[] args) {
        String input;
        double radius, length, width, bottom, height, area;
        boolean status;
        int value;

        do {
            input = JOptionPane.showInputDialog("Kalkulator geometryczny:\n1. Obliczanie powierzchni koła." +
                                                "\n2. Obliczanie powierzchni prostokąta:\n3. Obliczanie powierzchni trójkąta." +
                                                "\n4. Zakończ.");
            value = Integer.parseInt(input);

            if (value == 1) {
                input = JOptionPane.showInputDialog("Podaj promień koła.");
                radius = Double.parseDouble(input);
                area = Geometry.areaCircle(radius);
                JOptionPane.showMessageDialog(null, String.format("Powierzchnia koła to %.2f ." , area));
                status = true;
            }
            else if (value == 2) {
                input = JOptionPane.showInputDialog("Podaj długość prostokąta.");
                length = Double.parseDouble(input);
                input = JOptionPane.showInputDialog("Podaj szerokość prostokąta.");
                width = Double.parseDouble(input);
                area = Geometry.areaBox(length, width);
                JOptionPane.showMessageDialog(null, String.format("Powierzchnia prostokąta to %.2f ." , area));
                status = true;
            }
            else if (value == 3) {
                input = JOptionPane.showInputDialog("Podaj podstawe trójkąta.");
                bottom = Double.parseDouble(input);
                input = JOptionPane.showInputDialog("Podaj wysokość trójkąta.");
                height = Double.parseDouble(input);
                area = Geometry.areaTriangle(bottom, height);
                JOptionPane.showMessageDialog(null, String.format("Powierzchnia trójkąta to %.2f ." , area));
                status = true;
            }
            else if (value == 4) {
                status = false;
            }
            else {
                status = true;
                JOptionPane.showMessageDialog(null, "Nieprawidłowa cyfra.");
            }
        }
        while (status);
    }
}
