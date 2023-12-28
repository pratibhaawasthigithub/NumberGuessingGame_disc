package NumberGuessingGame;

import javax.swing.*;

public class numberGuessingGame1 {
    public static void main(String[] args) {
        int c = 1 + (int) (100 * Math.random());
        int u = 0;
        System.out.println("the correct guess would you be :" + c);
        int co = 1;
        // public static String determineGuessing(int u,int c,int co);{
        while (u != c) {
            String r = JOptionPane.showInputDialog(null, "enter a guess between 1 and 100");
            u = Integer.parseInt(r);
            JOptionPane.showMessageDialog(null, " " + determineGuessing(u, c, co));
        }

    }

    public static String determineGuessing(int u, int c, int co) {
        if (u <= 0 || u > 100) {
            return "your Guess is invalid";
        } else if (u == c) {
            return "correct!\n Total Guesses:" + co;
        } else if (u > c) {
            return "your Guess is to high,try again,\n try number:" + co;
        } else if (u < c) {
            return "your Guess is too loow,try again,\n try number:" + co;
        } else {
            return "your Guess is incorrect \n try number:" + co;
        }
    }
}
