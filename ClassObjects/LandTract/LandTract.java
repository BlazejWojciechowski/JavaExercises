package Zadania.KlasyObiekty;

public class LandTract {
    private double length;
    private double width;
    public LandTract (double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public boolean equals(LandTract object2) {
        boolean status;

        if (getArea() == object2.getArea())
            status = true;
        else
            status = false;

        return status;
    }
    public String toString(LandTract object2) {
        String str;
        str = "Powierzchnia działki numer 1 \t" + getArea() + " metrów kwadratowych" +
                "\nPowierzchnia działki numer 2 \t" + object2.getArea() + " metrów kwadratowych";

        return str;
    }
}
