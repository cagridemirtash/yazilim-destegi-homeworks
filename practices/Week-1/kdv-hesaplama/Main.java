import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amountOfMoney;
        double kdvRate;
        System.out.print("Lütfen para bilgisini giriniz : ");
        amountOfMoney = input.nextInt();

        kdvRate = amountOfMoney < 1000 && amountOfMoney > 0 ? 0.18: 0.08;
        double amountOfMoneyWithKDV = calculateKDV(amountOfMoney,kdvRate);
        System.out.printf("KDV'siz fiyatı : %d %n", amountOfMoney);
        System.out.printf("KDV'li fiyatı : %.1f %n" , amountOfMoneyWithKDV);
        System.out.printf("KDV : %.1f %n" , amountOfMoneyWithKDV - amountOfMoney);
    }
    public static double calculateKDV(int amountOfMoney, double kdvRate) {
        return amountOfMoney + (amountOfMoney * kdvRate);
    }
}