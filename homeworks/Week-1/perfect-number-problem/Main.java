import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int perfectNumber, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz : ");
        perfectNumber = input.nextInt();

        for(int i = 1; i <= perfectNumber; i++) {
            if(perfectNumber % i == 0) {
                sum += i;
            }
        }
        if(sum == (2 * perfectNumber)) {
            System.out.printf("%d mükemmel sayıdır.", perfectNumber);
        } else {
            System.out.printf("%d mükemmel sayı değildir.",perfectNumber);
        }
    }
}