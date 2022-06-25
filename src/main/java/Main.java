/**
 * Created by iyasuwatts on 10/17/17.
 */
//Jun 24 2022. My goal for revisiting this in the future is to
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //For User Input
        Scanner numScan = new Scanner(System.in);
        Scanner guess = new Scanner(System.in);

        //To Generate a random # from 1-100.
        int winningNum = 1 + (int) (100 * Math.random());
//        System.out.print(winningNum);

        //Variables for current guess, and number of attempts.
        int currentGuess;
        int lastGuess = 0;
        int numAttempts = 7;

        System.out.println("Guess a number from 1-100. You have " + numAttempts + " guesses remaining.");
        currentGuess = guess.nextInt();

        //A series of if & else if statements would accomplish the same job, I wanted try writing a while loop. Will eventually try changing to methods.
        //We continue playing the game while there are attempts & the guess is wrong.
        while (currentGuess != winningNum && numAttempts > 1) {
            if (currentGuess == lastGuess) { //this block is to check whether a user is consecutively repeating a guess.
                System.out.println("Please enter a different number than previous guess");
                currentGuess = guess.nextInt();
            } else if (currentGuess < winningNum) { //more info here for user, reducing attempts, and updating lastGuess
                numAttempts--;
                System.out.println("Your guess of " + currentGuess + " is too low. You have " + numAttempts + " guesses remaining");
                System.out.println("Please guess again.");
                lastGuess = currentGuess;
                currentGuess = guess.nextInt();

            } else if (currentGuess > winningNum) {
                numAttempts--;
                System.out.println("Your guess of " + currentGuess + " is too high. You have " + numAttempts + " guesses remaining.");
                System.out.println("Please guess again.");
                lastGuess = currentGuess;
                currentGuess = guess.nextInt();

            }
        }
        System.out.println("Congratulations! You have guessed the winning number: " + winningNum + " in " + (8 - numAttempts) + " guesses.");

    }

}
