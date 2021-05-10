package studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();
    }
    //Declare class variable
    private String areaOfACircle;

    // create a constructor
    public Area() {

}
    public void calculateArea() {
        //Ask for radius
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        try {
            boolean keepOnLooping = true;
            while(keepOnLooping) {
                Double myUserRadius = input.nextDouble();

                // checks if the input is a negative number
                if (myUserRadius < 0) {
                    System.out.println("You can not enter a negative number!");
                    //re-prompt the user
                } else {
                    //continue as normal

                    //calculate the area
                    //Area = pi * radius * radius
                    Double area = 3.14 * myUserRadius * myUserRadius;

                    //print result
                    System.out.println("The area of the circle of radius is " + area);

                    // tell while loop to exit
                    keepOnLooping = false;
                }
            }
        } catch (Exception error) {
            System.out.println("You must provide a numeric input");
        }

        //close the scanner
        input.close();
    }
}

