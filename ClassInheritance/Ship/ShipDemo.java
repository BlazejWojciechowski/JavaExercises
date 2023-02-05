package Zadania.KlasyDziedziczenie;

import javax.swing.*;

public class ShipDemo
{
    public static void main(String[] args)
    {
        String nameShip, yearBuilt;
        int passengersMax, loadMax;
        int numberShips, choice;
        String input;
        input = JOptionPane.showInputDialog("Ile chcesz w sumie dodać statków do tablicy?");
        numberShips = Integer.parseInt(input);
        Ship[] tests = new Ship[numberShips];

        for (int index = 0; index < tests.length; index++)
        {
            input = JOptionPane.showInputDialog("Jaki statek chcesz dodać? 1 - Pasażerski | 2 - Towarowy");
            choice = Integer.parseInt(input);

            if (choice == 1)
            {
                nameShip = JOptionPane.showInputDialog("Podaj nazwę statku pasażerskiego");
                yearBuilt = JOptionPane.showInputDialog("Podaj rok budowy");
                input = JOptionPane.showInputDialog("Podaj maksymalną liczbę pasażerów");
                passengersMax = Integer.parseInt(input);

                tests[index] = new CruiseShip(nameShip, yearBuilt, passengersMax);
            }
            else
            {
                nameShip = JOptionPane.showInputDialog("Podaj nazwę statku towarowego");
                yearBuilt = JOptionPane.showInputDialog("Podaj rok budowy");
                input = JOptionPane.showInputDialog("Podaj maksymalną ładowność w tonach");
                loadMax = Integer.parseInt(input);

                tests[index] = new CargoShip(nameShip, yearBuilt, loadMax);
            }
        }

        for (int i = 0; i < tests.length; i++)
        {
            System.out.println("Statek numer " + (i + 1) + ": " + tests[i].toString() );
        }
    }
}
