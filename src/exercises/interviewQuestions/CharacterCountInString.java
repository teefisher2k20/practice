package exercises.interviewQuestions;

public class CharacterCountInString {
    public static void main(String[] args) {

        System.out.println(charCount('a', "edabit"));

        System.out.println(charCount('c', "Chamber of secrets"));

        System.out.println(charCount('b', "big fat bubble"));
    }
    //*Create a function that takes a character and a string as arguments
    // and returns the number of times the character is found in the string.
    public static int charCount(char c, String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c) count++;
        }
        return count;
    }

}
