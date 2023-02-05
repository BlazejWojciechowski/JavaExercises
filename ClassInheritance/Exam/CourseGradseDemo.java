package Zadania.KlasyDziedziczenie;

import javax.swing.*;

public class CourseGradseDemo
{
    public static void main(String[] args)
    {
        String str;
        int numQuestions = 15;
        double minPassing = 60;
        int numMissed = 3;
        int labPoints = 88;
        int essayPoints = 77;
        int examFinal = 50;
        int value;
        GradedActivity highest;
        GradedActivity lowest;


        CourseGrades course = new CourseGrades();


        GradedActivity graded = new GradedActivity();
        graded.setScore(labPoints);
        course.setLab(graded);

        System.out.println(course.toString(0));

        PassFailExam pass = new PassFailExam(numQuestions, numMissed, minPassing);
        course.setPassFailExam(pass);

        System.out.println(course.toString(1));

        Essay ess = new Essay(essayPoints);
        course.setEssay(ess);

        System.out.println(course.toString(2));

        FinalExam exam = new FinalExam(examFinal, numMissed);
        course.setFinalExam(exam);

        System.out.println(course.toString(3));

        System.out.println("Średnia wyników punktowych to " + course.getAverage());

        System.out.println("Najwyższy wynik to :");
        course.getHighest();
        value = course.position;
        System.out.println(course.toString(value));

        System.out.println("Najniższy wynik to :");
        course.getLowest();
        value = course.position;
        System.out.println(course.toString(value));


    }
}
