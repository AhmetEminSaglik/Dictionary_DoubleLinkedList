package Main;

import Reading_txt.ReadTxtClass;
import dictionary.Dictionary;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ReadTxtClass readTxt = new ReadTxtClass("dictionary.txt");
        Dictionary dictionary = readTxt.ScanFile_AddWords();
        dictionary.PrintAllWordsWithMeanings();
        System.out.println("\nif you want to exit press -1 ");

        System.out.print("-->");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("-1")) {
            dictionary.SearchWord(input);
            System.out.print("-->");
            input = scanner.nextLine();
        }
    }

}
