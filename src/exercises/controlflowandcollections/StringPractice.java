package exercises.controlflowandcollections;

import java.lang.reflect.Array;

public class StringPractice {
    public static void main(String[] args) {
//practice problems
        StringPractice stringPractice = new StringPractice();
        String[] arrayOfStrings = new String[3];
        arrayOfStrings[0] = "100";
        arrayOfStrings[1] = "200";
        arrayOfStrings[2] = "300";

    }

    public void splitLettersIntoArrays(String arrayOfStrings) {
        String str = "abc";
        arrayOfStrings = str;
        for (int i = 0; i < arrayOfStrings.length(); i++) {
            if (str.equals(arrayOfStrings)) {
                System.out.println(arrayOfStrings.toCharArray());
            } else {
                System.out.println("None");
            }
        }
        splitLettersIntoArrays(arrayOfStrings);
    }

    int[] arr1 = {1, 2, 3, 4};
    int[] arr2 = {0, 6};


    //create a function that returns true if the first array can be nested inside the second
    public static String compareArrays(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; i < arr2.length; i++)
                if (arr1.equals(arr2)) {
                    return "true";
                } else {
                    return "false";
                }
        return "sss";
    }
}
