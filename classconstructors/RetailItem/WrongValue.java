package Zadania.Wyjątki;

public class WrongValue extends Exception {
    public WrongValue(double price) {
        super("Ujemna wartość ceny: " + price);
    }
}
