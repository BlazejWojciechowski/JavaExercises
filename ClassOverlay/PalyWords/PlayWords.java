package Zadania.KlasyNakładkowe;

public class PlayWords
{


    public static int wordCount(String words)
    {
        String[] numWords = words.split(" ");
        int accu = 0;

        for (String s : numWords)
        {
            accu++;
        }
        return accu;
    }

    public static StringBuilder arrayToString(char[] ch)
    {
        StringBuilder strb = new StringBuilder();

        for (char c : ch)
        {
            strb.append(c);
        }

        return strb;
    }

    public static char mostFrequent(String str)
    {
        char mark = 'a';
        char lookUp;
        int highest = 0;


        for (int row = 0; row < str.length(); row++)
        {
            int accu = 0;
            int col;
            lookUp = str.charAt(row);

            for (col = 0; col < str.length(); col++)
            {
                if (lookUp == str.charAt(col))
                {
                    accu++;
                }
            }
            if (accu > highest)
            {
                highest = accu;
                mark = str.charAt(row);
            }
        }


        return mark;
    }
    public static StringBuilder replaceSubstring(StringBuilder s1, String s2, String s3)
    {
        int position;

        position = s1.indexOf(s2);

        while (position != -1)
        {
            s1.replace(position, (position + s2.length()), s3);
            position = s1.indexOf(s2, position + 1);
        }

        return s1;
    }
}
