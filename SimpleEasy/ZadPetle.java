package Zadania.Proste;

import javax.swing.*;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class ZadPetle {
    public static void main(String[] args) {
        /* zad.1 factorial result

        int [] tablica = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        System.out.println("Rozmiar: " + tablica.length);

        for (int i = 0; i < tablica.length; i++)
        {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
        for (int i = tablica.length - 1; i >=0; i--)
        {
            System.out.print(tablica[i] + " ");
        }
        int wynik = 5;
        for (int i = 0; i < tablica.length; i++)
        {
            wynik += tablica[i];
        }
        System.out.println();
        System.out.println("Wynik: " + wynik);

        int liczba = 5;
        int wynikSilnia = 1;

        for (int i = liczba; i >= 1; i--)
        {
            wynikSilnia *= i;
        }
        System.out.println("Wynik silnia: " + wynikSilnia);

         */


        /*

        /*
        Scanner keyboard = new Scanner(System.in);

        int number;
        System.out.println("Podaj liczbę z przedziału od 10 do 24 włącznie: ");
        number = keyboard.nextInt();

        while ( number < 10 || number > 24)
        {
            System.out.println("Niepoprawna liczba, podaj liczbę z przedziału od 10 do 24 włacznie:");
            number = keyboard.nextInt();
        }

        System.out.println("Poprawna liczba, podałes: " + number);

         */
        /*
        Scanner keyboard = new Scanner(System.in);
        String input;
        char letter;
        System.out.println("Wpisz t lub n bez względu na wielkosc znaków:");
        input = keyboard.nextLine();
        letter = input.charAt(0);

        while (letter != 'T' && letter != 'N' && letter != 't' && letter != 'n')
        {
            System.out.println("Podales nieprawidlową literke.\n" +
                    "Wpisz jeszcze raz T, t, N, n");
            input = keyboard.nextLine();
            letter = input.charAt(0);
        }

        System.out.println("Wprowadziłes dobrze " + letter);

         */
        /*
        Scanner keyboard = new Scanner(System.in);
        String input;
        System.out.println("Wpisz tak lub nie bez względu na wielkosc znakow:");
        input = keyboard.nextLine();

        while ((!input.equalsIgnoreCase("tak")) && (!input.equalsIgnoreCase("nie")))
        {
            System.out.println("Zle wpisales, wpisz tak lub nie:");
            input = keyboard.nextLine();
        }

        System.out.println("Wpisales dobrze: " + input);

         */
        /*

        for (int count = 0; count <= 100; count += 5)
        {
            System.out.print(count + " ");
        }

         */
        /*
        String input;
        int number, count;
        double sum = 0;

        for (count = 1; count <= 7; count++)
        {
        input = JOptionPane.showInputDialog("Proszę wprowadź liczbę");
        number = Integer.parseInt(input);
        sum += number;
        }
        JOptionPane.showMessageDialog(null, String.format("Suma wszystkich liczb %.2f" , sum));

         */
        /*
        Scanner keyboard = new Scanner(System.in);
        int number;
        int tenTimes;
        int product = 0;

        while (product < 100 )
        {
            System.out.println("Podaj liczbę:");
            number = keyboard.nextInt();
            tenTimes = number * 10;
            product += tenTimes;
        }
        System.out.println(product);

         */
        /*
        Scanner keyboard = new Scanner(System.in);
        double number1, number2, sum;
        String input;
        //char repeat;

        do
        {
            System.out.println("Podaj dowolną liczbę nr 1:");
            number1 = keyboard.nextDouble();
            System.out.println("Podaj dowolną liczbę nr 2:");
            number2 = keyboard.nextDouble();

            keyboard.nextLine();

            sum = number1 + number2;
            System.out.println("Suma tych liczb to " + sum);
            System.out.println("Jeśli chcesz wykonac operacje jeszcze raz wpisz 't' - tak .");
            input = keyboard.nextLine();
            //repeat = input.charAt(0);
        } while (input.equalsIgnoreCase("t"));

        System.out.println("Program zakończony.");

         */
        /*
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i <= 1000; i += 10)
        {
            System.out.println(i + " ");
        }

         */
        /*
        Scanner keyboard = new Scanner(System.in);
        double number;
        double aku = 0;

        for (int i = 0; i <= 10; i++)
        {
            System.out.println("Podaj liczbę:");
            number = keyboard.nextDouble();
            aku += number;
            System.out.println("Aktualna suma to: " + aku);
        }

         */
        /*
        double x = 1;
        double y = 30;
        double sum;
        double aku = 0;

        for (int i = 0; i <= 30; i++ )
        {
            sum = x / y;
            aku += sum;
            System.out.println("Aktualna suma to: " + sum);
            x++;
            y--;
        }

         */
        /*

        for (int i = 0; i < 10; i++)
        {
            System.out.println(" ");
            for (int j = 0; j < 15; j++)
            {
                System.out.print("#");
            }
        }

         */
        /*
        Scanner keyboard = new Scanner(System.in);
        int x;

        do
        {
            System.out.println("Podaj liczbę:");
            x = keyboard.nextInt();
        } while (x > 0);

         */

        /*
        Scanner keyboard = new Scanner(System.in);
        String input;
        char answer;
        System.out.println("Zakończyć pracę?");
        input = keyboard.nextLine();
        answer = input.charAt(0);

        while (answer != 'T' && answer != 'N')
        {
            System.out.println("Na pewno chcesz zakończyć pracę?");
            input = keyboard.nextLine();
            answer = input.charAt(0);
        }

         */

        /*
        for (int i = 0; i < 50; i++)
        {
            System.out.println("Count ma wartość " + i + ".");
        }

         */

        /*
        int x = 50;
        while (x > 0)
        {
            System.out.println(x + " sekund do końca.");
            x--;
        }

         */

        /*
        Scanner keyboard = new Scanner(System.in);
        int number;
        System.out.println("Podaj liczbę z przedziału 1 do 4 włącznie:");
        number = keyboard.nextInt();
        while (number < 1 || number > 4)
        {
            System.out.println("Podałeś złą cyfrę, podaj z przedziału od 1 do 4 włącznie:");
            number = keyboard.nextInt();
        }
        System.out.println("Wszystko git, podałeś liczbę: " + number);

         */
        /*
        Scanner keyboard = new Scanner(System.in);
        String input;
        System.out.println("Wpisz tak lub nie zeby kontynuować:");
        input = keyboard.nextLine();

        while ((!input.equalsIgnoreCase("tak")) && (!input.equalsIgnoreCase("nie")))
        {
            System.out.println("Miales wpisac tak lub nie :(\nWpisz jeszcze raz.");
            input = keyboard.nextLine();
        }
        System.out.println("Wpisales to co mialo byc wpisane :P");

         */

        /*
        final int BASE_SIZE = 7;
        for (int r = 0; r < BASE_SIZE; r++)
        {
            for (int c = 8; c > (r + 1); c--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

         */
        /*
        final int BASE_SIZE = 6;
        for (int r = 0; r < BASE_SIZE; r++)
        {
            for (int c = 0; c > r ; c++)
            {
                System.out.print(" ");
            }
            System.out.println("##");

         */

        /*
        Scanner keyboard = new Scanner(System.in);
        int input;
        int sum = 0;
        int value;
        System.out.println("Podaj liczbę dodatnią róźną od zera:");
        input = keyboard.nextInt();

        value = input % 2;
        while (value == 1 && input == 0)
        {
            System.out.println("Podana liczba jest nieprawidłowa, podaj inną:");
            input = keyboard.nextInt();
        }

        System.out.println("Podana liczba jest prawidłowa, liczymy sumę:");

        for (int i = 1; i <= input; i++)
        {
            System.out.println("Dodajemy " + i + " do sumy.");
            sum += i;
            System.out.println("Aktualna suma to: " + sum + ".");
        }
        System.out.println("Koniec.");

         */
        /*
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

        System.out.println("Godzina\tPrzebyta odległość");
        System.out.println("---------------------------");

        for (int i = 1; i <= time; i++)
        {
            distance = speed;
            System.out.println(i + "\t\t" + (distance + sum));
            sum += distance;
        }

         */
        /*
        Scanner keyboard = new Scanner(System.in);
        int value, sum = 0, days;

        System.out.println("Ten program oblicza podwojone dniówki.");
        System.out.println("Z ilu dni chcesz przeliczyć podwojone dniówki?");
        days = keyboard.nextInt();
        System.out.println("Podaj stawkę początkową:");
        value = keyboard.nextInt();

        while (days < 1 || value > 1)
        {
            System.out.println("Źle wprowadzone dane.");
            System.out.println("Podaj jeszcze raz ilość dni:");
            days = keyboard.nextInt();
            System.out.println("Podaj jeszczr raz stawkę początkową:");
            value = keyboard.nextInt();
        }

        System.out.println("Dzień\t\tDniówka");
        System.out.println("-------------------");

        for (int i = 0; i < days; i++)
        {
            System.out.println((i + 1) + "\t\t\t" + value );
            sum += value;
            value = (value * 2);
        }
        System.out.println("Suma dniówek z " + days + " dni. Wynosi " + sum + " złotych.");

         */
        //zad 5 str 288

        /* Obłożenie w hotelu
        Scanner keyboard = new Scanner(System.in);
        int floors;
        double freeRooms, busyRooms, allRooms, fullLevel, fullLevelPerc;
        double sumAllrooms = 0;
        double sumAllbusyrooms = 0;

        System.out.println("Podaj liczbę pięter w hotelu:");
        floors = keyboard.nextInt();

        while (floors < 1)
        {
            System.out.println("Podałeś zlą liczbę pięter.\nPodaj liczbę nie mniejszą niz 1:");
            floors = keyboard.nextInt();
        }

        for (int r = 1; r <= floors; r++)
        {
            System.out.println("Podaj liczbę wszystkich pokoi dostępnych na poziomie " + r + ":");
            allRooms = keyboard.nextDouble();

            while (allRooms <10)
            {
                System.out.println("Liczba pokoi na piętrze nie może być mniejsza niż 10.\nPodaj ponownie ilość:");
                allRooms = keyboard.nextDouble();
            }

            System.out.println("Podaj liczbę zajętych pokoi na poziomie " + r + ":");
            busyRooms = keyboard.nextDouble();

            sumAllrooms += allRooms;
            sumAllbusyrooms += busyRooms;
        }
        freeRooms = sumAllrooms - sumAllbusyrooms;
        fullLevel = sumAllbusyrooms / sumAllrooms;
        fullLevelPerc = fullLevel * 100;

        System.out.printf("Łączna ilość pokoi w hotelu to %.1f .\nLiczba zajętych pokoi w hotelu to " +
                            "%.1f .\nLiczba pustych pokoi w hotelu to %.1f .\nPoziom obłożenia to %.1f procent." ,
                sumAllrooms, sumAllbusyrooms, freeRooms, fullLevelPerc);

         */
        /* Obliczanie średniej deszczu

        Scanner keyboard = new Scanner(System.in);

        int years, sumMonths;
        double avgRain, sizeRain, sumSizeRain = 0;
        System.out.println("Podaj liczbę lat w których chcesz policzyć średni poziom opadów w miesiącu przez rok:");
        years = keyboard.nextInt();

        while (years < 1)
        {
            System.out.println("Liczba lat nie może być mniejsza niż 1 rok.\nPodaj liczbę lat:");
            years = keyboard.nextInt();
        }

        for (int y = 1; y <= years; y++)
            for (int m = 1; m <= 12; m++)
            {
                System.out.println("Podaj liczbę centymetrów opadów w miesiącu " + m + ":");
                sizeRain = keyboard.nextDouble();
                while (sizeRain < 0)
                {
                    System.out.println("Opady nie mogą być ujemne.\nPodaj liczbę opadów w centymetrach:");
                    sizeRain = keyboard.nextInt();
                }
                sumSizeRain += sizeRain;
            }
        sumMonths = years * 12;
        avgRain = sumSizeRain / sumMonths;
        System.out.println("W " + sumMonths + " miesiącach spadło razem " + sumSizeRain + " centymetrów deszczu." +
                            "\nTo daje średnią " + avgRain + " na miesiąc.");

         */
        /* Liczba populacji i rozmnażania
        Scanner keyboard = new Scanner(System.in);
        double organism, population, days, sizePopulationPday, sizePopulationAll = 0;

        System.out.println("Podaj początkową wartość populacji organizów:");
        organism = keyboard.nextDouble();

        while (organism < 2)
        {
            System.out.println("Organizmów nie może byc mniej niź 2.\nPodaj liczbę organizmów jeszcze raz:");
            organism = keyboard.nextDouble();
        }

        System.out.println("Podaj średni przyrost dzienny populacji w procentach:");
        population = keyboard.nextDouble();

        while (population < 0)
        {
            System.out.println("Przyrost populacji nie może być ujemny.\nPodaj przyrost populacji jeszcze raz:");
            population = keyboard.nextDouble();
        }

        System.out.println("Podaj liczbę dni przez które mają się organizmy rozmnażać:");
        days = keyboard.nextDouble();

        while (days < 1)
        {
            System.out.println("Liczba dni nie może być mniejsza niź 1.\nPodaj liczbę dni jeszcze raz:");
            days = keyboard.nextDouble();
        }

        population = population / 100;
        sizePopulationPday = organism * population;
        organism = organism + sizePopulationPday;

        for (int o = 1; o <= days; o++)
        {
            System.out.printf("\nDzień %d :\nWielkość populacji to : %.1f organizmów." , o , organism);
            sizePopulationPday = organism * population;
            organism = organism + sizePopulationPday;
        }

         */
        /* Przypisyawnie liczb najmniejszej/największej
        Scanner keyboard = new Scanner(System.in);
        int number;
        int highNumber = 0;
        int lowNumber = 2000000;

        do
        {
            System.out.println("Podaj dowolną liczbę całkowitą:");
            number = keyboard.nextInt();
            if (highNumber < number)
                highNumber = number;
            else if (lowNumber > number )
            {
                lowNumber = number;
            }
        } while (number != 99);

        System.out.println("Program zakończono.");
        System.out.println("Największa wpisana cyfra to " + highNumber);
        System.out.println("Najmniejsza wpisana cyfra to " + lowNumber);

         */
        /* Stopnie celsjusza na fahrenheita
        double f;

        System.out.println("Konwersja ze stopni celsjusza na Fahrenheita:");
        System.out.println("Stopnie Celsjusza \t\t Stopnie Fahrenheita");
        System.out.println("---------------------------------------------");

        for (int c = 0; c <= 20; c++)
        {
            f = (1.8 * c) + 32;
            System.out.printf("%d \t\t\t\t\t\t %.1f \n", c, f);
        }

         */
        /* Zgadywanie liczb i przypisywanie punktów w petli while
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int randNumber;
        int playerNumber;
        int aku = 1;
        int p = 1;

        System.out.println("Musisz zgadywać liczby od 1 do 4.");
        randNumber = rand.nextInt(4) + 1;
        System.out.println("Podaj liczbę:");
        playerNumber = keyboard.nextInt();

        while (randNumber != playerNumber)
        {
            if (randNumber > playerNumber)
                System.out.println("Podałes za małą liczbę.");
            else
                System.out.println("Podales za duzą liczbę");

            System.out.println("Losujemy nową liczbę.");
            randNumber = rand.nextInt(4) + 1;
            System.out.println("Podaj jeszcze raz:");
            playerNumber = keyboard.nextInt();
            aku++;
        }
        System.out.println("Brawo odgadłeś liczbę za " + aku + " razem.");

         */
        /* Zgadywanie kolorów i przypisywanie punkto w petli for

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        String red, green, blue, orange, yellow;
        int playerNumber, randNumber;
        int aku = 0;

        for (int c = 1; c <= 10; c++)
        {
        System.out.println("Musisz zgadywać kolory:\nMamy dostępne:\n1-Czerwony\n2-Zielony\n3-Niebieski\n4-Pomaranczowy" +
                            "\n5-Żółty\nWybierz cyfrę przypisaną do koloru:");
        playerNumber = keyboard.nextInt();
        randNumber = rand.nextInt(5) + 1;
        if (playerNumber == randNumber)
            aku++;
        }
        System.out.println("Odgadłes kolor " + aku + " razy.");

         */
        /* Wyświetlanie kwadratu w pętli po podaniu długości boku
        Scanner keyboard = new Scanner(System.in);
        int number;
        System.out.println("Podaj liczbę całkowitą nie większa niż 15.");
        number = keyboard.nextInt();
        while (number > 15 || number < 1)
        {
            System.out.println("Podałeś złą cyfrę. Spróbuj jeszcze raz.");
            number = keyboard.nextInt();
        }
        for (int i = 1; i <= number; i++)
        {
            for (int x = 1; x <= number; x++)
            {
                System.out.print("X");
            }
            System.out.println();
        }

         */
        /* Gra w kości z akumulatorem kto wygrał
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int playerNumber, computerNumber;
        int akuPlayer = 0;
        int akuComputer = 0;

        for (int d = 1; d <= 10; d++)
        {
            computerNumber = rand.nextInt(6) + 1;
            System.out.println("Liczba komputera " + computerNumber);
            playerNumber = rand.nextInt(6) + 1;
            System.out.println("Liczba gracza " + playerNumber);
            if (computerNumber > playerNumber)
                akuComputer++;
            else if (playerNumber > computerNumber)
                akuPlayer++;
            else
                akuPlayer += 0;
        }
        if (akuComputer > akuPlayer)
            System.out.println("Grę wygrał komputer z liczbą wygranych: " + akuComputer);
        else if (akuPlayer > akuComputer)
            System.out.println("Grę wygrał gracz z liczbą wygranych: " + akuPlayer);
        else
            System.out.println("Remis");

         */
        /* Automat do gier
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int value;
        int won = 0;
        int number1, number2, number3;
        int play;

        System.out.println("To jest hazard i możesz stracić wszystko, wciśnij 0 jeśli chcesz zagrać.");
        play = keyboard.nextInt();

        while (play == 0)
        {
        System.out.println("Za jaką kwotę chcesz zagrać?");
        value = keyboard.nextInt();

        System.out.println("Automat do gier");
        System.out.println("------------------");
        System.out.println("Losujemy spośród:\nWIŚNIE | POMARAŃCZE | ŚLIWKI | DZWONKI | MELONY | BARY\n");
        number1 = rand.nextInt(6) + 1;


        switch (number1)
        {
            case 1:
                System.out.print("WIŚNIE\t");
                break;
            case 2:
                System.out.print("POMARAŃCZE\t");
                break;
            case 3:
                System.out.print("ŚLIWKI\t");
                break;
            case 4:
                System.out.print("DZWONKI\t");
                break;
            case 5:
                System.out.print("MELONY\t");
                break;
            case 6:
                System.out.print("BARY\t");
                break;
        }
        number2 = rand.nextInt(6) + 1;
        switch (number2)
        {
            case 1:
                System.out.print("\t|WIŚNIE\t");
                break;
            case 2:
                System.out.print("|\tPOMOARAŃCZE\t");
                break;
            case 3:
                System.out.print("|\tŚLIWKI\t");
                break;
            case 4:
                System.out.print("|\tDZWONKI\t");
                break;
            case 5:
                System.out.print("|\tMELONY\t");
                break;
            case 6:
                System.out.print("|\tBARY\t");
                break;
        }
        number3 = rand.nextInt(6) + 1;
        switch (number3)
        {
            case 1:
                System.out.print("|\tWIŚNIE");
                break;
            case 2:
                System.out.print("|\tPOMARAŃCZE");
                break;
            case 3:
                System.out.print("|\tŚLIWKI");
                break;
            case 4:
                System.out.print("|\tDZWONKI");
                break;
            case 5:
                System.out.print("|\tMELONY");
                break;
            case 6:
                System.out.print("|\tBARY");
                break;
        }
        if (number1 == number2)
            if (number2 == number3)
            {
             won = value * 3;
                System.out.println("\nWrzuciłes " + value + " zł.\nWygrałeś " + won + " zł.");
            } else
            {
                won = value * 2;
                System.out.println("\nWrzuciłes " + value + " zł.\nWygrałeś " + won + " zł.");
            }
        else
            System.out.println("\nPrzegrałeś.");

            System.out.println("Chcesz zagrać ponownie? Wpisz 0");
            play = keyboard.nextInt();
        }
        System.out.println("Kończymy grę, masz " + won + " zł.");

         */
    }
}