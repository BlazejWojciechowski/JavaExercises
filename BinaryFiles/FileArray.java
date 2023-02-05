package Zadania.PlikiBinarnePlikiSwobodne;

import java.io.*;

public class FileArray
{
    public static void main(String[] args) throws IOException
    {
        String filename = "Myinfo.dat";
        int[] array = {5, 10, 15, 20};

        //writeArray(filename, array);
        readArray(filename, array);
    }

    public static void writeArray(String filename, int[] array) throws IOException
    {
        FileOutputStream fstream = new FileOutputStream(filename);
        DataOutputStream outputFile = new DataOutputStream(fstream);

        System.out.println("Zapisywanie liczb w pliku...");

        for (int index = 0; index < array.length; index++)
        {
            outputFile.writeInt(array[index]);
        }
        outputFile.close();
    }
    public static void readArray(String filename, int[] array) throws IOException
    {
        int number;
        boolean endofFile = false;

        FileInputStream fstream = new FileInputStream(filename);
        DataInputStream inputFile = new DataInputStream(fstream);

        System.out.println("Wczytywanie liczb z pliku...");

        while (!endofFile)
        {
            try
            {
             number = inputFile.readInt();
                System.out.println(number + " ");
            }
            catch (IOException e)
            {
                endofFile = true;
            }
        }

        System.out.println("\nGotowe");

        inputFile.close();
    }
}
