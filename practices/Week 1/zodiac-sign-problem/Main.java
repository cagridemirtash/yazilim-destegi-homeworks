import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bornDay, bornMonth;
        Scanner input = new Scanner(System.in);
        String sign;
        //Take two input from user
        System.out.print("Doğum gününüzü giriniz : ");
        bornDay = input.nextInt();
        System.out.print("Doğum ayınızı giriniz : ");
        bornMonth = input.nextInt();

        //Find the user sign
        //Months start from 1 to 12.
        //Days start from 1 to 30.
        if(bornMonth == 1) {

        }
        /*
        Aylar -> 1 - 12
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak

        */
    }
}