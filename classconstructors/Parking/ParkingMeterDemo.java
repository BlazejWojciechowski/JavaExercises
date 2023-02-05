package Zadania.KlasyKonstruktory;

import javax.swing.*;

public class ParkingMeterDemo
{
    public static void main(String[] args)
    {
        String input, make, model, color, officerName, str;
        int registration, parkedMinutes, boughtMinutes, ofifcerID;
        int cash;

        make = JOptionPane.showInputDialog("Podaj markę samochodu");
        model = JOptionPane.showInputDialog("Podaj model samochodu");
        color = JOptionPane.showInputDialog("Podaj kolor samochodu");

        input = JOptionPane.showInputDialog("Podaj rejestrację auta");
        registration = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Podaj liczbę minut zaparkowanego auta");
        parkedMinutes = Integer.parseInt(input);

        ParkedCar car = new ParkedCar(make, model, color, registration, parkedMinutes);

        input = JOptionPane.showInputDialog("Podaj liczbę wykupionych minut");
        boughtMinutes = Integer.parseInt(input);

        ParkingMeter meter = new ParkingMeter(boughtMinutes);

        officerName = JOptionPane.showInputDialog("Podaj nazwisko oficera");
        input = JOptionPane.showInputDialog("Podaj ID oficera");
        ofifcerID = Integer.parseInt(input);

        PoliceOfficer police = new PoliceOfficer(officerName, ofifcerID);

        ParkingTicket ticket = new ParkingTicket(car, meter, police);

        cash = ticket.getTicket(parkedMinutes, boughtMinutes);

        if (cash >= 50)
        {
            str = ticket.toString();
            JOptionPane.showMessageDialog(null, str);
        }
        else
            JOptionPane.showMessageDialog(null, "Nie ma żadnego mandatu.");


    }
}
