package Zadania.KlasyNakładkowe;

public class Letters
{
    private int vowels;
    private int consonats;

    public Letters(String[] conso, String input)
    {
        String[] letters = input.split(" ");
        char ch;
        char sz;
        int index = 0;
        String word;
        int all = 0;

        for (int row = 0; row < letters.length; row++ )
        {
            word = letters[row];

            for (int i = 0; i < word.length(); i++)
            {
            ch = word.charAt(i);
            all++;

            for (int col = 0; col < conso.length; col++)
            {
            sz = conso[col].charAt(index);

            if (ch == sz)
            {
                vowels++;
            }
            }
            }
        }

        consonats = all - vowels;
    }
    public int getVowels()
    {
        return vowels;
    }
    public int getConsonats()
    {
        return consonats;
    }
    public int summary()
    {
        return getVowels() + getConsonats();
    }

}
