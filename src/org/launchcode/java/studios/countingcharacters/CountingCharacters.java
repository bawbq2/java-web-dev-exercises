package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main (String[] args){

        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. Once " +
                "you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = sentence.toCharArray();

        HashMap<Character, Integer> characterCount= new HashMap<>();


        for (int i=0; i<charactersInString.length; i++) {
            Integer timesInSentence = 1;
            if (!characterCount.containsKey(charactersInString[i])) {
                characterCount.put(charactersInString[i], timesInSentence);
            } else {
                characterCount.put(charactersInString[i], characterCount.get(charactersInString[i])+ 1);
            }
        }



        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
