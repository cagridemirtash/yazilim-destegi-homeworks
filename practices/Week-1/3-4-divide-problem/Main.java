import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range, sum = 0;

        System.out.print("Sayı giriniz : ");
        range = input.nextInt();

        for(int i = 1; i <= range; i++) {
            if(i % 3 == 0 && i % 4 == 0) {
                sum += i;
            }
        }
        System.out.println("3 ile 4'e bölümünden kalan 0 olan sayıların toplamı : " + sum);
    }
}