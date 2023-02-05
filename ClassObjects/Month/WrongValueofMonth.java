package Zadania.Wyjątki;

public class WrongValueofMonth extends IllegalArgumentException
{
    public WrongValueofMonth(int month)
    {
        super("Nie ma takiego miesiąca: " + month);
    }
}
