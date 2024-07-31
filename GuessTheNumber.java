import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to Guess the Number!");
        System.out.println("Select a difficulty level:");
        System.out.println("1. Simple (1-20)");
        System.out.println("2. Hard (1-50)");
        System.out.println("3. Difficult (1-100)");
        System.out.print("Enter your choice (1, 2, or 3): ");
        
        int choice = scanner.nextInt();
        int range = 0;
        
        switch (choice) {
            case 1:
                range = 20;
                break;
            case 2:
                range = 50;
                break;
            case 3:
                range = 100;
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Simple (1-20).");
                range = 20;
        }
        
        int numberToGuess = random.nextInt(range) + 1;
        int numberOfAttempts = 0;
        int userGuess = 0;
        
        System.out.println("I have chosen a number between 1 and " + range + ". Try to guess it!");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}
