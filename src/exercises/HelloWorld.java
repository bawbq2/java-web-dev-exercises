package exercises;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");
        name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
