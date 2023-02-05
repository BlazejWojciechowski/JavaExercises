package Zadania.KlasyDziedziczenie;

public class CourseGrades extends GradedActivity implements CourseInterface
{
    private GradedActivity[] grades = new GradedActivity[4];

    private double avgScore;
    private GradedActivity highestScore;
    private GradedActivity lowestScore;

    protected int position;

    public void setLab(GradedActivity g)
    {
        grades[0] = g;
    }
    public void setPassFailExam(PassFailExam p)
    {
        grades[1] = p;
    }
    public void setEssay(Essay e)
    {
        grades[2] = e;
    }
    public void setFinalExam(FinalExam f)
    {
        grades[3] = f;
    }
    public String toString(int value)
    {
        String str;

        str = String.valueOf("Wynik: " + grades[value].getScore() + "\tOcena: " + grades[value].getGrade());

        return str;
    }
    @Override
    public double getAverage()
    {
        double average = 0;
        for (int index = 0; index < grades.length; index++)
        {
            average += grades[index].getScore();
        }
        avgScore = average / grades.length;
        return avgScore;
    }

    @Override
    public GradedActivity getHighest()
    {
        int position = 0;
        int index;
        double highest = grades[0].getScore();
        for (index = 1; index < grades.length; index++)
        {
            if (highest < grades[index].getScore())
            {
                highest = grades[index].getScore();
                position = index;
            }
        }
        highestScore = grades[position];

        this.position = position;
        return highestScore;
    }

    @Override
    public GradedActivity getLowest()
    {
        int position = 0;
        int index;
        double lowest = grades[0].getScore();
        for (index = 1; index < grades.length; index++)
        {
            if (lowest > grades[index].getScore())
            {
                lowest = grades[index].getScore();
                position = index;
            }
        }
        lowestScore = grades[position];

        this.position = position;
        return lowestScore;
    }
}
