package Zadania.KlasyObiekty;

import javax.swing.*;

public class AreaDemo
{
    public static void main(String[] args)
    {
        Area zero = new Area();

        double radius, length, width, area;
        int heigth;
        String input;

        JOptionPane.showMessageDialog(null, "Obliczmy pole powierzchni koła.");
        input = JOptionPane.showInputDialog("Podaj promień:");
        radius = Double.parseDouble(input);
        Area.Area(radius);
        area = Area.getArea();
        JOptionPane.showMessageDialog(null, String.format("Pole powierzchni koła to %.2f .", area));

        JOptionPane.showMessageDialog(null, "Obliczmy pole powierzchni prostokąta.");
        input = JOptionPane.showInputDialog("Podaj długość:");
        length = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Podaj szerokość:");
        width = Double.parseDouble(input);
        Area.Area(length, width);
        area = Area.getArea();
        JOptionPane.showMessageDialog(null, String.format("Pole powierzchni prostokąta to %.2f .", area));

        JOptionPane.showMessageDialog(null, "Obliczmy pole powierzchni walca.");
        input = JOptionPane.showInputDialog("Podaj promień:");
        radius = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Podaj wysokość:");
        heigth = Integer.parseInt(input);
        Area.Area(radius, heigth);
        area = Area.getArea();
        JOptionPane.showMessageDialog(null, String.format("Pole powierzchni walca to %.2f .", area));

    }
}
