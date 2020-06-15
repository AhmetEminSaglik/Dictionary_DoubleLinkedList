package dictionary;

import javax.swing.JOptionPane;

public class Node {

    public String data;
    public Node Meaning;
    public Node before;
    public Node next;// used to add much more of Meaning;
    public Node A_next, B_next, C_next, D_next, E_next, F_next, G_next, H_next, I_next, J_next, K_next,
            L_next, M_next, N_next, O_next, P_next, Q_next, R_next, S_next, T_next, U_next, V_next, W_next, X_next,
            Y_next, Z_next;
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
