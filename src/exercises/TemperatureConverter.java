package exercises;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        //Must declare a variable before it is used.
            double fahrenheit;
            double celsius;
            //Scanner is assigned to the name input declared to be a Scanner object
            Scanner input;

            //prompts the user to enter a number in the command line.
            //System.in is used for user input
            input = new Scanner(System.in);
//            asks the user to enter a number
            System.out.println("Enter the temperature in Fahrenheit: ");
/*         we use input to read the value from the command line
            the compiler compares the types for fahrenheit and input.nextDouble() and throws an error if the two do not match
 */        fahrenheit = input.nextDouble();
 //Close scanner class
            input.close();

            celsius = (fahrenheit - 32) * 5/9;
            System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
