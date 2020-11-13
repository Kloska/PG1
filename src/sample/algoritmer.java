package sample;

import javax.swing.*;

public class algoritmer {
    public static void main(String[] args) {
        int n = (Integer.parseInt(JOptionPane.showInputDialog("Välj ett tal n")));
        int summa = 0;
        int k = 1;

        while (k <= n) {
            summa = summa + k;
            k = k + 1;
        }
        System.out.println("Summan blir " + summa);
    }
}
