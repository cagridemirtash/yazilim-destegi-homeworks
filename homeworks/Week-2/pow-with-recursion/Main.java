import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int pow(int number, int powOfNumber) {
        if(powOfNumber == 0) {
            return 1;
        }
        return number * pow(number,powOfNumber - 1);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number , powOfNumber;
        do {
            System.out.print("Sayıyı giriniz : ");
            number = input.nextInt();
            System.out.print("Üssü giriniz : ");
            powOfNumber = input.nextInt();
        } while(number == 0);

        int result = pow(number,powOfNumber);
        System.out.println("Sonuç : " + result);
    }
}