package Zadania.Proste;

import javax.swing.*;
import java.util.Scanner;

public class ZadaniaZlozoneOperatory {
    public static void main(String[] args) {
        /* zlozone operatory
        zad.1
        int x = 346728;
        x %= 7;

        int amount = 0;
        amount -= 4;

        int y = 4;
        y *= 4;

        int total = 823679;
        total /= 27;

        System.out.println("Amount: " + amount);
        System.out.println("y: " + y);
        System.out.println("total: " + total);
        System.out.println("x %: " + x);

         */

        /* operator rzutowania
        zad.2
        float a = 1;
        double b = 1;
        a = (float)b + a;

         */

        /* metody String
        zad.3
        String name = "Błażej";
        int nameSize = name.length();

        char letter = name.charAt(3);

        String littleName = name.toLowerCase();
        String bigName = name.toUpperCase();


        System.out.println(name + " składa się z " + nameSize + " znaków.");
        System.out.println("Czwarta litera " + name + " to " + letter + ".");
        System.out.println(name + " z małych liter to " + littleName + ".");
        System.out.println(name + " z dużych liter to " + bigName + ".");

         */
        /*
        zad.4
        String city = "San Francisco";
        System.out.println(city);

        int stringLenght = city.length();
        System.out.println("Długość znaków zmiennej city to " + stringLenght + " znaków.");

        char oneChar = city.charAt(0);
        System.out.println("Pierwszy znak łańcucha w zmiennej city to " + oneChar + ".");

        String upperCity = city.toUpperCase();
        System.out.println("Z wielkich liter " + upperCity + ".");

        String lowerCity = city.toLowerCase();
        System.out.println("Z malych liter " + lowerCity + ".");

         */
        /*
        zad.5
        Scanner keyboard = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "Witaj świecie");

        String firstName = JOptionPane.showInputDialog("Wprowadz swoje imię:");
        String lastName = JOptionPane.showInputDialog("Wprowadz swoje nazwisko:");

        JOptionPane.showMessageDialog(null, "Witaj " +
                                        firstName + " " + lastName + ".");
        System.exit(0);

         */
        /*
        zad.6
        String inputString;
        String name;
        int hours;
        double payRate;
        double grossPay;

        name = JOptionPane.showInputDialog("Jak sie nazywasz?");

        inputString = JOptionPane.showInputDialog("Ile godzin przepracowales w tym tygodniu? ");
        hours = Integer.parseInt(inputString);

        inputString = JOptionPane.showInputDialog(" Ile wynosi Twoja stawka godzinowa? ");
        payRate = Double.parseDouble(inputString);

        grossPay = hours * payRate;

        JOptionPane.showMessageDialog(null, "Witaj, " + name + "." +
                                    " Twoja pensja brutto wynosi " + grossPay + " złotych.") ;

        System.exit(0);

         */
        /*
        zad.7
        String input;
        int age;

        input = JOptionPane.showInputDialog("Ile masz lat?");
        age = Integer.parseInt(input);

        JOptionPane.showMessageDialog(null, "Twoj wiek to: " + age);

         */
        /*
        zad.8
        Scanner keyboard = new Scanner(System.in);

        String input;
        double cash;

        input = JOptionPane.showInputDialog("Oczekiwany roczny dochód?");
        cash = Double.parseDouble(input);

        JOptionPane.showMessageDialog(null, cash + " to za dużo.");

         */
        /*
        zad.9
        Scanner keyboard = new Scanner(System.in);

        String input;
        String name;
        int age;
        double annualPay;

        name = JOptionPane.showInputDialog("Podaj swoje imię i nazwisko");

        input = JOptionPane.showInputDialog("Podaj wiek");
        age = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Podaj oczekiwany roczny dochód");
        annualPay = Double.parseDouble(input);

        System.out.println("Nazywam się " + name + "," + " mam " + age + "lat");
        System.out.println("i chce zarabiać " + annualPay + " złotych rocznie.");

         */
        /*
        zad.10
        Scanner keyboard = new Scanner(System.in);

        String input;
        String firstName ;
        String middleName;
        String lastName;
        char firstInitial, middleInitial, lastInitial;

        firstName = JOptionPane.showInputDialog("Podaj swoje pierwsze imię");

        middleName = JOptionPane.showInputDialog("Podaj swoje drugię imię");

        lastName = JOptionPane.showInputDialog("Podaj swoje nazwisko");

        firstInitial = firstName.charAt(0);
        middleInitial = middleName.charAt(0);
        lastInitial = lastName.charAt(0);

        System.out.println("Twoje inicjały to: ");
        System.out.println(firstInitial + " " + middleInitial + " " + lastInitial);

         */

        /* Zad.11
        String input;
        double wartoscAuta;
        double podatekStanowy;
        double podatekLokalny;
        double wartoscAutazeStanowym;
        double wartoscAutazLokalnym;

        input = JOptionPane.showInputDialog("Wprowadź wartość kupowanego auta");
        wartoscAuta = Double.parseDouble(input);

        podatekStanowy = wartoscAuta * 0.04;
        podatekLokalny = wartoscAuta * 0.02;
        wartoscAutazeStanowym = wartoscAuta + podatekStanowy;
        wartoscAutazLokalnym = wartoscAuta + podatekLokalny;

        System.out.println("Wartość produktu: " + wartoscAuta + "\nPodatek stanowy: " + podatekStanowy +
                            "\nPodatek lokalny: " + podatekLokalny + "\nWartość auta z podatkiem stanowym: "
                            + wartoscAutazeStanowym + "\nWartość auta z podatkiem lokalnym: " + wartoscAutazLokalnym);

         */
        /*
        zad.12
        int cookies;
        int calorie;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj liczbę zjedzonych ciasteczek:");
        cookies = keyboard.nextInt();
        calorie = cookies * 75;

        System.out.println("Skonsumowano " + calorie + " kalorii.");

         */
        /*
        zad.13
        Scanner keyboard = new Scanner(System.in);

        double litryPaliwa;
        double przejechaneKilometry;
        double kilometryNaLitrze;

        System.out.println("Podaj przejechane kilometry:");
        przejechaneKilometry = keyboard.nextDouble();

        System.out.println("Podaj litry zużytego paliwa:");
        litryPaliwa = keyboard.nextDouble();

        kilometryNaLitrze = przejechaneKilometry / litryPaliwa;

        System.out.println("Przejechano kilometrów na jednym litrze: " + kilometryNaLitrze);

         */
        /*
        zad.14
        Scanner keyboard = new Scanner(System.in);

        float test1, test2, test3;

        System.out.println("Podaj wynik pierwszego testu:");
        test1 = keyboard.nextFloat();

        System.out.println("Podaj wynik drugiego testu:");
        test2 = keyboard.nextFloat();

        System.out.println("podaj wyniki trzeciego testu:");
        test3 = keyboard.nextFloat();

        float srednia = (test1 + test2 + test3) / 3;

        System.out.println("Wynik z pierwszego testu: " + test1 + "\nWynik z drugiego testu: " + test2 +
                            "\nWynik z trzeciego testu: " + test3 + "\nŚrednia z testów: " + srednia);

         */
        /*
        zad.15
        Scanner keyboard = new Scanner(System.in);



        System.out.println("Proszę o wprowadzenie ceny posiłku:");
        double value = keyboard.nextDouble();
        double tax = value * 0.0675;
        double taxAndValue = tax + value;
        double tip = taxAndValue * 0.2;
        double sum = value + tax + tip;

        System.out.println("Cena Posiłku: " + value + "\nWartość podatku 6.75% : " + tax + "\nWysokość napiwku 20%: "
                + tip + "\nŁączna kwota do zapłaty: " + sum + " złotych.");

         */

        /*
        zad.16
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź liczbę kobiet: ");
        int women = keyboard.nextInt();

        System.out.println("Wprowadz liczbę meżczyzn: ");
        int men = keyboard.nextInt();

        double together = women + men;

        double mensPerc = (men / together) * 100;
        double womenPerc = (women / together) * 100;

        System.out.println("Procentowo kobiet jest: " + womenPerc + "%" + "\nProcentowo mężczyzn jest: "
                            + mensPerc + "%");

         */

        /*
        zad.17
        Scanner keyboard = new Scanner(System.in);

        double cukier = 300 / 48;
        double cukierCiastko = cukier;

        double masło = 200 / 48;
        double masłoCiastko = masło;

        double mąka = 550 / 48;
        double mąkaCiastko = mąka;

        System.out.println("Podaj liczbę ciasteczek: ");
        double ciasteczka = keyboard.nextDouble();

        double potrzebnyCukier = ciasteczka * cukierCiastko;
        double potrzebnaMąka = ciasteczka * mąkaCiastko;
        double potrzebneMasło = ciasteczka * masłoCiastko;

        System.out.println("Na podaną ilość " + ciasteczka + "\nJest potrzebne: " + potrzebnyCukier + " gram cukru, "
                            + potrzebneMasło + " gram masła, " + potrzebnaMąka + " gram mąki.");

         */
        /*
        zad.18
        Scanner keyboard = new Scanner(System.in);

        double boughtAction = 1000 * 32.87;
        double boughtProvision = boughtAction * 0.02;

        double soldAction = 1000 * 33.92;
        double soldProvision = soldAction * 0.02;

        double zysk = soldAction - (boughtAction + boughtProvision + soldProvision);

        System.out.println("Jacek kupił akcję za " + boughtAction + " złotych i zapłacił za nie brokerowi " + boughtProvision
                            + " złotych prowizji." + "\nJacek sprzedał akcje za " + soldAction + " złotych i zapłacił za nie " +
                            soldProvision + " złotych prowizji." + "\nZysk Jacka to " + zysk + " złotych.");

         */
        /*
        zad.19
        Scanner keyboard = new Scanner(System.in);

        double v, r, e, s;

        System.out.println("Podaj długość rzędu w metrach:");
        r = keyboard.nextDouble();

        System.out.println("Podaj ilość zajmowanego przez okratowanie w metrach:");
        e = keyboard.nextDouble();

        System.out.println("Podaj odległości między sadzonkami:");
        s = keyboard.nextDouble();

        v = (r - 2 * e) / s;

        System.out.println("Liczba sadzonek jakie zmieszczą się w rzędzie to: " + v);

         */
        /*
        zad.20
        Scanner keyboard = new Scanner(System.in);

        double p, r, n, t;

        System.out.println("Podaj kwotę pieniędzy zdeponowanych:");
        p = keyboard.nextDouble();

        System.out.println("Podaj roczną stopę oprocentowania:");
        r = keyboard.nextDouble();

        System.out.println("Ilość odsetek kapitalizowanych w skali roku:");
        n = keyboard.nextDouble();

        System.out.println("Liczbe lat:");
        t = keyboard.nextDouble();

        double a = (1 + r/n) * t * t;

        System.out.println("Po " + t + " latach zgromadzi się " + a + " złotych.");

         */



    }
}
