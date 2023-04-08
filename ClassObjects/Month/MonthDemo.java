package Zadania.KlasyObiekty;

import Zadania.Wyjątki.WrongValueofMonth;

import javax.swing.*;

public class MonthDemo {
    public static void main(String[] args) throws WrongValueofMonth {
        String input;
        int month;
        boolean status;

        input = JOptionPane.showInputDialog("Podaj nazwę miesiąca typu 'Styczeń' lub 'Luty' pisany wielką literą:");
        Month object1 = new Month(input);
        input = JOptionPane.showInputDialog("Podaj cyfrę miesiąca typu '1 - Styczeń', '2 - Luty' itd.");
        month = Integer.parseInt(input);
        Month object2 = new Month(month);
        status = object1.equals(object2);

        if (status)
            JOptionPane.showMessageDialog(null,"Miesiące są takie same");
        else
            JOptionPane.showMessageDialog(null,"Miesiące są różne");

        status = object1.graterThan(object2);

        if (status)
            JOptionPane.showMessageDialog(null,"Miesiąc pierwszy jest większy od drugiego");
        else
            JOptionPane.showMessageDialog(null,"Miesiąc pierwszy jest mniejszy od drugiego");

        status = object1.lessThan(object2);

        if (status)
            JOptionPane.showMessageDialog(null,"Miesiąc pierwszy jest mniejszy od drugiego");
        else
            JOptionPane.showMessageDialog(null,"Miesiąc pierwszy jest większy od drugiego");
    }
}

