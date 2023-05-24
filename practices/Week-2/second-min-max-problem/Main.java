import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {15,12,788,1,-1,-778,2,0};
        int findNumber;
        System.out.println(Arrays.toString(numbers));
        System.out.print("Sayıyı giriniz : ");
        findNumber = input.nextInt();

        int secondMax = numbers[0], secondMin = numbers[0];
        int diff, tmpDiff = 0;

        for(int number : numbers) {
            diff = Math.abs(number - findNumber);
            if(number > findNumber) {
                if(tmpDiff > diff) {
                    secondMax = number;
                }
            }
            if(number < findNumber) {
                if(tmpDiff > diff) {
                    secondMin = number;
                }
            }
            tmpDiff = diff;
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + secondMin);
        System.out.print("Girilen sayıdan büyük en yakın sayı : " + secondMax);
    }
}
