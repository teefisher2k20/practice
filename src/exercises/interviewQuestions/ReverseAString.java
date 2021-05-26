package exercises.interviewQuestions;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverse("Hello World"));
        System.out.println(reverse("ReVeRsE"));
        System.out.println(reverse("Radar"));
    }

    //*The "Reverser" takes a string as input and returns that string in reverse
    // order, with the opposite case
    public static String reverse(String text) {
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            } else if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        String text1 = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            text1 += charArray[i];
        }
        return text1;
    }
}