package Zadania.KlasyNakładkowe;

import javax.swing.*;

public class Language {
    public static void main(String[] args)  {
        String input;
        input = JOptionPane.showInputDialog("Podaj jakieś zdanie a ja je przerobie na świńską łacinę");
        String[] allWords = input.split(" ");

        char ch;
        String word;
        StringBuilder strb = new StringBuilder();

        for (int row = 0; row < allWords.length; row++) {
            word = allWords[row];
            ch = word.charAt(0);
            StringBuilder wo = new StringBuilder(word);

            for (int col = 0; col < 1; col++) {
                wo.insert(word.length(), ch);
                wo.deleteCharAt(0);
                wo.append("ay");
                wo.append(" ");
            }
            strb.append(wo);
        }
        JOptionPane.showMessageDialog(null, strb.toString());
    }
}
