package exercises;

public class MyClass {
    public static void main(String[] args) {
        //System.out.println("hello world!");
        //create an instance method to call methods outside of the function
        MyClass myClass = new MyClass();
        myClass.whatIsMyVariable();
    }
    //Class variable
        private String myVariable = "Pizza";

    //constructor
    public MyClass() {
    }

    //method
    public void whatIsMyVariable() {
        System.out.println(this.myVariable.equals("Pizza"));
    }
}
