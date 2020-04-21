package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        float miles;
        float gallonsConsumed;
        float milesPerGallon;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        miles = input.nextFloat();
        System.out.println("How many gallons of gas have you used? ");
        gallonsConsumed = input.nextFloat();
        input.close();

        milesPerGallon = miles/gallonsConsumed;
        System.out.println("Your gas mileage is " + milesPerGallon + " miles per gallon.");
    }
}
