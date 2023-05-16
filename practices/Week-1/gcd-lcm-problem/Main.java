import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberFirst, numberSecond, gcd = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        numberFirst = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        numberSecond = input.nextInt();
        
        int index = 1;
        while(index < Math.min(numberFirst,numberSecond)) {
            if(numberFirst % index == 0 && numberSecond % index == 0) {
                gcd = index;
            }
            index++;
        }
        //Least Common Multiple Calculate towards this formula -> lcm = (firstNumber * secondNumber) / gcd.
        int lcm = (numberFirst * numberSecond) / gcd;
        System.out.printf("%d ve %d'nin EBOB'u : %d, EKOK'u : %d'dir.",numberFirst,numberSecond,gcd,lcm);
    }
}