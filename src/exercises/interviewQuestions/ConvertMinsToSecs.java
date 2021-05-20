package exercises.interviewQuestions;

import java.util.Scanner;

public class ConvertMinsToSecs {
    public static void main(String[] args) {
        //declare variable to be converted
        int answer = minsToSecs(3);
        int answer1 = minutesToSeconds(5);
        //call method
        System.out.println("answer to minsToSecs is: " + answer + " answer to minutesToSeconds is: " + answer1);

    }

    //Convert minutes to seconds
    public static int minutesToSeconds(int minutes) {
        return minutes * 60;
    }

    //Convert minutes to seconds
    public static int minsToSecs(int minutes) {
        int seconds = 0;
        seconds = minutes * 60;
        return seconds;
    }
}

