package Zadania.KlasyKonstruktory;

public class Patient
{
    private String fullName;
    private String fullAdress;
    private int phoneN;
    private String contactPers;

    public Patient(String name, String adress, int phone, String contact)
    {
        fullName = name;
        fullAdress = adress;
        phoneN = phone;
        contactPers = contact;
    }

    public void setFullName(String nam)
    {
        fullName = nam;
    }
    public void setFullAdress(String adre)
    {
        fullAdress = adre;
    }
    public void setPhoneN(int phon)
    {
        phoneN = phon;
    }
    public void setContactPers(String contac)
    {
        contactPers = contac;
    }
    public String getFullName()
    {
        return fullName;
    }
    public String getFullAdress()
    {
        return fullAdress;
    }
    public int getPhoneN()
    {
        return phoneN;
    }
    public String getContactPers()
    {
        return contactPers;
    }
}
