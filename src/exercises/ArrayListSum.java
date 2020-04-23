package exercises;

import java.util.ArrayList;

public class ArrayListSum {
    public static Integer sumArray(ArrayList<Integer> numbersArrayList) {
        Integer adder = 0;
        for (int i = 0; i < numbersArrayList.size(); i++) {
            if (numbersArrayList.get(i) % 2 == 0) {
                adder = adder + numbersArrayList.get(i);
           }
        }
        return adder;
    }
}
