package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student barbi = new Student("Barbi", 4775, 1, 4.0);
        Student elena = new Student("Elena", 2017, 10, 4.0);

        ArrayList<Student> studentsEnrolledInLife = new ArrayList<>();
        studentsEnrolledInLife.add(barbi);
        studentsEnrolledInLife.add(elena);
//        System.out.println(barbi.getName());

        Course life = new Course("Life", 100, studentsEnrolledInLife);
        Teacher ryan = new Teacher("Ryan", "Semar", "Life", 12);

        System.out.println(ryan.teacherInfo());
//        System.out.println(studentsEnrolledInLife.get(0).getName());
        System.out.println(life.courseInfo());

    }
}
