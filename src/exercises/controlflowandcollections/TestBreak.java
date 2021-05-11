package exercises.controlflowandcollections;

public class TestBreak {
    public static void main(String[] args) {
        /*
        The above program will print “Not here” on
        every iteration of the for loop except where the number has been found.
         */
        int[] someInts = {1, 10, 2, 3, 5, 8, 10};
        int searchTerm = 10;
        for (int oneInt : someInts) {
            if (oneInt == searchTerm) {
                System.out.println("Found it!");
                //Because of the continue statement,
                // the final print statement in the for loop is skipped.
                continue;
            }
            System.out.println("Not here");
        }
    }
}
