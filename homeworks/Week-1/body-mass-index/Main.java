import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height;
        int weight;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = input.nextInt();
        double convertHeight = height * 0.01;

        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = input.nextInt();

        System.out.println(convertHeight + " " +  weight);

        double bodyMassIndex = weight / Math.pow(convertHeight , 2);
        System.out.printf("Vücut Kitle İndeksiniz : %f", bodyMassIndex);

        input.close();
    }
}