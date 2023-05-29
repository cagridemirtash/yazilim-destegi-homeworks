import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randomNum = (int)(Math.random() * 100);
        int[] guessNumbers = new int[5];
        int guess, count = 0;
        do {
            System.out.print("Enter your guess : ");
            guess = input.nextInt();
            if(guess > 0 && guess < 100) {
                if(guess == randomNum) {
                    System.out.println("Congratulations, you win");
                    break;
                } else if(guess < randomNum) {
                    System.out.println("Your guess is low.");
                    guessNumbers[count++] = guess;
                } else if(guess > randomNum) {
                    System.out.println("Your guess is high from number.");
                    guessNumbers[count++] = guess;
                }
            } else {
                System.out.println("Your guess is wrong. Try again");
            }
        }while(count<5);
        System.out.println("Actual win number : " + randomNum);
        System.out.println("Your guesses : " + Arrays.toString(guessNumbers));
    }
}
