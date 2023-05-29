import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String word){
        String reverse = "";
        for(int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if(reverse.equals(word)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = input.nextLine();

        if(isPalindrome(word)) {
            System.out.printf("%s is palindrome.", word);
        } else {
            System.out.printf("%s is not palindrome.", word);
        }
    }
}
