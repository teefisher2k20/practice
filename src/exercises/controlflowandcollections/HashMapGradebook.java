package exercises.controlflowandcollections;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapGradebook {
    public static void main(String[] args) {

        HashMap<String, Double> students = new HashMap<>();

        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Grade: ");
                Double newGrade = input.nextDouble();
                students.put(newStudent, newGrade);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;
/*
Map.Entry is specifically constructed to be used in this fashion, to represent
key/value pairs within HashMaps. Each Map.Entry object has a getKey method ]
and a getValue method, which represent the key and value of the map item
 */
        for (Map.Entry<String, Double> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            sum += student.getValue();
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
/*
If you only need to access the key of each item in a map, you can construct a simpler loop:
for (String student : students.keySet()) {
   System.out.println(student);
}
A similar structure applies if you only need the values, using students.values():
for (double grade : students.values()) {
   System.out.println(grade);
}

 */
}
