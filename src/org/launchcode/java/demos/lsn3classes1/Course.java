package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private int courseCreditValue;
    private ArrayList<Student> studentsEnrolled;

    public Course(String courseName, int courseCreditValue, ArrayList<Student> studentsEnrolled) {
        this.courseName = courseName;
        this.courseCreditValue = courseCreditValue;
        this.studentsEnrolled = studentsEnrolled;
    }

    protected String courseInfo(){
//        String namesToList = "";
//        for (int i=0; i<studentsEnrolled.size(); i++) {
//            namesToList = studentsEnrolled.get(i).getName();
//            return(namesToList + " is enrolled in " + courseName + " which is worth " + courseCreditValue + " credits.")
//        }
        return ("The course is called " + courseName +" and is worth " + courseCreditValue + " credits. There are " + studentsEnrolled.size() + " students enrolled.");
    }

    protected String getCourseName(){
        return courseName;
    }

    protected void setCourseName(String aCourseName) {
        courseName = aCourseName;
    }

    protected int getCourseCreditValue(){
        return courseCreditValue;
    }

    protected void setCourseCreditValue(int aCourseCreditValue) {
        courseCreditValue = aCourseCreditValue;
    }

    public ArrayList<Student> getStudentsEnrolled(){
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList<Student> aSetStudentsEnrolled){
        studentsEnrolled = aSetStudentsEnrolled;
    }
}
