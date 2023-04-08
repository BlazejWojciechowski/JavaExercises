package Zadania.KlasyObiekty;

import Zadania.Wyjątki.WrongStringofMonth;
import Zadania.Wyjątki.WrongValueofMonth;

public class Month {
    private int monthNumber;
    public Month() {
        monthNumber = 1;
    }
    public Month(int monthNumber) throws WrongValueofMonth {

        if (monthNumber > 12 || monthNumber < 1)
            throw new WrongValueofMonth(monthNumber);
        else
            this.monthNumber = monthNumber;
    }
    public Month(String month) {
        switch (month) {
            case "Styczeń":
                this.monthNumber = 1;
                break;
            case "Luty":
                this.monthNumber = 2;
                break;
            case "Marzec":
                this.monthNumber = 3;
                break;
            case "Kwiecień":
                this.monthNumber = 4;
                break;
            case "Maj":
                this.monthNumber = 5;
                break;
            case "Czerwiec":
                this.monthNumber = 6;
                break;
            case "Lipiec":
                this.monthNumber = 7;
                break;
            case "Sierpień":
                this.monthNumber = 8;
                break;
            case "Wrzesień":
                this.monthNumber = 9;
                break;
            case "Październik":
                this.monthNumber = 10;
                break;
            case "Listopad":
                this.monthNumber = 11;
                break;
            case "Grudzień":
                this.monthNumber = 12;
                break;
            default:
                throw new WrongStringofMonth(month);
        }
    }
    public void setMonthNumber(int month) {

        if (month > 12 || month < 1)
            this.monthNumber = 1;
        else
            this.monthNumber = month;
    }
    public int getMonthNumber() {
        return monthNumber;
    }
    public String getMonthName() {
        String monthName = "";

        switch (monthNumber) {
            case 1:
                monthName = "Styczeń";
                break;
            case 2:
                monthName = "Luty";
                break;
            case 3:
                monthName = "Marzec";
                break;
            case 4:
                monthName = "Kwiecień";
                break;
            case 5:
                monthName = "Maj";
                break;
            case 6:
                monthName = "Czerwiec";
                break;
            case 7:
                monthName = "Lipiec";
                break;
            case 8:
                monthName = "Sierpień";
                break;
            case 9:
                monthName = "Wrzesień";
                break;
            case 10:
                monthName = "Październik";
                break;
            case 11:
                monthName = "Listopad";
                break;
            case 12:
                monthName = "Grudzień";
                break;
        }
        return monthName;
    }
    public String toString() {
        String str;
        str = getMonthName();
        return str;
    }
    public boolean equals(Month object2) {
        boolean status;

        if (this.monthNumber == object2.monthNumber)
            status = true;
        else
            status = false;

        return status;
    }
    public boolean graterThan(Month object2) {
        boolean status;

        if (this.monthNumber > object2.monthNumber)
            status = true;
        else
            status = false;

        return status;
    }
    public boolean lessThan(Month object2) {
        boolean status;

        if (this.monthNumber < object2.monthNumber)
            status = true;
        else
            status = false;

        return status;
    }
}
