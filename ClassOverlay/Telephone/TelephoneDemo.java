package Zadania.KlasyNakładkowe;

import javax.swing.*;

public class TelephoneDemo
{
    public static void main(String[] args)
    {
        String input;
        String str;
        String numberLetters;
        String formatted;
        boolean valid;
        input = JOptionPane.showInputDialog("Podaj numer telefonu w formacie 555-ABC-DEF");

        valid = Telephone.isFormatted(input);

        if (valid)
            str = Telephone.unformat(input);
        else
            str = input;

        numberLetters = Telephone.change(str);
        formatted = Telephone.format(numberLetters);

        JOptionPane.showMessageDialog(null, "Podany numer po przekształceniu to " + formatted);



    }
}
