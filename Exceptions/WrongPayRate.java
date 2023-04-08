package Zadania.Wyjątki;

public class WrongPayRate extends Exception {
    public WrongPayRate() {
        super("Została podana niepoprawna stawka godzinowa");
    }
}
