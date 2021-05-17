package exercises.controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    //create and initialize an array with the values in a single line 1, 1, 2, 3, 5, 8
    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.printOddNumbers();
        arrayPractice.splitStringWordsIntoArray();
        arrayPractice.splitStringIntoSeparateSentences();
    }
    public void printOddNumbers() {
        int[] myArrayOfNumbers = {1, 1, 2, 3, 5, 8};
        //loop through array and print out each value, then modify the loop to print the odd numbers
        for (int i = 0; i < myArrayOfNumbers.length; i++) {
            if (myArrayOfNumbers[i] % 2 == 1) {
                System.out.println(myArrayOfNumbers[i]);
            }
        }
    }
    public String[] splitAGivenString() {
        String message = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. ";
        String[] mySpiltStrings = message.split(" ");
        return mySpiltStrings;
    }


    public void splitStringWordsIntoArray() {
//        Use the split method to divide the string at each space and store the individual words in an array.
        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitQuote = quote.split(" ");

        System.out.println(Arrays.toString(splitQuote));
    }
/*
 change the delimiter to split the string into separate sentences.
 */
    public void splitStringIntoSeparateSentences() {
        String message = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse. ";
        String[] splitMessage = message.split("\\.");
        System.out.println(Arrays.toString(splitMessage));
    }

}