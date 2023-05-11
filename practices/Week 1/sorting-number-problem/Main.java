import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        firstNumber = input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        secondNumber = input.nextInt();

        System.out.print("Üçüncü sayıyı giriniz : ");
        thirdNumber = input.nextInt();

        if(thirdNumber > firstNumber && thirdNumber > secondNumber) {
            if(firstNumber > secondNumber) {
                System.out.printf("%d<%d<%d",secondNumber,firstNumber,thirdNumber);
            } else {
                System.out.printf("%d<%d<%d",firstNumber,secondNumber,thirdNumber);
            }
        } else if(secondNumber > thirdNumber && secondNumber > firstNumber) {
            if(thirdNumber > firstNumber) {
                System.out.printf("%d<%d<%d",firstNumber,thirdNumber,secondNumber);
            } else {
                System.out.printf("%d<%d<%d",thirdNumber,firstNumber,secondNumber);
            }
        } else {
            if(thirdNumber > secondNumber) {
                System.out.printf("%d<%d<%d",secondNumber,thirdNumber,firstNumber);
            } else {
                System.out.printf("%d<%d<%d",thirdNumber,secondNumber,firstNumber);
            }
        }
    }
}