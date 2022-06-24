import java.awt.*;
import java.util.Objects;
import java.util.Scanner;

public class Game {
    public static Character rockPaperScissors(char player1Choice, char player2Choice) {

        if (player1Choice == player2Choice) {
            System.out.println("Tie");
            return null;
        }
        if (player1Choice == 'R' && player2Choice == 'S') {
            System.out.println("The winner is: Player 1");
            return player1Choice;

        }
        if (player1Choice == 'P' && player2Choice == 'R') {
            System.out.println("The winner is: Player 1");
            return player1Choice;

        }
        if (player1Choice == 'S' && player2Choice == 'P') {
            System.out.println("The winner is: Player 1");
            return player1Choice;
        }

        if (player1Choice == 'P' && player2Choice == 'S') {
            System.out.println("The winner is: Player 2");
            return player2Choice;
        }

        if (player1Choice == 'R' && player2Choice == 'P') {
            System.out.println("The winner is: Player 2");
            return player2Choice;
        }
        if (player1Choice == 'S' && player2Choice == 'R') {
            System.out.println("The winner is: Player 2");
            return player2Choice;
        }

        return null;
    }

    public static void main(String[] args) {
        rockPaperScissors('R', 'R');

    }

}