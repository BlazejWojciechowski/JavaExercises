package Zadania.KlasyNakładkowe;

public class Telephone
{
    public final static int FORMATTED = 11;
    public final static int UNFORMATTED = 9;

    public static boolean isFormatted(String str)
    {
        boolean valid;

        if (str.length() == FORMATTED && str.charAt(3) == '-' && str.charAt(7) == '-')
            valid = true;
        else
            valid = false;

        return valid;
    }
    public static String unformat(String str)
    {
        StringBuilder strb = new StringBuilder(str);

        if (isFormatted(str))
        {
            strb.deleteCharAt(3);
            strb.deleteCharAt(6);
        }

        return strb.toString();
    }

    public static String format(String str)
    {
        StringBuilder strb = new StringBuilder(str);

        if (str.length() == UNFORMATTED)
        {
            strb.insert(3, '-');
            strb.insert(7, '-');
        }

        return strb.toString();
    }

    public static String change(String str)
    {
        StringBuilder strb = new StringBuilder(str);
        char ch;
        for (int row = 3; row < str.length(); row++)
        {
            ch = str.charAt(row);

            if (ch == 'A' || ch == 'B' || ch == 'C')
                strb.setCharAt(row, '2');
            else if (ch == 'D' || ch == 'E' || ch == 'F')
                strb.setCharAt(row, '3');
            else if (ch == 'G' || ch == 'H' || ch == 'I')
                strb.setCharAt(row, '4');
            else if (ch == 'J' || ch == 'K' || ch == 'L')
                strb.setCharAt(row, '5');
            else if (ch == 'M' || ch == 'N' || ch == 'O')
                strb.setCharAt(row, '6');
            else if (ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S')
                strb.setCharAt(row, '7');
            else if (ch == 'T' || ch == 'U' || ch == 'V')
                strb.setCharAt(row, '8');
            else if (ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z')
                strb.setCharAt(row, '9');
        }

        return  strb.toString();
    }
}
