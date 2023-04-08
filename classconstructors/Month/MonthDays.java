package Zadania.KlasyKonstruktory;

public class MonthDays {
    private int monthday;
    public int years;
    public MonthDays(int month, int year) {
     monthday = month;
     years = year;
    }
    public void setMonthday(int mon) {
        monthday = mon;
    }
    public void setYear(int ye) {
        years = ye;
    }
    public int getMonthday() {
        return monthday;
    }
    public int getYears() {
        return years;
    }
}
