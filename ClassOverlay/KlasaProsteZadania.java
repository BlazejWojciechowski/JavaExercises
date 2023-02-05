package Zadania.KlasyNakładkowe;

import javax.swing.*;

public class KlasaProsteZadania
{
    public static void main(String[] args)
    {

        /* zad. 1
        String input;
        input = JOptionPane.showInputDialog("Podaj jakieś słowo a wyświetle je od tyłu:");
        StringBuilder str = new StringBuilder(input);
        char[] letters = new char[str.length()];

        for (int index = 0; index < str.length(); index++)
        {
            letters[index] = str.charAt(index);
        }

        for (int index = str.length() - 1; index >= 0; index--)
        {
            System.out.print(letters[index]);
        }

         */

        /* zad 2.

        int wordsCount = 0;
        String input;
        input = JOptionPane.showInputDialog("Podaj jakiś łańcuch znaków a wyświetle ile słów wpisałes:");

        String[] tokens = input.split(" ");

        for (String s : tokens)
        {
            wordsCount++;
        }

        JOptionPane.showMessageDialog(null, "Wpisałeś " + wordsCount + " słów/słowa.");

         */

        /* zad 3.

        String input;
        input = JOptionPane.showInputDialog("Wpisz jakieś zdanie z kropkami z małych liter a ja je przekształce tak aby" +
                                            " się rozpoczynały z dużej litery.");
        char little, big;
        int index = 0;
        String output;


        String[] tokens = input.split("[.]");

        for (String s : tokens)
        {
            little = s.charAt(index);
            big = Character.toUpperCase(little);
            output = s.replace(s.charAt(index), big);
            System.out.println(output);
        }

         */

    }

}