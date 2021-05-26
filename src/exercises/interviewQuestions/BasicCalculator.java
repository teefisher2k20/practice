package exercises.interviewQuestions;

public class BasicCalculator {
    public static void main(String[] args) {
        //*Create a function that takes two numbers and a mathematical operator + - / *
        // and will perform a calculation with the given numbers
        System.out.println(calculator(2, '+', 2));
        System.out.println(calculator(2, '*', 2));
        System.out.println(calculator(4, '/', 2));
    }
    public static int calculator(int num1, char operator, int num2) {
        switch(operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return (num2 == 0) ? 0 : num1/num2;
        }
        return 0;
    }
}
