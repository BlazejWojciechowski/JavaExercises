package Zadania.Wyjątki;

import Zadania.KlasyObiekty.Month;

import javax.swing.*;

public class MonthDemo2 extends Month {
    public static void main(String[] args) {

        try {
            Month mon1 = new Month(1);

            System.out.println(mon1.getMonthNumber());
        }
        catch (WrongValueofMonth m) {
            System.out.println(m.getMessage());
        }
        finally {
            System.out.println("Koniec pierwszego bloku");
        }

        try {
            Month mon2 = new Month("Listopad");

            System.out.println(mon2.getMonthName());
        }
        catch (WrongStringofMonth s) {
            System.out.println(s.getMessage());
        }
        finally {
            System.out.println("Koniec drugiego bloku");
        }
    }
}
