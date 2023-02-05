package Zadania.Wyjątki;

public class WrongID extends IllegalArgumentException
{
    public WrongID()
    {
        super("Niepoprawne ID");
    }
}
