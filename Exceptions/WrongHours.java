package Zadania.Wyjątki;

public class WrongHours extends IllegalArgumentException
{
    public WrongHours()
    {
        super("Niepoprawna liczba godzin");
    }
}
