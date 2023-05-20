import java.util.Scanner;

public class Main {
    static boolean isPalindrome(int number) {
        int reverse = reverseNumber(number);
        if(reverse == number) {
            return true;
        }
        return false;
    }

    static int reverseNumber(int number) {
        int reverseNumber = 0, lastNumber;
        while(number != 0) {
            lastNumber = number % 10;
            reverseNumber = reverseNumber * 10 + lastNumber;
            number /= 10;
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Sayıyı giriniz : ");
        number = input.nextInt();

        if(isPalindrome(number)) {
            System.out.println(number+" bir palindrome sayıdır.");
        } else{
            System.out.println(number+" bir palindrome sayı değildir.");
        }
    }
}