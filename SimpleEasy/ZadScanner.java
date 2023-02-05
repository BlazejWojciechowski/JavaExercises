package Zadania.Proste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZadScanner
{
    public static void main(String[] args) throws IOException
    {


        /* Tworzenie nowego pliku i zapisywanie w nim swojego imienia

        Scanner keyboard = new Scanner(System.in);
        String input;
        String name = "Błażej";

        System.out.println("Podaj nazwę pliku:");
        input = keyboard.nextLine();

        PrintWriter outputFile = new PrintWriter(input);
        outputFile.println(name);

        outputFile.close();
        System.out.println("Dane zapisane.");

         */

        /* Otwieranie pliku i wczytywanie z niego pierwszego wiersza pliku

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku.");
        String filename = keyboard.nextLine();

        File file = new File(filename);

        Scanner inputFile = new Scanner(file);

        String line = inputFile.nextLine();

        System.out.println("Pierwszy wiersz tego pliku to: " + line);

        inputFile.close();

         */

        // Wczytywanie pliku i sprawdzanie czy plik istnieje oraz dopisywanie do niego
        // kolejnych danych.
        /*

        Scanner keyboard = new Scanner(System.in);

        String friendName;
        String filename;
        int numFriends;

        System.out.println("Program zapisuje znajomych w pliku.");
        System.out.println("Podaj liczbę znajomych:");
        numFriends = keyboard.nextInt();

        System.out.println("Podaj nazwę pliku:");
        filename = keyboard.nextLine();

        File file = new File(filename);
        if (file.exists()) // sprawdzanie czy plik istnieje
        {
            System.out.println("Plik " + filename + " już istnieje.");
            System.exit(0);
        }
        PrintWriter outPutFile = new PrintWriter(file);

        for (int i = 1; i <= numFriends; i++)
        {
            System.out.println("Podaj imię znajomego numer: " + i);
            friendName = keyboard.nextLine();
            outPutFile.println(friendName);
        }
        outPutFile.close();
        System.out.println("Dane zapisano w pliku.");

         */

        //zapisywanie w pliku 100 liczb w petli
        /*
        Scanner keyboard = new Scanner(System.in);
        String input;

        System.out.println("Podaj nazwę pliku:");
        input = keyboard.nextLine();

        PrintWriter outputFile = new PrintWriter(input);

        for (int i = 1; i <= 100; i++)
        {
            outputFile.println(i);
        }
        outputFile.close();

         */
        //Wczytywanie pliku i wczytywanie z niego zawartości oraz sumowanie ich.
        /*
        Scanner keyboard = new Scanner(System.in);
        String filename;
        int number;
        int sum = 0;

        System.out.println("Podaj nazwę pliku:");
        filename = keyboard.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext())
        {
            number = inputFile.nextInt();
            System.out.println("Liczba: " + number);
            sum += number;
            System.out.println("Suma: " + sum);
        }
        System.out.println("Wczytano wszystko.");
        inputFile.close();

         */


        //Otwieranie pliku już istniejacego lub tworzy go a nastepnie mozna zapisywac w nim nowe dane

        /*
        FileWriter fwriter = new FileWriter("NumberList.txt", true);
        PrintWriter outputFile = new PrintWriter(fwriter);

        for (int i = 101; i <= 103; i++)
        {
            outputFile.println(i);
            System.out.println("Dodano liczbę: " + i);
        }
        outputFile.close();

         */

        /*Otwieranie nowego pliku i zapisywanie w nim danych
        Scanner keyboard = new Scanner(System.in);

        double speed, time, distance;
        double sum = 0;

        System.out.println("Podaj prędkość pociągu:");
        speed = keyboard.nextDouble();

        System.out.println("Podaj czas przejazdu pociągu:");
        time = keyboard.nextDouble();

        while (speed <= 0 && time < 1)
        {
            System.out.println("Podałes niepoprawne dane, wpisze jeszcze raz:");
            System.out.println("Podaj prędkość:");
            speed = keyboard.nextDouble();
            System.out.println("Podaj czas przejazdu:");
            time = keyboard.nextDouble();
        }

        FileWriter fwriter = new FileWriter("Przebytaodległosć.txt", true);
        PrintWriter outputFile = new PrintWriter(fwriter);

        //System.out.println("Godzina\tPrzebyta odległość");
        //System.out.println("---------------------------");
        outputFile.println("Godzina\tPrzebyta odległość");

        for (int i = 1; i <= time; i++)
        {
            distance = speed;
            System.out.println(i + "\t\t" + (distance + sum));
            sum += distance;
            outputFile.println(i + "\t\t" + (distance + sum));
        }
        System.out.println("Zapisano plik.");
        outputFile.close();

         */
        /*Otwieranie istniejacego pliku i wczytywanie z niego danych
        Scanner keyboard = new Scanner(System.in);
        String filename;
        double number;
        int sum = 0;
        String name;

        System.out.println("Podaj nazwę pliku:");
        filename = keyboard.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext())
        {
            name = inputFile.nextLine();
            System.out.println(name);
            number = inputFile.nextDouble();
            System.out.println(number);
        }
        System.out.println("Wczytano wszystko.");
        inputFile.close();

         */

        /* Wykres słupkowy
        Scanner keyboard = new Scanner(System.in);
        PrintWriter outputFile = new PrintWriter("wykres.txt");
        int value;
        int stars;
        int s;

        for ( s = 1; s <= 5; s++)
        {
            System.out.println("Podaj wartość sprzedaży ze sklepu nr " + s + ":");
            value = keyboard.nextInt();
            stars = value / 100;
            outputFile.println(stars);
        }
        outputFile.close();

        File file = new File("wykres.txt");
        Scanner inputFile = new Scanner(file);

        System.out.println("WYKRES SŁUPKOWY Z POZIOMEM SPRZEDAŻY:");

        int g = 1;
        while (inputFile.hasNext())
        {
            System.out.print("Sklep nr " + g + ": ");
            int number = inputFile.nextInt();
            for (int n = 1; n <= number; n++)
            {
                System.out.print("*");
            }
            System.out.println();
            g++;
        }
        inputFile.close();

         */
        /* Wczytywanie danych z pliku i numeracja wierszy
        Scanner keyboard = new Scanner(System.in);
        PrintWriter outputfile = new PrintWriter("rzeczy.txt");

        for (int r = 1; r <= 5; r++)
        {
            System.out.println("Podaj jakiś tekst:");
            String line = keyboard.nextLine();
            outputfile.println(line);
        }
        outputfile.close();

        File file = new File("rzeczy.txt");
        Scanner inputFile = new Scanner(file);

        int w = 1;

        while (inputFile.hasNext())
        {
            String line = inputFile.nextLine();
            System.out.println(w + " wiersz pliku to: " + line);
            w++;
        }
        inputFile.close();

         */

    }
}
