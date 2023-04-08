package Zadania.Wyjątki;

import Zadania.KlasyKonstruktory.Payroll;

public class PayrollDemo2 {
    public static void main(String[] args) {
        Payroll pay1 = new Payroll();

        try {
            pay1.setName("");
            System.out.println(pay1.getName());
        }
        catch (WrongName n) {
            System.out.println(n.getMessage());
        }
        finally {
            System.out.println("1 blok wykonany.");
        }

        try {
            pay1.setIdNumber(0);
            System.out.println(pay1.getIdNumber());
        }
        catch (WrongID i) {
            System.out.println(i.getMessage());
        }
        finally {
            System.out.println("2 blok wykonany.");
        }

        try {
            pay1.setPayRate(26);

            System.out.println(pay1.getPayRate());
        }
        catch (WrongPayRate p) {
            System.out.println(p.getMessage());
        }
        finally {
            System.out.println("3 blok wykonany");
        }

        try {
            pay1.setHours(100);

            System.out.println(pay1.getHours());
        }
        catch (WrongHours h) {
            System.out.println(h.getMessage());
        }
        finally {
            System.out.println("4 blok wykonany");
        }
    }
}
