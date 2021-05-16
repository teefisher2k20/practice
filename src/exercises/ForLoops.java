package exercises;

import java.util.ArrayList;

public class ForLoops {
    public static void main(String[] args) {
////        //for loop syntax that prints 0-4. If statement prints 5th iteration "is less than 4" to console
//        for (int i = 0; i < 10; i++) {
//            if (i < 4)
//                System.out.println(i);
//            continue;
//        }
//        System.out.println("is less than 4");

//        //for each loop that intializes String msg variable named "Hello World" and prints it as
//        //an array to the console on seperate lines.
//        String msg = "Hello World";
//
//        for (char c : msg.toCharArray()) {
//            System.out.println(c);
//
//            //do-while loop is evaluated before the conditional 3 is never less than 2 so "Hello world!" is only printed to the console once.
////            do {
////                System.out.println("Hello world!");
////            } while (3 < 2);
//        }
///*write a for loop that prints the even numbers 1-10 to the console.
//otherwise print "is odd" to the console.
// */
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0)
//                System.out.println(i);
//            else {
//                System.out.println("is odd");
//            }
//        }
////write a while loop that prints "Drinking water" to the console with a conditional
////        int i = 0;
////
////        while (i < 3) {
////            if (i % 2 == 0) {
////                System.out.println("Drinking water");
////            }
////            i++;
////        do while loop that prints 2 - 50 even number to the console
//        int i = 0;
//
//        do {
//            if (i % 2 == 0)
//                System.out.println(i);
//            i++;
//        } while (i < 50);
//
//    }
        ArrayList<Integer>favoriteNumbers = new ArrayList<>();
        favoriteNumbers.add(1);
        favoriteNumbers.add(5);
        favoriteNumbers.add(7);
        favoriteNumbers.add(9);
        favoriteNumbers.add(2);

        int[]arrayOfInts = {1,2,5,7,54,67,99};
      String[] seasons = {"Spring", "Summer", "Winter", "Fall"};
//        for loop to print seasons to the console
//        for (int i = 0; i < seasons.length; i++) {
//            System.out.println(seasons[i]);
//        }
        //for each loop to seasons to the console
//        for (String season : seasons) {
//            System.out.println(season);
//
        //for each loop to print arrayOfInts to the console
    for (int arrayInt : arrayOfInts) {
        System.out.println("array of integers are: " + arrayInt);
        System.out.println(favoriteNumbers.toArray());
    }


    }

}


