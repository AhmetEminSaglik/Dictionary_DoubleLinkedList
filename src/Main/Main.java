package Main;

import dictionary.Dictionary;

public class Main {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
// you can add first parameter  word, second parameter meaning;
        dictionary.addWord("hunter", "av");
        dictionary.addWord("hunt", "avlamak");
        dictionary.addWord("hunt", "oyunuda var");
        dictionary.addWord("ghost", "hayalet");
        dictionary.addWord("sugar", "şeker");
        dictionary.addWord("ghost", "hayalet");
        dictionary.addWord("car", "araba");

        dictionary.SearchWord("hunt");
        dictionary.SearchWord("hunter");

        dictionary.PrintAllWordsWithMeanings();
    }

}
