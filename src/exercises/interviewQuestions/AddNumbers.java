package exercises.interviewQuestions;

import java.util.HashMap;

public class AddNumbers {
    public static void main(String[] args) {
////        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};
////
////        for (int i : numbers) {
////            System.out.println(i)
        System.out.println(addNumbers(8));
    }


    public static int addNumbers(int sumOfNumbs) {
        int total = 0;

        for (int i = 0; i < sumOfNumbs; i++) {
             total = total + i;
        }
        return total;
    }
}


