package Zadania.KlasyTabliceArrayList;

import javax.swing.*;
import java.util.ArrayList;

public class PhoneBookEntry {
    private final ArrayList<String> lastName;
    private final ArrayList<Integer> phoneNumber;

    public PhoneBookEntry(ArrayList<String> lastNa, ArrayList<Integer> phoneNu) {
        lastName = lastNa;
        phoneNumber = phoneNu;
    }

    public void setLastName() {
        String input;
        final int end = 5;

        for (int index = 0; index < end; index++) {
            input = JOptionPane.showInputDialog("Wprowadź nazwisko numer " + (index + 1));
            lastName.add(input);
        }
    }

    public void setPhoneNumber() {
        String input;
        final int end = 5;
        int phone;

        for (int index = 0; index < end; index++) {
            input = JOptionPane.showInputDialog("Wprowadź numer telefonu osoby numer " + (index + 1));
            phone = Integer.parseInt(input);
            phoneNumber.add(phone);
        }
    }

    public void showValues() {
        for (int index = 0; index < lastName.size(); index++) {
            System.out.println(lastName.get(index) + " " + phoneNumber.get(index));
        }
    }
}
