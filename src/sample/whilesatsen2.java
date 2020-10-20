package sample;

import javax.swing.*;

public class whilesatsen2 {
    public static void main(String[] args) {
      double totalArea = 10000;
      double area = 0.01;
      int dygn = 1;
      while (area < totalArea){
          area = area * 2;
          dygn = dygn +1;
      }
      JOptionPane.showMessageDialog(null,"Sjön blir täckt efter " + dygn + "dygn");

    }
}
