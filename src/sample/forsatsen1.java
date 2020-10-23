package sample;

import javax.swing.*;

public class forsatsen1 {
    public static void main(String[] args) {
        int k = 0;
        String s = "k:";
        for (k=0; k<6; k=k+2) {
            s = s + " " + k;
            k = k + 2;
        }
        JOptionPane.showMessageDialog(null, s);
    }
}
