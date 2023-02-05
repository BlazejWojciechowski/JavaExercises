package Zadania.Proste;

import java.util.Scanner;

public class ZadProgramistyczneRozdzial3
{
    public static void main(String[] args) {

        
        /*
        Scanner keyboard = new Scanner(System.in);
        int day, month, year;
        System.out.println("Ten program oblicza magiczną date!\nJeśli iloczyn dnia i miesiaca daje rok :)");
        System.out.println("Podaj dzień miesiąca");
        day = keyboard.nextInt();
        System.out.println("Podaj miesiąc");
        month = keyboard.nextInt();
        System.out.println("Podaj rok");
        year = keyboard.nextInt();

        if (year == day * month)
        {
            System.out.println("To jest magiczna data");
        }
        else
            System.out.println("Zwykła data");

         */

        /*
        Scanner keyboard = new Scanner(System.in);

        double weight, height;
        double BMI;

        System.out.println("Ten program oblicza Twoje BMI :)");

        System.out.println("Podaj wage:");
        weight = keyboard.nextDouble();

        System.out.println("Podaj wzrost:");
        height = keyboard.nextDouble();

        BMI = weight / (height * height);

       if (BMI >= 18.5 && BMI <= 25)
           System.out.printf("Twoje BMI to %.2f " +  " i jest optymalne." , BMI);
       else if (BMI < 18.5)
           System.out.printf("Twoje BMI to %.2f " + " i masz niedowagę." , BMI);
       else if (BMI > 25)
           System.out.printf("Twoje BMI to %.2f " + " i masz nadwagę." , BMI);

         */

        /*
        Scanner keyboard = new Scanner(System.in);

        int score1, score2, score3;
        double avgScore;

        System.out.println("Ten program oblicza średnią 3 ocen:");

        System.out.println("Podaj wynik pierwszego testu:");
        score1 = keyboard.nextInt();

        System.out.println("Podaj wynik drugiego testu:");
        score2 = keyboard.nextInt();

        System.out.println("Podaj wynik trzeciego testu:");
        score3 = keyboard.nextInt();

        avgScore = (double)(score1 + score2 + score3) / 3;

        if (avgScore >= 90 && avgScore <= 100)
            System.out.printf("Twoja Średnia: %.2f " + " czyli Piątka :)" , avgScore);
        else if (avgScore >= 80 && avgScore <= 100)
            System.out.printf("Twoja Średnia: %.2f " + " czyli Czwórka ^.^" , avgScore);
        else if (avgScore >= 70 && avgScore <= 100)
            System.out.printf("Twoja Średnia: %.2f " + " czyli Trójka ;]" , avgScore);
        else if (avgScore >= 60 && avgScore <= 100)
            System.out.printf("Twoja Średnia: %.2f " + " czyli Dwója :/" , avgScore);
        else if (avgScore < 60 && avgScore <= 100)
            System.out.printf("Twoja Średnia: %.2f " + " czyli Jedynka :(" , avgScore);
        else
            System.out.println("Niepoprawna średnia -.-");

         */
        /*
        Scanner keyboard = new Scanner(System.in);
        double mass;
        double weight;

        System.out.println("Ten program oblicza ciężar w Niutonach.");
        System.out.println("Podaj masę:");
        mass = keyboard.nextDouble();

        weight = mass * 9.8;

        if (weight >= 10 && weight <= 1000)
            System.out.printf("Ciężar w niutonach to %.2f" , weight);
        else if (weight > 1000)
            System.out.println("Obiekt za ciężki.");
        else if (weight < 10)
            System.out.println("Obiekt za lekki.");

         */
        /*
        Scanner keyboard = new Scanner(System.in);

        double seconds, minutes, hours, days;

        System.out.println("Ten program oblicza czas w sekundach przeliczając na minuty, godziny lub dni:");
        System.out.println("Wpisz liczbę sekund.");
        seconds = keyboard.nextDouble();

        minutes = seconds / 60;
        hours = seconds / 3600;
        days = seconds / 86400;

        if (seconds <= 60)
            System.out.println("Czas to " + seconds + " sekund.");
        else if (seconds > 60 && seconds <= 3600)
            System.out.printf("Czas to %.2f minut czyli %,.1f sekund" , minutes, seconds);
        else if (seconds > 3600 && seconds <= 86400)
            System.out.printf("Czas to %.2f godzin czyli %,.1f sekund" , hours , seconds);
        else if (seconds > 86400)
            System.out.printf("Czas to %.2f dni czyli %,.1f sekund" , days , seconds);

         */
        /*

        Scanner keyboard = new Scanner(System.in);

        double quantity;
        double rabat;
        double kwotaRabatu;
        double kwotaZakupu;

        System.out.println("Ten program oblicza rabat:");
        System.out.println("Podaj liczbę zakupionych sztuk:");
        quantity = keyboard.nextDouble();
        System.out.println("Podaj kwotę zakupu:");
        kwotaZakupu = keyboard.nextDouble();

        if (quantity >= 10 && quantity < 20)
        {
            rabat = 0.2;
            kwotaRabatu = kwotaZakupu * rabat;
            kwotaZakupu -= kwotaRabatu;
            System.out.println("Twoj rabat to 20%, kwota rabatu to: " + kwotaRabatu +
                                "\nZakupy wyszły w sumie: " + kwotaZakupu + ".");
        }
        else if (quantity >= 20 && quantity < 50)
        {
            rabat = 0.3;
            kwotaRabatu = kwotaZakupu * rabat;
            kwotaZakupu -= kwotaRabatu;
            System.out.println("Twoj rabat to 30%, kwota rabatu to: " + kwotaRabatu +
                    "\nZakupy wyszły w sumie: " + kwotaZakupu + ".");
        }
        else if (quantity >= 50 && quantity < 100)
        {
            rabat = 0.4;
            kwotaRabatu = kwotaZakupu * rabat;
            kwotaZakupu -= kwotaRabatu;
            System.out.println("Twoj rabat to 40%, kwota rabatu to: " + kwotaRabatu +
                    "\nZakupy wyszły w sumie: " + kwotaZakupu + ".");
        }
        else if (quantity >= 100)
        {
            rabat = 0.5;
            kwotaRabatu = kwotaZakupu * rabat;
            kwotaZakupu -= kwotaRabatu;
            System.out.println("Twoj rabat to 50%, kwota rabatu to: " + kwotaRabatu +
                    "\nZakupy wyszły w sumie: " + kwotaZakupu + ".");
        }
        else
            System.out.println("Kwota zakupów to : " + kwotaZakupu + " , ilość zakupionych sztuk "
                                + quantity + "\nNie ma rabatu.");

         */
        /*

        Scanner keyboard = new Scanner(System.in);

        double km;
        double kg;
        double value;
        double transport;

        System.out.println("Ten program oblicza koszt dostawy:");

        System.out.println("Podaj wagę przesyłki w kilogramach:");
        kg = keyboard.nextDouble();

        System.out.println("Podaj odległość transportu w km:");
        km = keyboard.nextDouble();

        if (kg <= 1)
        {
            value = 1.1;
            transport = km * value;
            System.out.println("Cena za transport to: " + transport);
        }
        else if (kg <= 3)
        {
            value = 2.2;
            transport = km * value;
            System.out.println("Cena za transport to: " + transport);
        }
        else if (kg <= 5)
        {
            value = 3.7;
            transport = km * value;
            System.out.println("Cena za transport to: " + transport);
        }
        else if (kg > 5)
        {
            value = 3.80;
            transport = km * value;
            System.out.println("Cena za transport to: " + transport);
        }
        else
            System.out.println("Coś poszło nie tak.");

         */
        /*

        Scanner keyboard = new Scanner(System.in);
        double fat, calories, fatCalories, percCalories;

        System.out.println("Program oblicza zawartość tłuszczów w produkcie:");
        System.out.println("Podaj liczbę kalorii w produkcie:");
        calories = keyboard.nextDouble();
        System.out.println("Podaj liczbę tłuszczów w produkcie");
        fat = keyboard.nextDouble();

        fatCalories = fat * 9;
        percCalories = (fatCalories / calories) * 100;

        if (percCalories < 30)
        {
            System.out.printf("Procent tłuszczu w produkcie to: %.1f procent." +
                              "\nKalorii w produkcie z tłuszczy to: %.1f kalorii." +
                              "\nProdukt jest niskotłuszczowy" , percCalories , fatCalories);
        }
        else if (percCalories >=30 && percCalories < 100)
        {
            System.out.printf("Procent tłuszczu w produkcie to: %.1f procent." +
                    "\nKalorii w produkcie z tłuszczy to: %.1f kalorii." +
                    "\nProdukt jest wysokotłuszczowy." , percCalories , fatCalories);
        }
        else if (calories < fatCalories)
            System.out.println("Dane wejściowe są nieprawidłowe");

         */
        /*
        Scanner keyboard = new Scanner(System.in);
        String input;
        double distance, time;
        System.out.println("Program oblicza ogległość do pokonania przez fale dźwiękową:");
        System.out.println("Podaj: woda, powietrze lub stal:");
        input = keyboard.nextLine();
        System.out.println("Jaką odległosć ma przebyć w metrach:");
        distance = keyboard.nextDouble();

        if (input.equals("woda"))
        {
            time = distance / 343;
            System.out.printf("%,.2f metrów pokonano w wodzie przez %,.2f sekund." , distance , time);
        }
        else if (input.equals("powietrze"))
        {
            time = distance / 1490;
            System.out.printf("%,.2f metrów pokonano w powietrzu przez %,.2f sekund." , distance , time);
        }
        else if (input.equals("stal"))
        {
            time = distance / 5100;
            System.out.printf("%,.2f metrów pokonano w stali przez %,.2f sekund." , distance , time);
        }
        else
            System.out.println("Niepoprawne dane wejściowe.");

         */
        /*
        Scanner keyboard = new Scanner(System.in);
        String input;
        int minutes;

        System.out.println("Program wyświetla dostępne pakiety:");
        System.out.println("Wybierz Pakiet A, B lub C:");
        input = keyboard.nextLine();
        System.out.println("Wpisz liczbę minut jaką potrzebujesz: ");
        minutes = keyboard.nextInt();

        if (input.equalsIgnoreCase("A") && minutes <= 450)
            System.out.println("Cena to 39,99 złotego miesięcznie, w tym 450 darmowych minut." +
                    "\nKażda następna minuta kosztuje 0,45 złotego.");
        else if (input.equalsIgnoreCase("B") && minutes <= 900)
            System.out.println("Cena to 59,99 złotego miesięcznie, w tym 900 darmowych minut." +
                    "\nKażda następna minuta kosztuje 0,40 złotego.");
        else if (input.equalsIgnoreCase("C") && minutes > 900)
            System.out.println("Cena to 69,99 złotego miesięcznie, w nielimitowane rozmowy.");
        else
            System.out.println("Niepoprawne dane wejściowe.");

         */
        /*
        Scanner keyboard = new Scanner(System.in);
        double check, bill;
        System.out.println("Program oblicza dodatkowe opłaty w postaci czeków firmowych:");
        System.out.println("Proszę podaj liczbę czeków wypisanych w tym miesiącu:");
        check = keyboard.nextDouble();

        if (check < 20 && check >= 0)
        {
            bill = (check * 0.1) + 10;
            System.out.printf("W tym miesiącu opłaty pobrane przez bank to %.1f złotych" , bill);
        }
        else if (check >= 20 && check < 40)
        {
            bill = (check * 0.08) + 10;
            System.out.printf("W tym miesiącu opłaty pobrane przez bank to %.1f złotych" , bill);
        }
        else if (check >= 40 && check < 60)
        {
            bill = (check * 0.06) + 10;
            System.out.printf("W tym miesiącu opłaty pobrane przez bank to %.1f złotych" , bill);
        }
        else if (check >= 60)
        {
            bill = (check * 0.04) + 10;
            System.out.printf("W tym miesiącu opłaty pobrane przez bank to %.1f złotych" , bill);
        }
        else
            System.out.println("Niepoprawne dane wejściowe.");

         */
        /*
        Scanner keyboard = new Scanner(System.in);
        int books;
        System.out.println("Program przyznaje liczbę punktów za zakupione książki.");
        System.out.println("Podaj liczbę zakupionych książek:");
        books = keyboard.nextInt();

        if (books == 0)
            System.out.println("Przyznano 0 punktów");
        else if (books == 1)
        {
            System.out.println("Przyznano 5 punktów");
        }
        else if (books == 2)
        {
            System.out.println("Przyznano 15 punktów");
        }
        else if (books == 3)
        {
            System.out.println("Przyznano 30 punktów");
        }
        else if (books >= 4)
        {
            System.out.println("Przyznano 60 punktów");
        }
        else
            System.out.println("Niepoprawne dane wejściowe.");

         */
        /*
        Scanner keyboard = new Scanner(System.in);
        String input;
        System.out.println("Diagnostyka rozwiązywania problemów z routerem.\n" +
                            "Czy działa Ci router? Tak lub nie ");
        input = keyboard.nextLine();

        if (input.equalsIgnoreCase("nie"))
        {
            System.out.println("Uruchom ponownie komputer i spróbuj nawiązać połaczenie.");
            System.out.println("Czy to rozwiązało problem?");
            input = keyboard.nextLine();
        }
        if (input.equalsIgnoreCase("nie"))
        {
            System.out.println("Uruchom ponownie router i spróbuj nawiązać połaczenie.");
            System.out.println("Czy to rozwiązało problem?");
            input = keyboard.nextLine();
        }
        if (input.equalsIgnoreCase("nie"))
        {
            System.out.println("Upewnij się, że kable prowadzące do routera i modemu są" +
                                "dobrze zamocowane.");
            System.out.println("Czy to rozwiązało problem?");
            input = keyboard.nextLine();
        }
        if (input.equalsIgnoreCase("nie"))
        {
            System.out.println("Przenieś router w inne miejsce.");
            System.out.println("Czy to rozwiązało problem?");
            input = keyboard.nextLine();
        }
        if (input.equalsIgnoreCase("nie"))
        {
            System.out.println("Kup nowy router.");
        }
        else if (input.equalsIgnoreCase("tak"))
            System.out.println("Cieszymy się że router działa.");

         */
        /*
        Scanner keyboard = new Scanner(System.in);
        String dietWEGE, dietWEGA, dietGLU;
        System.out.println("Program wybiera restauracje.");

        System.out.println("Czy ktoraś z osób jest na diecie wegetariańskiej?");
        dietWEGE = keyboard.nextLine();

        System.out.println("Czy ktoraś z osób jest na diecie wegańskiej?");
        dietWEGA = keyboard.nextLine();

        System.out.println("Czy ktoraś z osób jest na diecie bezglutenowej?");
        dietGLU = keyboard.nextLine();

        if (dietWEGE.equalsIgnoreCase("tak"))
            if (dietWEGA.equalsIgnoreCase("tak"))
                if (dietGLU.equalsIgnoreCase("tak"))
                    System.out.println("Tutaj możecie zjeść:\nKawiarnia na Rogu.\nKuchnia u Szefa.");
        if (dietWEGE.equalsIgnoreCase("tak"))
            if (dietWEGA.equalsIgnoreCase("tak"))
                if (dietGLU.equalsIgnoreCase("nie"))
                    System.out.println("Tutaj możecie zjeść:\nKawiarnia na Rogu.\nKuchnia u Szefa.");
        if (dietWEGE.equalsIgnoreCase("tak"))
            if (dietWEGA.equalsIgnoreCase("nie"))
                if (dietGLU.equalsIgnoreCase("tak"))
                    System.out.println("Tutaj możecie zjeść:\nPizzeria przy Dworcowej\nKawiarnia na Rogu.\nKuchnia u Szefa.");
        if (dietWEGE.equalsIgnoreCase("nie"))
            if (dietWEGA.equalsIgnoreCase("tak"))
                if (dietGLU.equalsIgnoreCase("tak"))
                    System.out.println("Tutaj możecie zjeść:\nKawiarnia na Rogu.\nKuchnia u Szefa.");
        if (dietWEGE.equalsIgnoreCase("nie"))
            if (dietWEGA.equalsIgnoreCase("nie"))
                if (dietGLU.equalsIgnoreCase("tak"))
                    System.out.println("Tutaj możecie zjeść:\nKawiarnia na Rogu.\nKuchnia u Szefa.");
        if (dietWEGE.equalsIgnoreCase("nie"))
            if (dietWEGA.equalsIgnoreCase("tak"))
                if (dietGLU.equalsIgnoreCase("nie"))
                    System.out.println("Tutaj możecie zjeść:\nKawiarnia na Rogu.\nKuchnia u Szefa.");
        if (dietWEGE.equalsIgnoreCase("nie"))
            if (dietWEGA.equalsIgnoreCase("nie"))
                if (dietGLU.equalsIgnoreCase("nie"))
                    System.out.println("Tutaj możecie zjeść:\nPizzeria przy Dworcowej\nKawiarnia na Rogu.\nKuchnia u Szefa."
                                        + "\nLuksusowe Burgery u jarka.\nWłoskie Specjały.");

         */

    }
}
