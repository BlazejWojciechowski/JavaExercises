package Zadania.KlasyDziedziczenie;

public class Customer extends Person
{
    private StringBuilder clientNumber;
    private boolean status;

    public Customer(){}

    public Customer(String name, String address, String phone, StringBuilder clientNumber, boolean status)
    {
        super(name, address, phone);
        this.clientNumber = clientNumber;
        this.status = status;
    }
    public void setClientNumber(StringBuilder clientNumber)
    {
        this.clientNumber = clientNumber;
    }
    public void setStatus(boolean status)
    {
        this.status = status;
    }
    public StringBuilder getClientNumber()
    {
        return clientNumber;
    }
    public boolean getStatus()
    {
        return status;
    }
    public StringBuilder getString()
    {
        String personInfo;
        personInfo = toString();

        String access;
        StringBuilder str;

        if (status)
            access = "Klient znajduje się na liście mailingowej";
        else
            access = "Klient nie wyraził zgody na liste mailingową";

        str = new StringBuilder(personInfo + "\nNumer klienta: " + clientNumber + "\n" + access);

        return str;
    }
}
