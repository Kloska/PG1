package sample;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class IterationerDiagnos {
    public static void main(String[] args) {

        String s = "Tabellen:";
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Vilken tabell vill du räkna?"));
        int k = 1;

        while (k < 11){
            s = s + " " + n;
            n = n * k;
            k = k++;
        }
        JOptionPane.showMessageDialog(null, s);
    }
}
