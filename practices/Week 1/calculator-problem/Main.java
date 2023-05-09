import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber, secondNumber;
        int result = 0;
        Scanner input = new Scanner(System.in);


        System.out.print("Birinci numarayı giriniz : ");
        firstNumber = input.nextInt();
        System.out.print("İkinci numarayı giriniz : ");
        secondNumber = input.nextInt();
        System.out.print("Yapmak istediğiniz işlemi seçiniz : + -> Toplama, - -> Çıkarma, * -> Çarpma, / -> Bölme \nSeçiminiz : ");
        String operator = input.next();

        switch(operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = Math.abs(firstNumber - secondNumber);
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Yanlış operatör seçimi yaptınız.");
                break;
        }

        System.out.print("Sonuç : " + result);
    }
}