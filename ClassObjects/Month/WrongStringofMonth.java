package Zadania.Wyjątki;

public class WrongStringofMonth extends IllegalArgumentException {
    public WrongStringofMonth(String month) {
        super("Niepoprawna nazwa miesiąca: " + month);
    }
}
