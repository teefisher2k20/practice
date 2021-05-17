package exercises.interviewQuestions;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
//When the method is called, the two integers are given as parameters will be added together
   returnSumOfTwoNumbers(5,2);
    }


// create function with multiple params that when added, prints the total to the console
    public static void returnSumOfTwoNumbers(int number1, int number2) {
       int total = number1 + number2;
            System.out.println("The sum of number1 and number2 is: " + total);
        }
    }

