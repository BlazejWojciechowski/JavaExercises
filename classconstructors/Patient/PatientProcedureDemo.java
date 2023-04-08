package Zadania.KlasyKonstruktory;

import javax.swing.*;

public class PatientProcedureDemo {
    public static void main(String[] args) {
    String name;
    double priceProcs;

    Patient pat = new Patient("Błażej Wojciechowski", "Poznańska 10/50", 733596457, "Karolina R");
    Procedure proc1 = new Procedure("badanie fizykalne", 15122022, "dr Iwicki", 250);
    Procedure proc2 = new Procedure("zdjęcie rentgenowskie", 15122022, "dr Jaracz", 500);
    Procedure proc3 = new Procedure("badanie krwi", 15122022, "dr Szymczak", 200);

        System.out.println( "Informacje o pacjencie:\nNazwa: " + pat.getFullName() +
                                "\nAdres: " + pat.getFullAdress() + "\nTelefon: " +
                                pat.getPhoneN() + "\nOsoba kontaktowa: "
                                + pat.getContactPers());
        System.out.println();
        System.out.println("Badanie numer 1\t\t\t\t\tBadanie numer 2\t\t\t\t\tBadanie numer 3");
        System.out.println("_________________________________________________________________________________");
        System.out.println("Nazwa: " + proc1.getNameProcedure() + "\t" +
                            proc2.getNameProcedure() + "\t\t\t\t" +
                            proc3.getNameProcedure());
        System.out.println();
    }
}