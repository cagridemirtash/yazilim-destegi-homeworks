import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance, firstBill = 10;
        double bill, pricePerKM = 2.20;
        System.out.print("Gidilecek mesafeyi giriniz : ");
        distance = input.nextInt();

        bill = firstBill + (distance * pricePerKM);
        System.out.println(bill <= 20 ? 20 : bill);
    }
}