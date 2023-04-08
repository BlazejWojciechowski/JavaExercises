package Zadania.KlasyKonstruktory;

import Zadania.KlasyKonstruktory.RetailItem;

import javax.swing.*;

public class RetailItemDemo {
    public static void main(String[] args) {
        /*
        RetailItem item1 = new RetailItem("Kurtka", 12, 159.95);
        RetailItem item2 = new RetailItem("Markowe dźinsy", 40, 134.95);
        RetailItem item3 = new RetailItem("Koszula", 20, 124.95);

        System.out.println("\t\t\t\t\t\tOpis\t\tLiczba sztuk\t\tCena");
        System.out.println("------------------------------------------------------");
        System.out.println("Produkt numer 1\t\t" + item1.getDescription() + "\t\t\t\t\t" + item1.getUnitsOnHand()
                            + "\t\t" + item1.getPrice());
        System.out.println("Produkt numer 2\t\t" + item2.getDescription() + "\t\t\t" + item2.getUnitsOnHand()
                + "\t\t" + item2.getPrice());
        System.out.println("Produkt numer 3\t\t" + item3.getDescription() + "\t\t\t\t\t" + item3.getUnitsOnHand()
                + "\t\t" + item3.getPrice());

         */

        RetailItem object1 = new RetailItem("Kurtka", 20, 178.99);
        RetailItem object0 = new RetailItem("Spodnie", 30, 222.22);
        RetailItem object2 = new RetailItem(object1, 15);

        JOptionPane.showMessageDialog(null, String.format("Podsuma transakcji to %.2f złotych." +
                                        "\nPodatek to %.2f złotych.\nRazem wychodzi %.2f złotych.",
                                        object2.getSubtotal(), object2.getTax(), object2.getTotal()));

        RetailItem object3 = new RetailItem(object0, 27);
        JOptionPane.showMessageDialog(null, String.format("Podsuma transakcji to %.2f złotych." +
                        "\nPodatek to %.2f złotych.\nRazem wychodzi %.2f złotych.",
                object3.getSubtotal(), object3.getTax(), object3.getTotal()));

        JOptionPane.showMessageDialog(null,String.format("PARAGON\nCena za sztukę %.2f .\nSztuk %d ." +
                                        "\nPodsuma: %.2f .\nPodatek: %.2f .\nSuma: %.2f .",
                                        object2.getPrice(), object2.getBuyUnits(),
                                        object2.getSubtotal(), object2.getTax(), object2.getTotal()));
    }
}
