package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        float length;
        float width;
        float area;

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle: ");
        length = input.nextFloat();
        System.out.println("Please enter the width of the rectangle: ");
        width = input.nextFloat();
        input.close();

        area = (length * width);
        System.out.println("The area of the rectangle is: " + area);
    }
}
