package exercises;
import java.util.Scanner;
//Add an import statement at the the top of the file to include Scanner:
public class UserGreeting {
    public static void main(String[] args) {

        UserGreeting hello = new UserGreeting();
        hello.askUserForName();
    }

        public void askUserForName () {
        //Declare a variable of type Scanner called input
            Scanner input = new Scanner(System.in);
        //Add a question to ask the user:
            System.out.println("Hello, what is your name?");
        //Create a variable to store the user’s response using the Scanner’s .nextLine() method
            String name = input.nextLine();
        //Use concatenation to print the greeting:
            System.out.println("Hello " + name);
        }
    }