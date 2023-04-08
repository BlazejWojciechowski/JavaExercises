package Zadania.KlasyObiekty;

import javax.swing.*;

public class RoomDimensionsXCarpetDemo {
    public static void main(String[] args) {
        String input, str;
        double length, width, area, carpetCost;

        input = JOptionPane.showInputDialog("Podaj długość pomieszczenia.");
        length = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Podaj szerokość pomieszczenia.");
        width = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Podaj cene za metr dywanu.");
        carpetCost = Double.parseDouble(input);

        RoomDimensions object = new RoomDimensions(length, width);
        RoomCarpet price = new RoomCarpet(object, carpetCost);

        System.out.println(object.toString());
        System.out.println(price.toString());
    }
}
