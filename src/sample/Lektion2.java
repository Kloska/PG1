package sample;

import javax.swing.*;

public class Lektion2 {
    public static void main(String[] args) {
        int temp = Integer.parseInt(JOptionPane.showInputDialog(null, "Hur varmt är det?"));
        if(temp < 18)
            JOptionPane.showMessageDialog(null, "sätt på värmen");
    }
}