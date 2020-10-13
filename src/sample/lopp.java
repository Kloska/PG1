package sample;

import javax.swing.*;

public class lopp {
    public static void main(String[] args) {
        double t1 = Integer.parseInt(JOptionPane.showInputDialog("Tid 1"));
        double t2 = Integer.parseInt(JOptionPane.showInputDialog("Tid 2"));
        double d = t1 - t2;
            if (d < 0)
                d = -d;
            JOptionPane.showMessageDialog(null,"Tidsskillnad: "+ d +" sek");
    }
}
