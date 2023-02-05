package Zadania.KlasyKonstruktory;

import java.util.Locale;

public class Employee
{
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee (String nam, int num, String dep, String pos)
    {
     name = nam;
     idNumber = num;
     department = dep;
     position = pos;
    }

    public Employee (String na, int nu)
    {
        department = "";
        position = "";
    }
    public Employee()
    {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    public void setName (String sName)
    {
        name = sName;
    }

    public void setIdNumber (int sidNumber)
    {
        idNumber = sidNumber;
    }

    public void setDepartment (String sDep)
    {
        department = sDep;
    }

    public void setPosition (String sPos)
    {
        position = sPos;
    }

    public String getName()
    {
        return name;
    }

    public int getIdNumber ()
    {
        return idNumber;
    }

    public String getDepartment()
    {
        return department;
    }

    public String getPosition()
    {
        return position;
    }
}
