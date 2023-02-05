package Zadania.Wyjątki;

import java.io.Serializable;

public class TestScores implements Serializable
{
    private int[] tests;

    public TestScores()
    {}
    public TestScores(int[] tests)
    {
        this.tests = tests;
    }
    public double avgScore() throws NegativeValue
    {
        double avg = 0;
        for (int index = 0; index < tests.length; index++)
        {
            if (tests[index] < 0 || tests[index] > 100)
                throw new NegativeValue();

            avg += tests[index];
        }
        return avg / tests.length;
    }
}
