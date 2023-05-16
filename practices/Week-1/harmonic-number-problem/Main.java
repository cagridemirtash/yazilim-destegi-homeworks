import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        double sum = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Range'i giriniz : ");
        number = input.nextInt();

        for(int i = 1; i <= number; i++) {
            sum += 1 / (double)(i);
        }

        System.out.printf("Harmonik seri sonucu : %.2f", sum);
    }
}