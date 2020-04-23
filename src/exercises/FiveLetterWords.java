package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class FiveLetterWords {
    public static void fiveLetterWords(ArrayList<String> wordsArrayList) {
        Integer lengthOfWord;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        lengthOfWord = input.nextInt();
        input.close();

        for (int i=0; i<wordsArrayList.size(); i++){
            if (wordsArrayList.get(i).length() == lengthOfWord) {
                System.out.println(wordsArrayList.get(i));
            }
        }
    }
}
