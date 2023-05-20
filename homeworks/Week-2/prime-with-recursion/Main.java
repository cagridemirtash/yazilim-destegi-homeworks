import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static boolean IsPrime(int number, int dividor) {
        if(number <= 2) {
            return number == 2 ? true : false ;
        }
        if(number % dividor == 0) {
            return false;
        }
        //The recursion finished when the dividor equal to number - 1.
        //Because if number == dividor, the statement always false.
        if(number - 1 == dividor) {
            return true;
        }
        return IsPrime(number,dividor + 1);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.print("Sayıyı giriniz : ");
            number = input.nextInt();
        } while(number == 0);

        if(IsPrime(number, 2)) {
            System.out.println(number + " sayısı asaldır.");
        } else{
            System.out.println(number + " sayısı asal değildir");
        }
    }
}