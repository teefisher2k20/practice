package exercises.controlflowandcollections;
import java.util.Collections;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Venus");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Neptune");
        planets.add("Uranus");
        planets.add("Mercury");
        System.out.println(planets);
        System.out.println(planets.size());
        System.out.println(planets.contains("Earth"));
        System.out.println(planets.indexOf("Jupiter"));

        String[] planetsArray = new String[planets.size()];
        planets.toArray(planetsArray);


    }
}
