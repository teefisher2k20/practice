package exercises.controlflowandcollections;

public class ArrayPractice {
    //create and initialize an array with the values in a single line 1, 1, 2, 3, 5, 8
    public static void main(String[] args) {

            int []myArrayOfNumbers = {1, 1, 2, 3, 5, 8};
            //loop through array and print out each value, then modify the loop to print the odd numbers
            for (int i = 0; i < myArrayOfNumbers.length; i++ ) {
                if(i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }

    /*
    "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house.
    I will not eat them with a mouse." use the split method to divide the string
    at each space and store in an array

 */
    String message = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
}