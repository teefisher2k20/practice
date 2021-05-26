package exercises.interviewQuestions;

public class ReturnTheFactorial {
    public static void main(String[] args) {

        System.out.println(factorial(4));
    }
    //*Create a function that takes an integer and returns the factorial of that
    // integer. That is, the integer multiplied by all positive lower integers.
    public static int factorial(int num) {
        int fact =1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }
}
