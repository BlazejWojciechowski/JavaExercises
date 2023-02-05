package Zadania.KlasyKonstruktory;

import Zadania.KlasyKonstruktory.Payroll;
import Zadania.Wyjątki.WrongID;
import Zadania.Wyjątki.WrongPayRate;

import java.util.Scanner;

public class PayrollDemon
{
    public static void main(String[] args) throws WrongPayRate {
        Scanner keyboard = new Scanner(System.in);
        String input;
        String name;
        int id;

        System.out.println("Podaj swoje imię i nazwisko:");
        name = keyboard.nextLine();

        System.out.println("Podaj swoje ID:");
        id = keyboard.nextInt();

        Payroll employee1 = new Payroll(name, id);
        employee1.setPayRate(25);
        employee1.setHours(115);

        System.out.println(employee1.getName() + " o numerze ID: " + employee1.getIdNumber() + " zarobił w tym miesiącu: "
                            + employee1.getPaidValue() + " złotych.");

    }
}
