package Reading_txt;

import dictionary.Dictionary;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class ReadTxtClass {

    File fileName;

    public ReadTxtClass(File fileName) {
        this.fileName = fileName;
    }

    public ReadTxtClass(String filePathName) {
        this.fileName = new File(filePathName);
        //ScanFile();
    }

    public Dictionary ScanFile_AddWords() {
        /* showMessage("If you will use Turkish Characters and after read txt,\n"
                + "if you take unknow character but you see a normal character in txt then  do belows :\n"
                + "1-)Copy whole text you will read\n"
                + "2-)Right Click on txt you  want to read\n"
                + "3-)Open and Then paste in it");*/
        Dictionary dictionary = new Dictionary();

        String str;
        try {

            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            String word, Meaning;
            int Counter_Of_Words = 0;

            /* showMessage("WARNING :\nThis project  is set according to dictionary.txt\n"
                    + "which has words that in first 36 character\n"
                    + "and then meaning coming after that until finish line.");*/
            while ((str = in.readLine()) != null) {
                Counter_Of_Words++;
                word = "";
                for (int i = 0; i < 36; i++) {
                    word += str.charAt(i);
                }
                System.out.print(Counter_Of_Words + "-) " + word);

                Meaning = "";

                for (int i = 36; i < str.length(); i++) {
                    Meaning += str.charAt(i);
                }
                System.out.println(" : " + Meaning);
                dictionary.addWord(word, Meaning);

            }
            System.out.println("\n\n" + Counter_Of_Words + " words are read");

        } catch (IOException ex) {
            System.out.println("ex :" + ex);
        }
        return dictionary;
    }

    public void showMessage(String text) {
        JOptionPane.showMessageDialog(null, text);
    }
}
