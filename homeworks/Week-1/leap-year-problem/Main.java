import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int inputYear;
        Scanner input = new Scanner(System.in);
        //If inputYear variable is fit condition, inputYear is a leap year
        //If not, inputYear is not a leap year
        boolean isLeapYear = false;

        System.out.print("Yıl Giriniz : ");
        inputYear = input.nextInt();
        //Conditions
        if(inputYear % 4 == 0 && inputYear % 100 != 0) {
            isLeapYear = true;
        } else if(inputYear % 400 == 0) {
            isLeapYear = true;
        }

        if(isLeapYear) {
            System.out.printf("%d bir artık yıldır !", inputYear);
        } else {
            System.out.printf("%d bir artık yıl değildir !", inputYear);
        }
    }
}