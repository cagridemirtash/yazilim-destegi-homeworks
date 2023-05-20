import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(int i = 2; i<100; i++) {
            boolean isPrime = true;
            //Iterate for loop for each value of i.
            //If iterate found the condition true, number is not prime
            //Otherwise, number is prime.
            for(int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}