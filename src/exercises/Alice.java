package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstParagraph = "Alice was beginning to get very tired of sitting" +
                " by her sister on the bank, and of having nothing to do: once or twice" +
                " she had peeped into the book her sister was reading, but it had no" +
                " pictures or conversations in it, 'and what is the use of a book,'" +
                " thought Alice 'without pictures or conversation?'";
        String firstParagraphLowercase = firstParagraph.toLowerCase();
        String termToSearch;
        String termToSearchLowercase;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a term to search: ");
        termToSearch = input.nextLine();
        termToSearchLowercase = termToSearch.toLowerCase();
        input.close();

        System.out.println(firstParagraphLowercase.contains(termToSearchLowercase));
//        System.out.println("Term to search is: "+ termToSearch);
//        System.out.println("Term to search Lowercase is: "+ termToSearchLowercase);
        System.out.println("Your search term was at index " + firstParagraphLowercase.indexOf(termToSearchLowercase) + " and its length was " + termToSearchLowercase.length());
        int termToRemove = firstParagraphLowercase.indexOf(termToSearchLowercase);
        int termToRemoveLength = termToSearchLowercase.length();
        System.out.println("at index " + termToRemove + " and length "+ termToRemoveLength);
        String properCaseTermToRemove = firstParagraph.substring(termToRemove, termToRemove + termToRemoveLength);
        System.out.println("The proper case term to be removed is " + properCaseTermToRemove);
        String firstParagraphTermToSearchRemoved = firstParagraph.replace(properCaseTermToRemove, "");
        System.out.println(firstParagraphTermToSearchRemoved);
    }
}
