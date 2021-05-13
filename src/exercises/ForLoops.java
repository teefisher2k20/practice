package exercises;

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
        String msg = "Hello World";

        for (char c : msg.toCharArray()) {
            System.out.println(c);

            //do-while loop is evaluated before the conditional 3 is never less than 2 so "Hello world!" is only printed to the console once.
//            do {
//                System.out.println("Hello world!");
//            } while (3 < 2);
        }
//write a for loop that prints the even numbers 1-10 to the console.
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
//write a while loop that prints "Drinking water" to the console with a conditional
//        int i = 0;
//
//        while (i < 3) {
//            if (i % 2 == 0) {
//                System.out.println("Drinking water");
//            }
//            i++;
//        do while loop that prints 2 - 50 even number to the console
        int i = 0;

        do {
             if ( i % 2 == 0)
            System.out.println(i);
            i++;
        } while(i< 50);

    }
}

