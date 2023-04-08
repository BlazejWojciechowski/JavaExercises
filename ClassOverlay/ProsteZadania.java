package Zadania.KlasyNakładkowe;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProsteZadania {
    public static void main(String[] args) throws IOException {
        /*
        zad.1
        String input;
        char[] array;
        int letters = 0;
        int digits = 0;
        int whitespaces = 0;

        input = JOptionPane.showInputDialog("Podaj łańcuch znaków");
        array = input.toCharArray();

        for (int index = 0; index < array.length; index++)
        {
            if (Character.isLetter(array[index]))
                letters++;
            else if (Character.isDigit(array[index]))
                digits++;
            else if (Character.isWhitespace(array[index]))
                whitespaces++;
        }

        JOptionPane.showMessageDialog(null, "Liczba liter " + letters + ".\nLiczba cyfr " + digits
                                    + ".\nLiczba spacji " + whitespaces + ".");

         */

        /*
        zad.2
        String input;
        boolean status;
        input = JOptionPane.showInputDialog("Podaj jakieś słowo kończące się na 'ego'");
        if (input.endsWith("ego"))
            status = true;
        else
            status = false;

        if (status)
            JOptionPane.showMessageDialog(null, "To słowo kończy sie na ego");
        else
            JOptionPane.showMessageDialog(null, "Niepoprawne słowo");

         */

        /*
        zad.3
        String str = "ciasteczka>mleko>masa karmelowa:placek:lody";
        String[] tokens = str.split("[>:]");

        for (String s : tokens)
            System.out.println(s);

         */

        /*
        zad.4
        double d;
        int i = 0;
        String input;
        input = JOptionPane.showInputDialog("Podaj jakąś cyfrę");
        d = Double.parseDouble(input);

        if (d <= Integer.MAX_VALUE)
            i = (int) d;

        System.out.println(i);

         */

        /*
        zad.5
        int number = 10;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toHexString(number));
        System.out.println(Integer.toOctalString(number));

         */

        /*
        zad.6
        String[] names = {"Hurkacz Renata", "Jurczyk Julia", "Szewczyk Waldemar", "Szewczyk Bartosz"};
        String[] phones = {"555-312-642", "555-253-122", "555-128-940", "555-420-851"};
        String input;
        int position;

        input = JOptionPane.showInputDialog("Kogo szukamy? Wpisz kilka pierwszych liter");

        for (int index = 0; index < names.length; index++)
        {
            if (names[index].startsWith(input))
            {
                System.out.println(names[index] + ": " + phones[index]);
            }
        }

         */

        /*
        zad.7
        String input;

        input = JOptionPane.showInputDialog("Podaj serię liczb oddzielających je przecinkami, np: 3,76,2,4");
        int sum = 0;
        int value;

        String[] digits = input.split(",");

        for (String s : digits)
        {
            value = Integer.parseInt(s);
            sum += value;
        }

        JOptionPane.showMessageDialog(null, "Suma podanych cyfr to " + sum + ".");

         */

        /*
        zad.8
        String input;

        input = JOptionPane.showInputDialog("Podaj serię liczb bez przecinków a oblicze sume liczb pokolei");
        int sum = 0;
        int value;
        String[] digits = new String[input.length()];

        for (int index = 0; index < input.length(); index++)
        {
            digits[index] = String.valueOf(input.charAt(index));
        }

        for (String i : digits)
        {
            value = Integer.parseInt(i);
            sum += value;
        }

        JOptionPane.showMessageDialog(null, "Suma podanych liczb to " + sum);
         */

        /*
        zad.9
        String input;
        File file = new File("rzeczy.txt");
        Scanner outputFile = new Scanner(file);
        String[] fileWords = new String[500];
        String[] allWords = new String[10000];
        ArrayList<String> array = new ArrayList<>();

        int aku = 0;
        int index = 0;
        int all = 0;

        while (outputFile.hasNext())
        {
            fileWords[index] = outputFile.nextLine();
            index++;
        }

        for (int row = 0; row < index; row++)
        {
            input = fileWords[row];

            String[] test = input.split(" ");

            for (int col = 0; col < test.length; col++)
            {
                array.add(test[col]);
            }

        }

        for (String s : array)
        {
            aku++;
        }
        JOptionPane.showMessageDialog(null, aku);

         */
    }
}
