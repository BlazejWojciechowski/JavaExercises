package Zadania.KlasyTabliceArrayList;

public class RainFall
{
    private double[] rain;

    public RainFall(double[] r)
    {
        rain = new double[r.length];

        for (int index = 0; index < r.length; index++)
        {
            rain[index] = r[index];
        }
    }

    public double gettotalRain()
    {
        double total = 0;

        for (int index = 0; index < rain.length; index++)
        {
            total += rain[index];
        }

        return total;
    }

    public double getavgRain()
    {
        double avg;

        avg = gettotalRain() / rain.length;

        return avg;
    }

    public double getHighest()
    {
        double highest = rain[0];

        for (int index = 1; index < rain.length; index++)
        {
            if (rain[index] > highest)
                highest = rain[index];
        }
        return highest;
    }

    public double getLowest()
    {
        double lowest = rain[0];
        for (int index = 1; index < rain.length; index++)
        {
            if (rain[index] < lowest)
                lowest = rain[index];
        }
        return lowest;
    }
}
