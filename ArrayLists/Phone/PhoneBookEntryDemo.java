package Zadania.KlasyTabliceArrayList;

import java.util.ArrayList;

public class PhoneBookEntryDemo {
    public static void main(String[] args) {
        ArrayList<String> lastName = new ArrayList<>(5);
        ArrayList<Integer> phoneNumber = new ArrayList<>(5);

        PhoneBookEntry phoncalls = new PhoneBookEntry(lastName, phoneNumber);

        phoncalls.setLastName();
        phoncalls.setPhoneNumber();
        phoncalls.showValues();
    }
}