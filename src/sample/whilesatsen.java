package sample;

import javax.swing.*;

public class whilesatsen {
    public static void main(String[] args) {
        int k = 0;
        String s = "k:";
        while (k < 10) {s = s + " " + k;
        k = k + 2;
        }
        JOptionPane.showMessageDialog(null, s);
    }
}