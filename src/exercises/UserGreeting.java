package exercises;
import java.util.Scanner;

public class UserGreeting {
    public static void main(String[] args) {

        UserGreeting hello = new UserGreeting();
        hello.askUserForName();
    }

        public void askUserForName () {
            Scanner input = new Scanner(System.in);

            System.out.println("Hello, what is your name?");

            String name = input.nextLine();

            System.out.println("Hello " + name);
        }
    }