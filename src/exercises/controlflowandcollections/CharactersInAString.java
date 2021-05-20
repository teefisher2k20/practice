package exercises.controlflowandcollections;

public class CharactersInAString {
    public static void main(String[] args) {
        //method that takes a char and a Sting as arguments and returns
        //number of times the character is found in a string.
        System.out.println(numberOfTimes('e', "tee"));
    }
        public static int numberOfTimes(char contains, String characters){
            int total = 0;

            for (int i = 0; i < characters.length(); i++) {
                if (characters.charAt(i) == contains)
                    total++;
            }
            return total;
        }
    }


