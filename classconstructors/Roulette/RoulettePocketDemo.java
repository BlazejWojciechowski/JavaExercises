package Zadania.KlasyKonstruktory;

import java.util.Scanner;

public class RoulettePocketDemo {
    public static void main(String[] args) {
        String input;
        int number;
        String pocketColor;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj numer przedziału:");
        number = keyboard.nextInt();

        RoulettePocket rp = new RoulettePocket(number);
        pocketColor = rp.getPocketColor(number);
        System.out.println("Kolor w podanym przedziale to: " + pocketColor);
    }
}
