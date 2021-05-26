package exercises.interviewQuestions;

import java.util.Arrays;

public class NestedArrayExample {
    //*Create a function that returns true if the first array can be nested inside
    // the second. arr1's min is greater than arr2's min.
    //arr1's max is less than arr2's max.
    public static void main(String[] args) {

    }
    public static boolean canNest(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1[0] > arr2[0] && arr1[arr1.length-1]<arr2[arr2.length-1]){
            return true;
        }
        return false;
    }
}
