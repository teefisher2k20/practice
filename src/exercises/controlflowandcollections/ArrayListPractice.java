package exercises.controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

//        ArrayList<String> planets = new ArrayList<>();
//        planets.add("Earth");
//        planets.add("Mars");
//        planets.add("Venus");
//        planets.add("Jupiter");
//        planets.add("Saturn");
//        planets.add("Neptune");
//        planets.add("Uranus");
//        planets.add("Mercury");
//        System.out.println(planets);
//        System.out.println(planets.size());
//        System.out.println(planets.contains("Earth"));
//        System.out.println(planets.indexOf("Jupiter"));
//
//        String[] planetsArray = new String[planets.size()];
//        planets.toArray(planetsArray);
        ArrayList<Integer>numberToSum = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

        ArrayListPractice.sumAllEvenNumbers(numberToSum);
        Integer theSum = ArrayListPractice.sumAllEvenNumbers(numberToSum);
        System.out.println("The sum is: " + theSum.toString());

        ArrayPractice arrayPractice = new ArrayPractice();
        String[] returnedWords = arrayPractice.splitAGivenString();

        ArrayList<String>wordsToSearch = new ArrayList<>(Arrays.asList(returnedWords));
        System.out.println("What word length are you looking for?: ");
        Integer searchLength = ArrayListPractice.getUserSearchInput();
        ArrayListPractice.printWordsWithFiveValues(wordsToSearch, searchLength);


    }

    public static Integer getUserSearchInput() {
        Scanner scanner = new Scanner(System.in);
        Integer myUsersInt = scanner.nextInt();
        scanner.close();
        return myUsersInt;
    }
    public static void printWordsWithFiveValues(ArrayList<String>words, Integer searchLength) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == searchLength)
            System.out.println(words.get(i));

        }

    }
        /*Write a static method to find the sum of all the even numbers in an ArrayList
         */
        public static Integer sumAllEvenNumbers(ArrayList<Integer>valueToSum) {
            int sum = 0;
            for (int i = 0; i < valueToSum.size(); i++) {
                System.out.println(valueToSum.get(i));
                if (valueToSum.get(i) % 2 == 0) {
                    sum = sum + valueToSum.get(i);
                }
            }
            return sum;
        }
}

