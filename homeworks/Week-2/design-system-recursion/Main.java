import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //First, print whole number which is subtracting 5 one by one until number is equal or less than to 0.
    //Second, control the number if equal or less than to 0, call printBack function (start from number + 5 actually).
    //Last, print 0 to real number and finished.
    static void print(int number, int realNumber) {
        System.out.print(number + " ");
        if(number <= 0) {
            printBack(number + 5, realNumber);
            return;
        }
        print(number - 5, realNumber);
    }
    static void printBack(int number, int realNumber) {
        System.out.print(number + " ");
        if(number >= realNumber) {
            return;
        }
        printBack(number + 5, realNumber);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Sayıyı giriniz : ");
        number = input.nextInt();

        print(number, number);
    }
}