package Zadania.KlasyDziedziczenie;

import javax.swing.*;
import java.util.Random;

public class ClientDemo
{
    public static void main(String[] args)
    {
        final int NUM_ClIENTS = 6;
        String name, address, phone, input;
        double valueofPurchases = 0;
        boolean status;
        String answer;
        Random rand = new Random();
        StringBuilder clientNumber = new StringBuilder();
        int value;

        name = JOptionPane.showInputDialog("Podaj swoje nazwisko...");
        address = JOptionPane.showInputDialog("Podaj swój adres...");
        phone = JOptionPane.showInputDialog("Podaj swój numer telefonu");
        input = JOptionPane.showInputDialog("Czy chcesz otrzymywać od nas mailing? Wpisz tak lub nie, bez względu na " +
                                            "wielkość znaków...");
        if (input.equalsIgnoreCase("tak"))
            status = true;
        else
            status = false;

        for (int index = 0; index < NUM_ClIENTS; index++)
        {
            value = rand.nextInt(10);
            clientNumber.append(value);
        }

        do
        {
            input = JOptionPane.showInputDialog("Za ile zrobiłeś zakupy?");
            valueofPurchases += Double.parseDouble(input);
            answer = JOptionPane.showInputDialog("Chcesz kontynuować zakupy? Wpisz tak lub nie,  bez względu na " +
                                                "wielkość znaków...");
        }
        while (answer.equalsIgnoreCase("tak"));

        PreferredCustomer client1 = new PreferredCustomer(name, address, phone, clientNumber, status);

        client1.setValueofPurchases(valueofPurchases);
        client1.setBonusLevel();

        JOptionPane.showMessageDialog(null, client1.getString() + "\nŁączna wartość zakupów" +
                                    " wyniosła " + client1.getValueofPurchases() + "\nAktualnie przysługuje rabat " +
                                    " na wszystkie prodkuty w wysokości " + client1.getBonusLevel() + "%.");
    }
}
