package exercises.interviewQuestions;

import java.util.Arrays;

public class HowToPrintArray {
    public static void main(String[] args) {
        String[][] array = new String[][] {{"Element1", "Element2", "Element3"},{"Numbers1", "Numbers2"}};
        //#1 asList() command for one dimensional arrays that you want to print.
        System.out.println(Arrays.asList(array));

        //Multidimensional arrays? Use a nested for-loop using i & j
        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array.length; j ++) {
                System.out.println(array[i][j] + "This one");
                System.out.println(" ");
            }
        }

    }
}
