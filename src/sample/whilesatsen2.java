package sample;

import javax.swing.*;

public class whilesatsen2 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("n?");
        int n = Integer.parseInt(s);
        int summa = 0;
        int k=1;
            while (k <= n) {
                summa = summa + k;
                k = n + (k * k);
            }
            JOptionPane.showMessageDialog(null, "Summan blir " + summa);
    }
}
