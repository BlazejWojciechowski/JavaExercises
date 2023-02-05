package Zadania.KlasyKonstruktory;

public class ParkingTicket
{
    private String make;
    private String model;
    private String color;
    private int registration;
    private int parkedMinutes;
    private int boughtMinutes;
    private String officerName;
    private int officerID;

    public ParkingTicket(ParkedCar object1, ParkingMeter object2, PoliceOfficer object3)
    {
        this.make = object1.getMake();
        this.model = object1.getModel();
        this.color = object1.getColor();
        this.registration = object1.getRegistration();
        this.parkedMinutes = object1.getParkedMinutes();
        this.boughtMinutes = object2.getBoughtMinutes();
        this.officerName = object3.getOfficerName();
        this.officerID = object3.getOfficerID();
    }
    public int getTicket(int parkedMinutes, int boughtMinutes)
    {
        int minutes = 60;
        int value = 0;
        boolean status;

        if (parkedMinutes > boughtMinutes)
        {
            status = true;
            value = 50;
        }
        else
            status = false;

        while (!status)
        {
            if (parkedMinutes > minutes)
            {
                status = true;
                value += 20;
                minutes += 60;
            }
        }

        return value;
    }
    public String toString()
    {
        String str;

        str = "MANDAT\nMarka: " + make + "\nModel: " + model + "\nKolor: " + color + "\nRejestracja " + registration +
                "\nWysokość mandatu: " + getTicket(parkedMinutes, boughtMinutes) + "\nNazwisko oficera " + officerName +
                "\nID oficera " + officerID;

        return str;
    }
}
