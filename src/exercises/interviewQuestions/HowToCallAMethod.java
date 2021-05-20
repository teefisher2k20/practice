package exercises.interviewQuestions;

public class HowToCallAMethod {
    public static void main(String[] args) {
        //To call method with parameters add parameter in () after method name;
//        myMethod(String paramName, String paramAddress);
        myMethod("Jane", "6149 Hancock");
        myMethod("Amy", "6052 Garfield");
        myMethod("Terrance", "15556 Fox Plains");
//to call method with no parameters use myMethod();
    }

    //if it requires a parameter, insert int, string, object followed by reference variable
    //
    public static void myMethod(String paramName, String paramAddress) {
        if (paramName.equals("Terrance")) {
            System.out.println("This is a method: " + paramName + paramAddress);
        } else {
            System.out.println("This isn't it");
        }
    }
}