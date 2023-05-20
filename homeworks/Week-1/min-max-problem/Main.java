import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfInput, max = 0, min = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı giriceksiniz : ");
        numberOfInput = input.nextInt();

        for(int i = 1; i <= numberOfInput;i++){
            System.out.print(i + ". Sayıyı giriniz : ");
            int number = input.nextInt();
            if(number > max) {
                max = number;
            }
            if(min > number) {
                min = number;
            }
        }
        System.out.printf("En büyük sayı: %d%n",max);
        System.out.printf("En küçük sayı: %d",min);
    }
}