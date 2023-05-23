import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len;
        System.out.print("Dizinin uzunluğunu giriniz : ");
        len = input.nextInt();
        int[] numbers = new int[len];

        for(int i=0; i<len; i++) {
            System.out.print((i + 1) + ". elemanı giriniz : ");
            numbers[i] = input.nextInt();
        }

        double result = calculateHarmonicAverage(numbers);
        System.out.printf("Dizinin harmonik ortalaması : %.2f",result);
    }

    static double calculateHarmonicAverage(int[] numbers) {
        double sum = 0.0;
        for(int number : numbers) {
            sum += 1.0 / number ;
        }
        return numbers.length / sum;
    }
}