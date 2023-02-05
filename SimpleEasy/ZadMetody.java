package Zadania.Proste;

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;

public class ZadMetody
{
    /* Zad.1 triangle
    public static void main(String[] args)
    {
        double len;
        double w;
        double area;

        len = getLenght();
        w = getWidth();
        area = getArea(len, w);
        displayResult(len, w, area);
        System.exit(0);
    }




    public static double getLenght()
    {
        String input;
        double lenght;
        input = JOptionPane.showInputDialog("Podaj długość prostokąta:");
        lenght = Double.parseDouble(input);
        return lenght;
    }

    public static double getWidth()
    {
        String input;
        double width;
        input = JOptionPane.showInputDialog("Podaj szerokość prostokąta:");
        width = Double.parseDouble(input);
        return width;
    }

    public static double getArea (double lenght, double width)
    {
        return lenght * width;
    }

    public static void displayResult (double lenght, double width, double area)
    {
        System.out.println("Pole powierzchni prostokąta wynosi " + area);
    }

     */
    /* zad.2 Paint room

    public static void main(String[] args)
    {
        double roomNumbers;
        double paintPrice;
        double roomMeters;
        double paintNeeded;
        double hoursNeeded;
        double allPaintPrice;
        double workPrice;
        double allPaintingPrice;

       roomNumbers = getRoomNumbers();
       paintPrice = getPaintPrice();
       roomMeters = getRoomMeters();

       paintNeeded = roomMeters * 0.15;
       hoursNeeded = roomMeters * 0.8;

       allPaintPrice = paintNeeded * paintPrice;
       workPrice = hoursNeeded * 18;
       allPaintingPrice = allPaintPrice + workPrice;

        System.out.println("Liczba pokojów do pomalowania: " + roomNumbers + ".\nLiczba metrów kwadratowych do " +
                            "pomalowania: " + roomMeters + ". Liczba potrzebnych litrów farby: " + paintNeeded +
                            ".\nKoszt farby: +" + allPaintPrice + ".\nLiczba potrzebnych godzin pracy: " + hoursNeeded
                            + ".\nKoszt robocizny: " + workPrice + ".\nŁączny koszt malowania: " + allPaintingPrice);

    }

    public static double getRoomNumbers()
    {
        String input;
        double rooms;
        input = JOptionPane.showInputDialog("Podaj liczbę pokojów do pomalowania:");
        rooms = Double.parseDouble(input);
        return rooms;
    }

    public static double getPaintPrice()
    {
        String input;
        double paint;
        input = JOptionPane.showInputDialog("Podaj cenę farby za litr:");
        paint = Double.parseDouble(input);
        return paint;
    }

    public static double getRoomMeters()
    {
        String input;
        double meters;
        input = JOptionPane.showInputDialog("Podaj metry pokojów");
        meters = Double.parseDouble(input);
        return meters;
    }

     */

    /* zad.3 Falling from the sky
    public static void main(String[] args)
    {
        int fallingTime;
        int distanceTime;

        fallingDistance(1);

    }

    public static double fallingDistance(int fallingTime)
    {
        double meters = 0;
        for (int f = 1; f <= 10; f++)
        {
            meters = 0.5 * 9.8 * (fallingTime * fallingTime);
            System.out.printf("Obiekt przebył w %d sek. \t %.1f metrów.\n" , fallingTime, meters);
            fallingTime++;
        }
        return meters;
    }

     */

    /* zad.4 From Fahrenheit to Celsius
    public static void main(String[] args)
    {
        System.out.println("Stopnie Fahrenheita \t\t\t\t Stopnie Celsjusza");
        System.out.println("------------------------------------------------");
        celsius(40);
    }

    public static double celsius(double fahrenheit)
    {
        double celsius = 0;
        for (int f = 1; f <= 20; f++)
        {
            celsius = 0.55 * (fahrenheit - 32);
            System.out.printf("%.1f \t\t\t\t\t\t\t\t\t %.1f\n", fahrenheit, celsius);
            fahrenheit++;
        }

        return celsius;
    }

     */

    /* zad.5 Average score
    public static void main(String[] args)
    {
        double avgTest;
        int lastScore;

        avgTest = calcAvarage(5);
        lastScore = determineGrade(avgTest);

        System.out.printf("Twoja średnia to %.1f | W związku z tym ocena to %d .", avgTest, lastScore);
    }

    public static double calcAvarage (double tests)
    {
        String input;
        double avgTests = 0;
        double scoreTests;
        double akutests = 0;
        for (int t = 1; t <= tests; t++)
        {
            input = JOptionPane.showInputDialog("Podaj wynik testu nr: " + t);
            scoreTests = Double.parseDouble(input);
            while (scoreTests > 100 || scoreTests < 0)
            {
                System.out.println("Niepoprawne dane. Wprowadź jeszcze raz:");
                input = JOptionPane.showInputDialog("Podaj wynik testu nr: " + t);
                scoreTests = Double.parseDouble(input);
            }
            akutests += scoreTests;
        }
        avgTests = akutests / tests;
        return avgTests;
    }

    public static int determineGrade (double avgTest)
    {
        double lastScore = 0;

        if (avgTest >= 90)
            lastScore = 5;
        else if (avgTest >= 80)
            lastScore = 4;
        else if (avgTest >= 70)
            lastScore = 3;
        else if (avgTest >= 60)
            lastScore = 2;
        else
            lastScore = 1;

        return (int)lastScore;
    }

     */

    /* zad.6 Roadtrip
    public static void main(String[] args)
    {
        String input, choice;
        double speed, time, distance;
        input = JOptionPane.showInputDialog("Jeśli chcesz policzyć przebytą odległość wpisz tak lub nie");
        choice = String.format(input);
        while (choice.equalsIgnoreCase("tak"))
        {
        speed = getSpeed();
        time = getTime();
        distance = getDistance(speed, time);
        System.out.println("Przebyta odległość: " + distance + " metrów.");
        input = JOptionPane.showInputDialog("Jeśli chcesz policzyć przebytą odległość wpisz tak lub nie");
        choice = String.format(input);
        }
    }

    public static double getSpeed()
    {
        double speed;
        String input;
        input = JOptionPane.showInputDialog("Podaj szybkość pojazdu w km/h");
        speed = Double.parseDouble(input);
        return speed;
    }

    public static double getTime()
    {
        double time;
        String input;
        input = JOptionPane.showInputDialog("Podaj czas przejazdu w sekundach");
        time = Double.parseDouble(input);
        return time;
    }

    public static double getDistance(double speed, double time)
    {
        double distance;
        distance = speed * time;
        return distance;
    }

     */

    /*zad.7 Sales
    public static void main(String[] args)
    {
        String input;
        double lA, cZ, pZ, cS, pS, poziomZysku;
        input = JOptionPane.showInputDialog("Podaj liczbę akcji: ");
        lA = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Podaj cenę zakupu akcji: ");
        cZ = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Podaj kwotę prowizji zakupu akcji: ");
        pZ = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Podaj cene sprzedaży akcji: ");
        cS = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Podaj kwote prowizji sprzedaży akcji: ");
        pS = Double.parseDouble(input);

        poziomZysku = getSales(lA, cZ, pZ, cS, pS);
        if (poziomZysku > 0)
            System.out.println("Jest zysk, aż: " + poziomZysku + " złotych.");
        else
            System.out.println("Jest strata, aż: " +poziomZysku + " złotych.");
    }

    public static double getSales (double lA, double cZ, double pZ, double cS, double pS)
    {
        double poziomZysku;
        poziomZysku = ((lA * cZ) - pZ)-((lA * cS) + pS);
        return poziomZysku;
    }

    */

    /*zad.8 Kinetic energy
    public static void main(String[] args)
    {
        String input;
        double mass, speed, energy;
        input = JOptionPane.showInputDialog("Podaj mase obiektu poruszającego się w kilogramach:");
        mass = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Podaj prędkość obiektu poruszającego się w metrach na sekundę:");
        speed = Double.parseDouble(input);

        energy = kineticEnergy(mass, speed);
        displayValue(mass, speed, energy);
    }

    public static double kineticEnergy( double mass, double speed)
    {
        double energy;
        energy = 0.5 * mass * (speed * speed);
        return energy;
    }
    public static void displayValue(double mass, double speed, double energy)
    {
        JOptionPane.showMessageDialog(null, String.format("Obiekt o masie %.2f kg oraz prędkości" +
                                        " %.1f w metrach na sekundę, generuję energię kinetyczną w ilości: %,.2f" +
                                        " energii kinetycznej.", mass, speed, energy));
    }

    */



}