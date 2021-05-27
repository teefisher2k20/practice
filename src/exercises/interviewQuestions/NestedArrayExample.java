package exercises.interviewQuestions;

import java.util.Arrays;

public class NestedArrayExample {
    //*Create a function that returns true if the first array can be nested inside
    // the second. arr1's min is greater than arr2's min.
    //arr1's max is less than arr2's max.
    public static void main(String[] args) {


    }
    public static boolean canNest(int[] arr1, int[] arr2) {

        int min_value1 = arr1[0];
        int min_value2 = arr2[0];

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] < min_value1){
                min_value1 = arr1[i];
            }
        }

        for(int i = 0; i < arr2.length; i++){
            if(arr1[i] < min_value2){
                min_value2 = arr2[i];
            }
        }

        if(min_value1 > min_value2){
            return true;
        }else{
            return false;
        }
    }

}

