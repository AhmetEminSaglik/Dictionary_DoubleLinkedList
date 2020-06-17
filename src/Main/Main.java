package Main;

import Reading_txt.ReadTxtClass;

public class Main {

    public static void main(String[] args) {
        ReadTxtClass readTxt = new ReadTxtClass("dictionary.txt");
        readTxt.ScanFile_AddWords();
        /* Dictionary dictionary = new Dictionary();
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

        dictionary.PrintAllWordsWithMeanings();*/
        //Dictionary dictionary = new Dictionary();

        //dictionary.ReadTxt_And_TakeWordsTo_Dictionary("sozluk2.txt");

        //   readTxt.ScanFile();
    }

}
