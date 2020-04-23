package exercises;

import java.util.ArrayList;

public class ArrayListPracticeInt {
    public static void main(String[] args){

        ArrayList<Integer> numbersArrayList = new ArrayList<>();
        numbersArrayList.add(1);
        numbersArrayList.add(2);
        numbersArrayList.add(3);
        numbersArrayList.add(4);
        numbersArrayList.add(5);
        numbersArrayList.add(6);
        numbersArrayList.add(7);
        numbersArrayList.add(8);
        numbersArrayList.add(9);
        numbersArrayList.add(10);

//        for (int i = 0; i < numbersArrayList.size(); i++) {
//            adder += numbersArrayList.get(i);
//        }
        Integer total = ArrayListSum.sumArray(numbersArrayList);
        System.out.println("The sum of the numbers is " + total);
    }


    };
