package exercises;

public class ArrayPracticeInt {
    public static void main(String[] args) {
        Integer[] intArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
};
