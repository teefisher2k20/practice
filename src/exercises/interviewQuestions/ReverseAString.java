package exercises.interviewQuestions;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverse("teeer"));
    }

    public static String reverse(String s){
        String output = ""; //this is the output , initialized to " "
        for(int i=0; i<s.length(); i++){
            output = s.charAt(i) + output; //add to String r , the character of index i
        }
        return output;
    }
}