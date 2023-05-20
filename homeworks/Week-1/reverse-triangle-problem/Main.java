import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz : ");
        number = input.nextInt();
        //Execute each number which is decreased one by one.
        //For loop take a number and each iteration will be less than before iteration.
        while(number > 0) {
            for(int i = 1; i<=number;i++){
                System.out.print("*");
            }
            System.out.println();
            number--;
        }
    }
}