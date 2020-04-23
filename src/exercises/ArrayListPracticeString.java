package exercises;

import java.util.ArrayList;

public class ArrayListPracticeString {
    public static void main(String[] args){

        ArrayList<String> wordsArrayList = new ArrayList<>();
        wordsArrayList.add("my");
        wordsArrayList.add("dog");
        wordsArrayList.add("is");
        wordsArrayList.add("named");
        wordsArrayList.add("Elena");
        wordsArrayList.add("and");
        wordsArrayList.add("she");
        wordsArrayList.add("is");
        wordsArrayList.add("super");
        wordsArrayList.add("cute");

        FiveLetterWords.fiveLetterWords(wordsArrayList);

    }
}
