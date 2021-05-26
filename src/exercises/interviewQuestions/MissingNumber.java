package exercises.interviewQuestions;

public class MissingNumber {
    public static void main(String[] args) {

    }
    //*Create a method that takes an array of integers between 1 and 10
    // (excluding one number) and returns the missing number
    public static int missingNum(int[] nums) {
        int total = 55;
        for (int i = 0; i < nums.length; i++)
            total -= nums[i];
        return total;
    }
}
