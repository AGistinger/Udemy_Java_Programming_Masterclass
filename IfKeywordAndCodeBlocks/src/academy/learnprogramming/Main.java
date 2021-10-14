package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        // The use of code blocks is optional in an if statement if there is only one line of code
        if(score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000, but greater than 1000");
        }else if (score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        /*
            Print out a second score on the screen with the following:
            * score set to 10000
            * levelCompleted set to 8
            * bonus set to 200
            * But make sure the first printout still displays as well
         */
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
