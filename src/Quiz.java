import javax.swing.*;

public class Quiz {
    public static void main(String[] args) {
        String[] choices = { "A - Banan", "B - Apelsin", "C - Äpple"};
        String input = (String) JOptionPane.showInputDialog(null, "Vilken frukt är gul?",
                "Quiz",JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
        System.out.println(input);
        if("A - Banan".equals(input));
        System.out.println("Rätt svar!");
    }
}
