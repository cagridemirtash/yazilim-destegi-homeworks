import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r, angle;
        double PI = 3.14;

        System.out.print("Yarıçap'ı giriniz : ");
        r = input.nextInt();

        double area = PI * r * r;
        double perimeter = 2 * PI * r;

        System.out.printf("Dairenin Alanı : %.1f Dairenin Çevresi : %.1f %n" , area, perimeter);

        System.out.print("Açı ölçüsünü giriniz : ");
        angle = input.nextInt();
        double pieceOfCircle = (PI * (r*r) * angle) / 360;
        System.out.printf("Daire diliminin alanı : %.1f", pieceOfCircle);
    }
}