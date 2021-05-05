package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Alice myFirstAlice = new Alice();
        String searchTerm = myFirstAlice.getUsersSearchTerm();
        Boolean myReturnedResult = myFirstAlice.searchAliceQuote(searchTerm);
        if (myReturnedResult == true) {
            myFirstAlice.getWordAtIndex(searchTerm);
            myFirstAlice.removeWordFromQuote(searchTerm);
        }
        System.out.println("The result is: " + myReturnedResult.toString());
    }
    public void removeWordFromQuote(String searchTerm) {
        String theQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        String theQuoteLowerCase = theQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();
        //Use the sub string method to remove a section from a string
        //|Alice was |beginning| to get very tired|
        int startingPoint1 = 0;
        int endingPoint1 = theQuoteLowerCase.indexOf(searchTermLowerCase);;
        int startingPoint2 = theQuoteLowerCase.indexOf(searchTermLowerCase) + searchTermLowerCase.length();

        String ourNewQuote = theQuote.substring(startingPoint1, endingPoint1) + theQuote.substring(startingPoint2);
        System.out.println("The new quote is: " + ourNewQuote);

    }

        public void getWordAtIndex(String searchTerm) {
        String theQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        String theQuoteLowerCase = theQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();

        int theIndex = theQuoteLowerCase.indexOf(searchTermLowerCase);
        System.out.println("The index is " + theIndex + " and the length is " + searchTermLowerCase.length());

    }

    public String getUsersSearchTerm() {
        Scanner scanner = new Scanner(System.in);
        String searchTerm = scanner.nextLine();
        scanner.close();
        return searchTerm;
    }
    public boolean searchAliceQuote(String searchTerm) {
        String theQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        String theQuoteLowerCase = theQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();

        Boolean result = theQuoteLowerCase.contains(searchTerm);
        return result;
    }
}
