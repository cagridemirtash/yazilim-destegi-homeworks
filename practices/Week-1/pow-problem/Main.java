import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int range;
        Scanner input = new Scanner(System.in);

        //Execute the loop statement which is range is less than i.
        System.out.print("Sayıyı giriniz : ");
        range = input.nextInt();
        for(int i = 1; i<=range; i *= 4) {
            if(i < range) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Same as the above for.
        for(int i = 1; i<=range; i *= 5) {
            if(i < range) {
                System.out.print(i + " ");
            }
        }
    }
}