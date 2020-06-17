package dictionary;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Dictionary {

    private boolean SearcWord = false;
    String word;
    public Node first;
    int counterOfWordIndex = 0;
//String 

    public Dictionary() {
        this.first = null;
    }

    public String getTextToIndex(int counterOfWordIndex) { // Convert the corresponding integer to Character by alphabet
        String text = "";
        for (int i = 0; i <= counterOfWordIndex; i++) {
            text += word.charAt(i);
        }
        return text;
    }

    public void addWord(String word, String Meaning) {
        //  word = word.toLowerCase();
        word = word.trim();
        Meaning = Meaning.trim();
        //showMessage(" boşluk var mı =--> |" + word + "|" + "|" + Meaning + "|");
        this.word = word;

        if (this.first == null) {

            this.first = new Node("START");

        }
        Node temp = this.first;

        counterOfWordIndex = 0;
        while (counterOfWordIndex < word.length()) {
            Node tempNextNode = GoToLastIndex(word.charAt(counterOfWordIndex), temp);
            temp = tempNextNode;
            counterOfWordIndex++;
        }
        Node NodeMeaning = new Node(Meaning);
        if (temp.Meaning == null) {
            temp.Meaning = NodeMeaning;
        } else if (temp.Meaning.next != null) {

            int goBack = 0;
            while (temp.Meaning.next != null) {

                temp.Meaning = temp.Meaning.next;
                goBack++;
            }

            temp.Meaning.next = NodeMeaning;
            NodeMeaning.before = temp.Meaning;
            while (goBack > 0) {
                temp.Meaning = temp.Meaning.before;
                goBack--;
            }
        } else {

            temp.Meaning.next = NodeMeaning;
            NodeMeaning.before = temp.Meaning;
        }

    }

    public Node GoToLastIndex(char Char, Node temp) {  // goes according to coming Character's way
/*  NOT : SearchWord is for looking is there used path 
        if I search then I dont  want to create new Path. 
        BUT  if I add new words then I dont search  any word  
            SO  SearchWord is false (while I add new word)  which is used to make new Path
         */
        switch (Char) {
            case 'a':
            case 'A':
                if (temp.A_next == null && SearcWord == false) {
                    temp.A_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.A_next.before = temp;

                }
                return temp.A_next;

            case 'b':
            case 'B':
                if (temp.B_next == null && SearcWord == false) {
                    temp.B_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.B_next.before = temp;
                }
                return temp.B_next;

            case 'c':
            case 'C':
                if (temp.C_next == null && SearcWord == false) {

                    temp.C_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.C_next.before = temp;
                }
                return temp.C_next;

            case 'd':
            case 'D':
                if (temp.D_next == null && SearcWord == false) {
                    temp.D_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.D_next.before = temp;
                }
                return temp.D_next;

            case 'e':
            case 'E':
                if (temp.E_next == null && SearcWord == false) {
                    temp.E_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.E_next.before = temp;
                }
                return temp.E_next;
            case 'f':
            case 'F':
                if (temp.F_next == null && SearcWord == false) {
                    temp.F_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.F_next.before = temp;
                }
                return temp.F_next;
            case 'g':
            case 'G':
                if (temp.G_next == null && SearcWord == false) {
                    temp.G_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.G_next.before = temp;
                }
                return temp.G_next;
            case 'h':
            case 'H':
                if (temp.H_next == null && SearcWord == false) {
                    temp.H_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.H_next.before = temp;
                }

                return temp.H_next;
            case 'i':
            case 'I':
                if (temp.I_next == null && SearcWord == false) {
                    temp.I_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.I_next.before = temp;

                }
                return temp.I_next;
            case 'j':
            case 'J':
                if (temp.J_next == null && SearcWord == false) {
                    temp.J_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.J_next.before = temp;
                }
                return temp.J_next;
            case 'k':
            case 'K':
                if (temp.K_next == null && SearcWord == false) {
                    temp.K_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.K_next.before = temp;
                }
                return temp.K_next;
            case 'l':
            case 'L':
                if (temp.L_next == null && SearcWord == false) {
                    temp.L_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.L_next.before = temp;
                }
                return temp.L_next;
            case 'm':
            case 'M':
                if (temp.M_next == null && SearcWord == false) {
                    temp.M_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.M_next.before = temp;
                }
                return temp.M_next;
            case 'n':
            case 'N':
                if (temp.N_next == null && SearcWord == false) {
                    temp.N_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.N_next.before = temp;
                }
                return temp.N_next;
            case 'o':
            case 'O':
                if (temp.O_next == null && SearcWord == false) {
                    temp.O_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.O_next.before = temp;
                }
                return temp.O_next;
            case 'p':
            case 'P':
                if (temp.P_next == null && SearcWord == false) {
                    temp.P_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.P_next.before = temp;
                }
                return temp.P_next;
            case 'q':
            case 'Q':
                if (temp.Q_next == null && SearcWord == false) {
                    temp.Q_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.Q_next.before = temp;
                }
                return temp.Q_next;
            case 'r':
            case 'R':
                if (temp.R_next == null && SearcWord == false) {
                    temp.R_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.R_next.before = temp;
                }
                return temp.R_next;
            case 's':
            case 'S':
                if (temp.S_next == null && SearcWord == false) {
                    temp.S_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.S_next.before = temp;
                }
                return temp.S_next;
            case 't':
            case 'T':
                if (temp.T_next == null && SearcWord == false) {
                    temp.T_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.T_next.before = temp;
                }
                return temp.T_next;
            case 'u':
            case 'U':
                if (temp.U_next == null && SearcWord == false) {
                    temp.U_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.U_next.before = temp;
                }
                return temp.U_next;
            case 'v':
            case 'V':
                if (temp.V_next == null && SearcWord == false) {
                    temp.V_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.V_next.before = temp;
                }
                return temp.V_next;
            case 'w':
            case 'W':
                if (temp.W_next == null && SearcWord == false) {
                    temp.W_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.W_next.before = temp;
                }
                return temp.W_next;
            case 'x':
            case 'X':
                if (temp.X_next == null && SearcWord == false) {
                    temp.X_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.X_next.before = temp;
                }
                return temp.X_next;
            case 'y':
            case 'Y':
                if (temp.Y_next == null && SearcWord == false) {
                    temp.Y_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.Y_next.before = temp;
                }
                return temp.Y_next;
            case 'z':
            case 'Z':
                if (temp.Z_next == null && SearcWord == false) {
                    temp.Z_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.Z_next.before = temp;
                }
                return temp.Z_next;
            /*
                BELOW CHARACTERS ARE CONTAINED IN dictionary.txt 
                
             */
            case 'ö':
                if (temp.OO_next == null && SearcWord == false) {
                    temp.OO_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.OO_next.before = temp;
                }
                return temp.OO_next;
            case 'ı':
                if (temp.II_next == null && SearcWord == false) {
                    temp.II_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.II_next.before = temp;
                }
                return temp.II_next;
            case 'ü':
                if (temp.UU_next == null && SearcWord == false) {
                    temp.UU_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.UU_next.before = temp;
                }
                return temp.UU_next;
            case 'ç':
                if (temp.CC_next == null && SearcWord == false) {
                    temp.CC_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.CC_next.before = temp;
                }
                return temp.CC_next;
            case 'ş':
                if (temp.SS_next == null && SearcWord == false) {
                    temp.SS_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.SS_next.before = temp;
                }
                return temp.SS_next;
            case 'ğ':
                if (temp.GG_next == null && SearcWord == false) {
                    temp.GG_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.GG_next.before = temp;
                }
                return temp.Slash_next;
            case '+':
                if (temp.Plus_next == null && SearcWord == false) {
                    temp.Plus_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.Plus_next.before = temp;
                }
                return temp.Plus_next;
            case '&':
                if (temp.AmpersandSign_next == null && SearcWord == false) {
                    temp.AmpersandSign_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.AmpersandSign_next.before = temp;
                }
                return temp.AmpersandSign_next;
            case '!':
                if (temp.Exclamation_next == null && SearcWord == false) {
                    temp.Exclamation_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.Exclamation_next.before = temp;
                }
                return temp.Exclamation_next;
            case '/':
                if (temp.Slash_next == null && SearcWord == false) {
                    temp.Slash_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.Slash_next.before = temp;
                }
                return temp.Slash_next;
            case '@':
                if (temp.Tailed_A_next == null && SearcWord == false) {
                    temp.Tailed_A_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.Tailed_A_next.before = temp;
                }
                return temp.Tailed_A_next;
            case '#':
                if (temp.NumberSign_next == null && SearcWord == false) {
                    temp.NumberSign_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.NumberSign_next.before = temp;
                }
                return temp.NumberSign_next;
            case '¥':
                if (temp.YenSign_next == null && SearcWord == false) {
                    temp.YenSign_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.YenSign_next.before = temp;
                }
                return temp.YenSign_next;
            case '\'':      // --> char of ' 
                if (temp.Apostrophe_next == null && SearcWord == false) {
                    temp.Apostrophe_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.Apostrophe_next.before = temp;
                }
                return temp.Apostrophe_next;

            case '?':
                if (temp.QuestionMark_next == null && SearcWord == false) {
                    temp.QuestionMark_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.QuestionMark_next.before = temp;
                }
                return temp.QuestionMark_next;
            case '=':
                if (temp.Equal_next == null && SearcWord == false) {
                    temp.Equal_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.Equal_next.before = temp;
                }
                return temp.Equal_next;
            case ' ':
                if (temp.Space_next == null && SearcWord == false) {
                    temp.Space_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.Space_next.before = temp;
                }
                return temp.Space_next;
            case '(':
                if (temp.LeftBraces_next == null && SearcWord == false) {
                    temp.LeftBraces_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.LeftBraces_next.before = temp;
                }
                return temp.LeftBraces_next;
            case ')':
                if (temp.RightBraces_next == null && SearcWord == false) {
                    temp.RightBraces_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.RightBraces_next.before = temp;
                }
                return temp.RightBraces_next;
            case '-':
                if (temp.Hyphen_next == null && SearcWord == false) {
                    temp.Hyphen_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.Hyphen_next.before = temp;
                }
                return temp.Hyphen_next;
            case '.':
                if (temp.Dot_next == null && SearcWord == false) {
                    temp.Dot_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.Dot_next.before = temp;
                }
                return temp.Dot_next;
            case ':':
                if (temp.DoubleDot_next == null && SearcWord == false) {
                    temp.DoubleDot_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.DoubleDot_next.before = temp;
                }
                return temp.DoubleDot_next;
            case '0':
                if (temp._0_next == null && SearcWord == false) {
                    temp._0_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp._0_next.before = temp;
                }
                return temp._0_next;
            case '1':
                if (temp._1_next == null && SearcWord == false) {
                    temp._1_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp._1_next.before = temp;
                }
                return temp._1_next;
            case '2':
                if (temp._2_next == null && SearcWord == false) {
                    temp._2_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp._2_next.before = temp;
                }
                return temp._2_next;
            case '3':
                if (temp._3_next == null && SearcWord == false) {
                    temp._3_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp._3_next.before = temp;
                }
                return temp._3_next;
            case '4':
                if (temp._4_next == null && SearcWord == false) {
                    temp._4_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp._4_next.before = temp;
                }
                return temp._4_next;
            case '5':
                if (temp._5_next == null && SearcWord == false) {
                    temp._5_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp._5_next.before = temp;
                }
                return temp._5_next;
            case '6':
                if (temp._6_next == null && SearcWord == false) {
                    temp._6_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp._6_next.before = temp;
                }
                return temp._6_next;
            case '7':
                if (temp._7_next == null && SearcWord == false) {
                    temp._7_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp._7_next.before = temp;
                }
                return temp._7_next;
            case '8':
                if (temp._8_next == null && SearcWord == false) {
                    temp._8_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp._8_next.before = temp;
                }
                return temp._8_next;
            case '9':
                if (temp._9_next == null && SearcWord == false) {
                    temp._9_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp._9_next.before = temp;
                }
                return temp._9_next;
            default:
                showMessage("Unknown Character :|" + Char + "|  --> word :" + word);

        }
        return null;
    }

    public void SearchWord(String word) { // if there is any word with meaning this function returns  meaning
        SearcWord = true;
        Node temp = this.first;
        if (this.first == null) {
            System.out.println("No words have been added yet");
        } else {
            counterOfWordIndex = 0;
            while (counterOfWordIndex < word.length()) {
                temp = GoToLastIndex(word.charAt(counterOfWordIndex), temp);//temp=temp.(A-Z)_next;
                counterOfWordIndex++;
                if (temp == null) {
                    System.out.println(word + " --> The word you are looking for has not been added ");
                    return;
                }
            }
            if (temp.Meaning != null) {
                System.out.println("the meaning of the word you are looking for : " + temp.Meaning.data);
            } else {
                System.out.println(word + " --> The word you are looking for has not been added");
            }
        }
    }

    public void PrintAllWordsWithMeanings() {
        /*
        this is hard to explain. Maybe I will explain in   Read me or something like that 
         */
        int WordCounter = 1;
        Node temp = this.first;
        SearcWord = true;
        List<Integer> IntegerList = new ArrayList<Integer>();

        if (this.first == null) {
            System.out.println("No words have been added yet");
        } else {
            IntegerList.add(0, 0);

            counterOfWordIndex = 0; // alfabe
            while (IntegerList.get(0) < 26) {

                if (counterOfWordIndex == 26) {
                    if (temp.before == null) {
                        return;
                    }
                    temp = temp.before;

                    if (IntegerList.size() > 1) {
                        IntegerList.remove(IntegerList.size() - 1);
                        IntegerList.set(IntegerList.size() - 1,
                                IntegerList.get(IntegerList.size() - 1) + 1);
                        counterOfWordIndex = IntegerList.get(IntegerList.size() - 1);
                    } else {
                        IntegerList.set(0, IntegerList.get(0) + 1);
                        counterOfWordIndex = IntegerList.get(0);
                    }
                } else {
                    Node tempControl = null;
                    while (counterOfWordIndex < 26) {

                        tempControl = GoToLastIndex(new CharacterCalculation().CharacterCalculate(counterOfWordIndex), temp);

                        if (tempControl != null) {

                            IntegerList.set(IntegerList.size() - 1, counterOfWordIndex);
                            temp = tempControl;
                            IntegerList.add(0);
                            counterOfWordIndex = IntegerList.get(IntegerList.size() - 1);
                            if (temp.Meaning != null) {
                                int MeaningCounter = 1;
                                if (temp.Meaning.next == null) {
                                    System.out.print(WordCounter + "-) " + temp.data + " : " + temp.Meaning.data);
                                } else {
                                    System.out.print(WordCounter + "-) " + temp.data + " : ");
                                    while (temp.Meaning != null) {
                                        System.out.print(MeaningCounter + ") " + temp.Meaning.data + " | ");
                                        temp.Meaning = temp.Meaning.next;
                                        MeaningCounter++;
                                    }
                                }

                                System.out.println("");

                                WordCounter++;
                            }
                            counterOfWordIndex = 0;

                        } else {
                            counterOfWordIndex++;
                        }
                    }

                }

            }
        }

    }

    public void showMessage(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public void showMessage(int text) {
        JOptionPane.showMessageDialog(null, text);

    }
}
