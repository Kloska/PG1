import javax.swing.*;

public class uppgift81 {
    public static void main(String[] args) {
        try {
            double input = Integer.parseInt(JOptionPane.showInputDialog("Skriv ett tal"));
        } catch(Exception e) {
            double input = Integer.parseInt(JOptionPane.showInputDialog("ANVÄND ENDAST SIFFOR!"));
        }

    }
}
