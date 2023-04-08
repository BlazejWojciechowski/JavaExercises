package Zadania.KlasyNakładkowe;

import javax.swing.*;

public class LettersDemo {
    public static void main(String[] args) {
        String input;
        String choice;
        String[] conso = {"a", "e", "i", "o", "u", "ó", "y", "ą", "ę"};

        do {
            choice = JOptionPane.showInputDialog("A.Zliczam samogłoski w podanym wyrazie.\nB.Zliczam spółgłoski w podanym " +
                    "wyrazie.\nC.Zliczam suma samogłosek i spółgłosek.\nD.Zakończenie programu");
            if (choice.equalsIgnoreCase("a")) {
                input = JOptionPane.showInputDialog("Podaj coś");
                Letters let = new Letters(conso, input);
                JOptionPane.showMessageDialog(null, "Samogłosek jest " + let.getVowels());
            }
            else if (choice.equalsIgnoreCase("b")) {
                input = JOptionPane.showInputDialog("Podaj coś");
                Letters let = new Letters(conso, input);
                JOptionPane.showMessageDialog(null, "Spółgłosek jest " + let.getConsonats());
            }
            else if (choice.equalsIgnoreCase("c")) {
                input = JOptionPane.showInputDialog("Podaj coś");
                Letters let = new Letters(conso, input);
                JOptionPane.showMessageDialog(null, "Spółgłosek i samogłosek jest " + let.summary());
            }
        }
        while (!(choice.equalsIgnoreCase("d")));
    }
}
