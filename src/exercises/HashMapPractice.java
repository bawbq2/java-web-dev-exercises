package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){

        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.print("Enter your students (or press Enter to finish): ");

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")){
                System.out.print("ID: ");
                Integer newId = input.nextInt();
                students.put(newStudent, newId);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        System.out.println("\n Class Roster: ");

        for (Map.Entry<String, Integer> student: students.entrySet()) {
            System.out.println(student.getKey() + "(" + student.getValue() + ")");
        }
    }

}
