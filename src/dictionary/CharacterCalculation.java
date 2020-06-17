package dictionary;

import javax.swing.JOptionPane;

public class CharacterCalculation {

    String alphabet = "abcdefghijklmnopqrstuvwxyzöıüçşğ+&!/@#¥\'?= ()-.:0123456789";

    public char CharacterCalculate(int index) {
        //JOptionPane.showMessageDialog(null, "alfabe uzunlugu" + alphabet.length() + " / 42 index : " + alphabet.charAt(42));
        return alphabet.charAt(index);
    }

}
