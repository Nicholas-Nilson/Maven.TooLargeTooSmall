/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        //For User Input
        Scanner numScan = new Scanner(System.in);
        Scanner guess = new Scanner(System.in);

        //To Generate a random # from 1-100.
        int winningNum = 1 +(int)(100 * Math.random());
//        System.out.print(winningNum);

        //Variables for current guess, and number of attempts.
        int currentGuess;
        int lastGuess = 0;
        int numAttempts = 5;

        System.out.println("Guess a number from 1-100. You have " + numAttempts + " attempts remaining.");
        currentGuess = guess.nextInt();

        while (currentGuess != winningNum && numAttempts > 0) {
            if (currentGuess == lastGuess) {
                System.out.println("Please enter a different number than previous guess");
                currentGuess = guess.nextInt();
            } else if (currentGuess < winningNum) {
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

            } else {
                System.out.println("Congratulations you have guessed the winning number: " + winningNum + ". In " 5 - numAttempts + "guesses.");
            }
        }
    }

}
