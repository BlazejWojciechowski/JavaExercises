package Zadania.KlasyNakładkowe;

import javax.swing.*;

public class PlayWordsDemo
{
    public static void main(String[] args)
    {
        StringBuilder s1 = new StringBuilder();
        String s2, s3;
        char mark;
        int wordCount;
        String input;
        StringBuilder strb = new StringBuilder();
        String changed;

        input = JOptionPane.showInputDialog("Podaj jakiś łancuch znaków:");
        char [] marks = new char[input.length()];

        for (int row = 0; row < input.length(); row++)
        {
            marks[row] = input.charAt(row);
        }

        strb = PlayWords.arrayToString(marks);
        wordCount = PlayWords.wordCount(input);
        mark = PlayWords.mostFrequent(input);

        s1 = new StringBuilder(JOptionPane.showInputDialog("Podaj całe zdanie:"));
        s2 = JOptionPane.showInputDialog("Podaj slowo ktorego szukamy:");
        s3 = JOptionPane.showInputDialog("Podaj slowo ktore zamienimy na te wyszukane");

        changed = String.valueOf(PlayWords.replaceSubstring(s1, s2, s3));

        JOptionPane.showMessageDialog(null,String.format("W podanym wyrazie jest %d słów.", wordCount));
        JOptionPane.showMessageDialog(null, strb);
        JOptionPane.showMessageDialog(null, "W wyrazie najwięcej jest znaków - " + mark);
        JOptionPane.showMessageDialog(null, s1);
    }
}
