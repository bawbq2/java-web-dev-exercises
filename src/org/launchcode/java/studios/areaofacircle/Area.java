package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = input.nextDouble();
        if (radius < 0) {
            System.out.println("Radius must be positive.");
        }
        input.close();

//        area = radius * radius * StrictMath.PI;
        area = Circle.getArea(radius);
        System.out.println("The area of the circle is "+ area);
    }
}
