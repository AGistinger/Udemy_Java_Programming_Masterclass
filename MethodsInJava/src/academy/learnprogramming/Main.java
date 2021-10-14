package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Alex", calculateHighScorePosition(1500));
        displayHighScorePosition("Jessica", calculateHighScorePosition(900));
        displayHighScorePosition("Gianna", calculateHighScorePosition(400));
        displayHighScorePosition("Sienna", calculateHighScorePosition(50));
    }

    // Must start code for method outside of other methods, but inside the class
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus) + 1000;
            return finalScore;
        }
        // Negative 1 is conventionally used to show an error
        return -1;
    }

    /*
      Create a method called displayHighScorePosition
      It should receive a players name as a parameter, and a 2nd parameter as a position
      in the high score table.  You should display the players name along with the message
      " managed to get into position" and the position they got and a further message
      "on the high score table".

      Create a 2nd method called calculateHighScorePosition
      it should be sent one argument only, the player score.
      it should return an int
      the return data should be
      1 if the score is > 1000
      2 if the score is > 500 and < 1000
      3 if the score is > 100 and < 500
      4 in all other cases
      call both methods and display the results of the following
      a score of 1500, 900, 400, and 50.
     */
    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
        if(score >= 1000) {
            return 1;
        } else if(score >= 500) {
            return 2;
        } else if(score >= 100) {
            return 3;
        }
        return 4;
    }
}
