import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Point of Math : ");
        mat = input.nextInt();
        System.out.print("Point of Physics : ");
        fizik = input.nextInt();
        System.out.print("Point of Chemistry : ");
        kimya = input.nextInt();
        System.out.print("Point of Turkish Language : ");
        turkce = input.nextInt();
        System.out.print("Point of History : ");
        tarih = input.nextInt();
        System.out.print("Point of Music : ");
        muzik = input.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6.0;
        System.out.println(sonuc);

        String passed = (sonuc >= 60.0) ? "Geçti": "Kaldı";
        System.out.println(passed);
    }
}