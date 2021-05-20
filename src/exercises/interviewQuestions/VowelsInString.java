package exercises.interviewQuestions;

public class VowelsInString {
    public static void main(String[] args) {
        String characterName = "Terrance Fisher";
        System.out.println(countVowels(characterName));
    }


    // Returns count of vowels in str
    public static int countVowels(String vowels) {
        int vowelCount = 0;
        for (int i = 0; i < vowels.length(); i++) {
            if ("aeiouAEIOU".contains(String.valueOf(vowels.charAt(i))))// check for vowel
                vowelCount++;

        }
        return vowelCount;
    }
}
