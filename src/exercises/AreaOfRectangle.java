package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        /*
         Write a program to calculate the area of a rectangle and print the answer to the console.
          You should prompt the user for the dimensions.
         */
        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
        areaOfRectangle.calculateAreaOfRectangle();
    }
        public void calculateAreaOfRectangle () {
            //Add a Scanner object to handle the user’s input.
            Scanner scanner = new Scanner(System.in);

            /*Add a print line to prompt the user for the length of the rectangle.
            Define a variable to handle the user’s response.
            */
            System.out.println("What is the length of the rectangle?");
            Double myRectangleLength = scanner.nextDouble();

            // ask for and store the rectangle’s width.
            System.out.println("What is the width of the rectangle?");
            Double myRectangleWidth = scanner.nextDouble();

            /*Use the length and width values to calculate the rectangle’s area
            Area = width * length*/
            Double area = myRectangleLength * myRectangleWidth;

            /*Print a statement using concatenation to communicate
             to the user what the area of their rectangle is
             */
            System.out.println("Your area is: " + area.toString());
        }
    }


