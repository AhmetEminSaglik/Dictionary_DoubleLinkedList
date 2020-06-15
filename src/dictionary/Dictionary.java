package dictionary;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Dictionary {

    private boolean SearcWord = false;
    String word;
    public Node first;
    int counterOfWordIndex = 0;

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
        word = word.toLowerCase();
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
                if (temp.A_next == null && SearcWord == false) {
                    temp.A_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.A_next.before = temp;

                }
                return temp.A_next;

            case 'b':
                if (temp.B_next == null && SearcWord == false) {
                    temp.B_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.B_next.before = temp;
                }
                return temp.B_next;

            case 'c':
                if (temp.C_next == null && SearcWord == false) {

                    temp.C_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.C_next.before = temp;
                }
                return temp.C_next;

            case 'd':
                if (temp.D_next == null && SearcWord == false) {
                    temp.D_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.D_next.before = temp;
                }
                return temp.D_next;

            case 'e':
                if (temp.E_next == null && SearcWord == false) {
                    temp.E_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.E_next.before = temp;
                }
                return temp.E_next;
            case 'f':
                if (temp.F_next == null && SearcWord == false) {
                    temp.F_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.F_next.before = temp;
                }
                return temp.F_next;
            case 'g':
                if (temp.G_next == null && SearcWord == false) {
                    temp.G_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.G_next.before = temp;
                }
                return temp.G_next;
            case 'h':
                if (temp.H_next == null && SearcWord == false) {
                    temp.H_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.H_next.before = temp;
                }

                return temp.H_next;
            case 'i':
                if (temp.I_next == null && SearcWord == false) {
                    temp.I_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.I_next.before = temp;

                }
                return temp.I_next;
            case 'j':
                if (temp.J_next == null && SearcWord == false) {
                    temp.J_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.J_next.before = temp;
                }
                return temp.J_next;
            case 'k':
                if (temp.K_next == null && SearcWord == false) {
                    temp.K_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.K_next.before = temp;
                }
                return temp.K_next;
            case 'l':
                if (temp.L_next == null && SearcWord == false) {
                    temp.L_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.L_next.before = temp;
                }
                return temp.L_next;
            case 'm':
                if (temp.M_next == null && SearcWord == false) {
                    temp.M_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.M_next.before = temp;
                }
                return temp.M_next;
            case 'n':
                if (temp.N_next == null && SearcWord == false) {
                    temp.N_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.N_next.before = temp;
                }
                return temp.N_next;
            case 'o':
                if (temp.O_next == null && SearcWord == false) {
                    temp.O_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.O_next.before = temp;
                }
                return temp.O_next;
            case 'p':
                if (temp.P_next == null && SearcWord == false) {
                    temp.P_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.P_next.before = temp;
                }
                return temp.P_next;
            case 'q':
                if (temp.Q_next == null && SearcWord == false) {
                    temp.Q_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.Q_next.before = temp;
                }
                return temp.Q_next;
            case 'r':
                if (temp.R_next == null && SearcWord == false) {
                    temp.R_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.R_next.before = temp;
                }
                return temp.R_next;
            case 's':
                if (temp.S_next == null && SearcWord == false) {
                    temp.S_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.S_next.before = temp;
                }
                return temp.S_next;
            case 't':
                if (temp.T_next == null && SearcWord == false) {
                    temp.T_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.T_next.before = temp;
                }
                return temp.T_next;
            case 'u':
                if (temp.U_next == null && SearcWord == false) {
                    temp.U_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.U_next.before = temp;
                }
                return temp.U_next;
            case 'v':
                if (temp.V_next == null && SearcWord == false) {
                    temp.V_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.V_next.before = temp;
                }
                return temp.V_next;
            case 'w':
                if (temp.W_next == null && SearcWord == false) {
                    temp.W_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.W_next.before = temp;
                }
                return temp.W_next;
            case 'x':
                if (temp.X_next == null && SearcWord == false) {
                    temp.X_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.X_next.before = temp;
                }
                return temp.X_next;
            case 'y':
                if (temp.Y_next == null && SearcWord == false) {
                    temp.Y_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.Y_next.before = temp;
                }
                return temp.Y_next;
            case 'z':
                if (temp.Z_next == null && SearcWord == false) {
                    temp.Z_next = new Node(getTextToIndex(counterOfWordIndex));
                    temp.Z_next.before = temp;
                }
                return temp.Z_next;
            default:
                showMessage("Unknown Character");

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
