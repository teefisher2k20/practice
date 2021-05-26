package exercises.interviewQuestions;

import java.util.HashMap;

public class AddNumbers {
    public static void main(String[] args) {
        System.out.println(addNumbers(8));
    }

    //*Create a method that takes an integer as an argument.
    //Add up all the numbers from 1 to the number you passed
    //to the function. For example, if the input is 4 then your
    //function should return 10 because 1 + 2 + 3 + 4 = 10.

    public static int addNumbers(int sumOfNumbs) {
        int total = 0;

        for (int i = 0; i < sumOfNumbs; i++) {
             total = total + i;
        }
        return total;
    }
}


