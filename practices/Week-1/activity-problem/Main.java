import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz : ");
        heat = input.nextInt();

        if(heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        } else if ( heat <= 25 && heat >= 5) {
            if (heat < 15) {
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if (heat >= 15) {
                System.out.println("Piknik Yapabilirsiniz.");
            }
        } else {
            System.out.println("Kayak yapabilirsiniz.");
        }
    }
}