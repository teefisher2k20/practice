package exercises.interviewQuestions;

public class XsAndOsNobodyKnows {
    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xooxx"));
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println(getXO("zzoo"));
    }
    //*Create a function that takes a string, checks if it has the same number
    // of x's and o's and returns either true or false.Return a boolean value (true or false).
    //Return true if the amount of x's and o's are the same.
    //Return false if they aren't the same amount.
    //The string can contain any character.
    //When "x" and "o" are not in the string, return true.
    public static boolean getXO (String str) {
        int xs = 0;
        int os = 0;
        for(char c : str.toLowerCase().toCharArray()){
            if(c == 'x'){xs++;}
            else if(c == 'o'){os++;}
        }
        return xs == os;
    }


}
