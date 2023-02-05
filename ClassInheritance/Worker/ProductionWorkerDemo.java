package Zadania.KlasyDziedziczenie;

import Zadania.Wyjątki.InvalidEmployeeNumber;
import Zadania.Wyjątki.InvalidPayRate;
import Zadania.Wyjątki.InvalidShift;

import javax.swing.*;

public class ProductionWorkerDemo
{
    public static void main(String[] args) throws InvalidPayRate, InvalidShift, InvalidEmployeeNumber {

    String input;
    String name;
    int shift, doneHours;
    String workerID, hiredate;
    double payrate, yearPay, bonus;

    name = JOptionPane.showInputDialog("Podaj nazwisko pracownika");
    hiredate = JOptionPane.showInputDialog("Podaj datę zatrudnienia");
    workerID = JOptionPane.showInputDialog("Podaj ID pracownika w formacie XXX-L gdzie X to cyfry a L litera z " +
                                                " przedziału od A do M.");

    input = JOptionPane.showInputDialog("Podaj zmianę 1 - dzienna lub 2 - nocna");
    shift = Integer.parseInt(input);

    input = JOptionPane.showInputDialog("Podaj stawkę godzinową");
    payrate = Double.parseDouble(input);

    input = JOptionPane.showInputDialog("Podaj liczbę ukończonych godzin na kursach");
    doneHours = Integer.parseInt(input);


    TeamLeader supervisor1 = new TeamLeader(name, hiredate, workerID, shift, payrate, doneHours);

    JOptionPane.showMessageDialog(null, supervisor1.toString());
    JOptionPane.showMessageDialog(null,String.format("Zmiana:  %d . \t Stawka godzinowa:  %.2f złotych.\n" +
                                    "Premia: %.2f złotych."
                                   , supervisor1.getShift(), supervisor1.getPayRate(), supervisor1.getMonthBonus()));
    }
}
