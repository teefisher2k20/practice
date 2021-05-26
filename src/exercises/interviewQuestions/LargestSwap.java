package exercises.interviewQuestions;

public class LargestSwap {
    public static void main(String[] args) {
        System.out.println(largestSwap(14));

        System.out.println(largestSwap(14));

        System.out.println(largestSwap(99));
    }
    //*Write a function that takes a two-digit number
    // and determines if it's the largest of two possible digit swaps
    public static boolean largestSwap(int num) {
        String number = String.valueOf(num);
        int i = number.charAt(0);
        int j = number.charAt(1);
        if (j > i){
            return false;
        }
        else{
            return true;
        }
    }
}
