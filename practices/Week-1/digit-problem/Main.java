import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();

        while(number != 0) {
            //Hold a remainder which is last index of number
            //And divide
            sum += number % 10;
            number /= 10;
        }
        System.out.printf("Basamak sayıları toplamı : %d", sum);
    }
}