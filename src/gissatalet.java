import javafx.beans.binding.When;

import javax.swing.*;

public class gissatalet {
    public static void main(String[] args) {
       double random = Math.random()*100;
      double input = Integer.parseInt(JOptionPane.showInputDialog("Gissa på ett tal mellan 1-100"));

      //while(true){

      //}
       if(random == input){

       }
        System.out.println("Rätt svar!" + "Du gissade rätt efter" + "gissningar.");
    }
}
