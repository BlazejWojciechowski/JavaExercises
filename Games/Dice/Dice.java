package Game.Dice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Dice {
    private final int NUM_Dice = 5;
    private ArrayList<Integer> numbers = new ArrayList<>(NUM_Dice);

    public Dice() {
        Random rand = new Random();
        int value;

        for (int i = 0; i < NUM_Dice; i++) {
            value = rand.nextInt(6) + 1;
            this.numbers.add(i, value);
        }
    }
    public Dice(int rollCount) {
        Random rand = new Random();
        int value;

        for (int i = 0; i < rollCount; i++) {
            value = rand.nextInt(6) + 1;
            this.numbers.set(i, value);
        }
    }
    public void setNumbers(int qua) {
        Random rand = new Random();
        String input;
        int value, index;

        for (int i = 0; i < qua; i++) {
            do {
                input = JOptionPane.showInputDialog("Którą kostką chcesz rzucić ponownie? Wybierz od 1 do 5");
                index = Integer.parseInt(input);
            }
            while (index > 5 || index < 1);
            value = rand.nextInt(6) + 1;
            this.numbers.set((index - 1), value);
        }
    }
    public void checkCount(int num) {
        if (num == 5)
            new Dice(num);
        else
            setNumbers(num);
    }
    public int moreThrows() {
        String input;
        int qua;
        input = JOptionPane.showInputDialog("Iloma kostkami chcesz rzucić ponownie?");
        qua = Integer.parseInt(input);

        while (qua > 5 || qua < 0) {
            input = JOptionPane.showInputDialog("Podaj wartość od 0 do 5!");
            qua = Integer.parseInt(input);
        }
        if (qua != 0)
            checkCount(qua);

        return qua;
    }
    public void getNumber() {
        System.out.println("Aktualne wartości:");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i) + " ");
        }
    }
    public int theSame() {
        int highest = 0;
        int digit = 0;
        int points;

        for (int i = 0; i < numbers.size() - 1; i++) {
            int theSame = 0;
            int num = numbers.get(i);
            for (int j = (i + 1); j < numbers.size(); j++) {
                if (num == numbers.get(j))
                    theSame += 1;
            }
            if (highest < theSame) {
                highest = theSame;
                digit = num;
            }
        }
        points = pointsGame(highest, digit);
        return points;
    }
    public int pointsGame(int num, int digit) {
        int points;
        if (num == 4)
            points = digit * 2;
        else if (num == 3)
            points = digit;
        else if (num == 2)
            points = 0;
        else if (num == 1)
            points = digit * -1;
        else
            points = digit * -2;

        return points;
    }
}
