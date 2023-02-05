package Zadania.KlasyKonstruktory;

public class MyFamily
{
    private String personalName;
    private String adress;
    private int age;
    private int phone;

    public MyFamily (String name, String adr, int ag, int pho)
    {
        personalName = name;
        adress = adr;
        age = ag;
        phone = pho;
    }

    public void setPersonalName(String nam)
    {
        personalName = nam;
    }

    public void setAdress (String ad)
    {
        adress = ad;
    }

    public void setAge (int a)
    {
        age = a;
    }

    public void setPhone (int ph)
    {
        phone = ph;
    }

    public String getPersonalName()
    {
        return personalName;
    }

    public String getAdress()
    {
        return adress;
    }

    public int getAge()
    {
        return age;
    }

    public int getPhone()
    {
        return phone;
    }
}
