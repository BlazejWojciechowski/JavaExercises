package Zadania.PlikiBinarnePlikiSwobodne;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Safe
{
    public static void main (String [] args) throws IOException
    {
        StringBuilder strb = new StringBuilder();
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> safeNum = new ArrayList<>();
        ArrayList<String> prevNum = new ArrayList<>();

        File file = new File("zapisane.txt");
        Scanner inputFile = new Scanner(file);

        String value;
        int length;

        while (inputFile.hasNext())
        {
            numbers.add(inputFile.nextLine());
        }
        inputFile.close();

        for (String i : numbers)
        {
            System.out.println(i);
            value = String.valueOf(i);
            strb = new StringBuilder(value + "10");
            safeNum.add(String.valueOf(strb));
        }
        for (String s : safeNum)
        {
            System.out.println(s);
            strb = new StringBuilder(s);
            strb.delete(s.length() - 1, s.length());
            prevNum.add(String.valueOf(strb));
        }

        for (String p : prevNum)
        {
            System.out.println(p);
        }

    }
}
