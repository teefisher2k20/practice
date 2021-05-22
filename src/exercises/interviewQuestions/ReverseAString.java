package exercises.interviewQuestions;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverse("teeer"));
    }

    public static String reverse(String reverseWord){
        String output = ""; //this is the output , initialized to " "
        for(int i=0; i<reverseWord.length(); i++){
            output = reverseWord.charAt(i) + output; //add to String r , the character of index i
        }
        return output;
    }
}