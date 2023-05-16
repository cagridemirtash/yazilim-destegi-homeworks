import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı büyüklüğünü giriniz : ");
        number = input.nextInt();
        //High side of triangle.
        //Add space equal to number minus index -> If number is 4 add 4 space on 0 index.
        for(int i = 0; i <= number; i++) {
            for(int k = 0; k < number - i; k++) {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Reverse pattern for diamond
        for(int i = number; i > 0;i--) {
            // i starts from inputNumber size. for example, 4
            // Fill the lower side of the triangle with equal to lastIndex - 1 shape of triangle.
            for(int k = 0; k < number - i + 1; k++) {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (2 * i - 1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}