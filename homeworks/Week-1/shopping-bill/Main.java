import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double priceArmut = 2.14, priceElma = 3.67, priceDomates = 1.11, priceMuz = 0.95,pricePatlican = 5.00;

        System.out.print("Armut kaç kilo ? : ");
        int kiloArmut = input.nextInt();
        System.out.print("Elma kaç kilo ? : ");
        int kiloElma = input.nextInt();
        System.out.print("Domates kaç kilo ? : ");
        int kiloDomates = input.nextInt();
        System.out.print("Muz kaç kilo ? : ");
        int kiloMuz = input.nextInt();
        System.out.print("Patlıcan kaç kilo ? : ");
        int kiloPatlican = input.nextInt();

        priceArmut *= kiloArmut;
        priceElma *= kiloElma;
        priceDomates *= kiloDomates;
        priceMuz *= kiloMuz;
        pricePatlican *= kiloPatlican;

        double bill = priceArmut + priceElma + priceDomates + priceMuz + pricePatlican;

        System.out.printf("Toplam Tutar : %.2f TL",bill);

    }
}