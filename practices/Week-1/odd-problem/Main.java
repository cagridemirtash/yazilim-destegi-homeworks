import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int range, sum = 0;
        Scanner input = new Scanner(System.in);

        //do-while loop iterate up to range is odd number.
        //When the range divided by 4 without remainder, sum is increasing.
        do {
            System.out.print("Sayı giriniz : ");
            range = input.nextInt();
            if(range % 4 == 0) {
                sum += range;
            }
        } while(range % 2 == 0);

        System.out.printf("Toplam değeri = %d", sum);
    }
}