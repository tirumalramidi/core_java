package feb7;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");

        while (true) {
            System.out.print("Enter your guess (between 1 and 100): ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess! Please enter a number between 1 and 100.");
                continue;
            }

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly!");
                System.out.println("Number of attempts: " + attempts);
                break;
            }
        }

        scanner.close();
    }
}
