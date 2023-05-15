import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, pow, result = 1;
        Scanner input = new Scanner(System.in);
        //Taken inputs from user
        System.out.print("Sayıyı giriniz : ");
        number = input.nextInt();
        System.out.print("Üs sayısını giriniz : ");
        pow = input.nextInt();
        //Calculate result this statement -> pow times multiplication of the base number
        for (int i = 1; i <= pow; i++) {
            result *= number;
        }
        System.out.printf("%d üzeri %d = %d", number, pow, result);
    }

}