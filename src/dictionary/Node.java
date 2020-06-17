package dictionary;

import javax.swing.JOptionPane;

public class Node {

    public String data;
    public Node Meaning;
    public Node before;
    public Node next;// used to add much more of Meaning;
    public Node A_next, B_next, C_next, D_next, E_next, F_next, G_next, H_next, I_next, J_next, K_next,
            L_next, M_next, N_next, O_next, P_next, Q_next, R_next, S_next, T_next, U_next, V_next, W_next, X_next,
            Y_next, Z_next, Space_next, _0_next, _1_next, _2_next, _3_next, _4_next, _5_next, _6_next, _7_next,
            _8_next, _9_next,
            Apostrophe_next,        //  "'"
            NumberSign_next,        //  "#"
            YenSign_next,           //  "¥"
            Tailed_A_next,          //  "@"
            QuestionMark_next,      //  "?"
            Exclamation_next,       //  "!"
            AmpersandSign_next,     //  "&"
            Equal_next,             //  "="
            Plus_next,              //  "+"
            LeftBraces_next,        //  "("
            RightBraces_next,       //  ")"
            Dot_next,               //  "."
            DoubleDot_next,         //  ":"
            Hyphen_next,            //  "-"
            Slash_next,             //  "-"
            OO_next,                //  "ö" 
            II_next,                //  "ı"
            UU_next,                //  "ü"
            CC_next,                //  "ç"
            SS_next,                //  "ş"
            GG_next;                //  "ğ"
            
    
    //abcdefghijklmnopqrstuvwxyz  // --> alphabet

    public void showMessage(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public void showMessage(int text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public Node() {
        this.data = "";
        this.A_next = null;
        this.next = null;
    }

    public Node(String data) {
        //System.out.println("Olaki hata alırsan Node constructorda .next = null yap");
        this.data = data;
        //  this.A_next = null;
        //   this.next = null;
    }

    /*public Node(char Chracter) {

        this.Chracter = Chracter;
        this.before = null;
        this.next = null;
    }*/
}
