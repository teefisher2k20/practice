package exercises.interviewQuestions;

public class PrintFunction {
    public static void main(String[] args) {
        printMyFamily("me", 41);
        printMyFamily("you", 72);
        printMyFamily("Terrance", 41);
    }

    //print my family function that prints family members from printMyFamily to the console
    public static void printMyFamily(String familyMembers, int age) {
        System.out.println("family members names and ages: " + familyMembers + age);
    }

}
