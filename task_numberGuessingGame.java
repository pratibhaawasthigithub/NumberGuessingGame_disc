package task1_numberGuessingGame;

import java.util.Scanner;

public class task_numberGuessingGame {

    public static void main(String[] args) {
        System.out.println("Let's play a game.  I'll pick a number between");
        System.out.println("1 and 100, and you try to guess it.");
        Scanner sc1 = new Scanner(System.in);
        boolean playAgain;
        do {
            playGame();
            System.out.println("Would you like to play again?Y/N");
            playAgain = sc1.nextBoolean();
        } while (playAgain);
        System.out.println("Thanks for playing.Goodbye.");
    }

    public static void playGame() {
        int c;
        int u;
        int g;
        c = 1 + (int) (100 * Math.random());
        g = 0;
        System.out.println();
        System.out.println("What is your first guess?");
        Scanner sc = new Scanner(System.in);
        while (true) {
            u = sc.nextInt();
            g++;
            if (u == c) {
                System.out.println("You got it in " + g
                        + " guesses!  My number was " + c);
                break;
            }
            if (g == 6) {
                System.out.println("You didn't get the number in 6 guesses.");
                System.out.println("You lose.  My number was " + c);
                break;
            }
            if (u < c)
                System.out.println("That's too low.  Try again:");
            else if (u > c)
                System.out.println("That's too high.  Try again:");
        }
        System.out.println();
    }

}