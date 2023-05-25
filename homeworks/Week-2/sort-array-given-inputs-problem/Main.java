import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lengthOfArr;

        System.out.print("Dizinin boyutunu giriniz : ");
        lengthOfArr = input.nextInt();
        int[] arr = new int[lengthOfArr];
        System.out.println("Dizinin elemanları giriniz : ");
        //Fill blank array with given input size from user.
        for(int i = 0; i<lengthOfArr; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            arr[i] = input.nextInt();
        }
        //Sort array min to max.
        Arrays.sort(arr);
        System.out.print("Sıralama : ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}