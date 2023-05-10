import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        math = input.nextInt();
        math = isZero(math);

        System.out.print("Fizik notunuz : ");
        physics = input.nextInt();
        physics = isZero(physics);

        System.out.print("Türkçe notunuz : ");
        turkish = input.nextInt();
        turkish = isZero(turkish);

        System.out.print("Kimya notunuz : ");
        chemistry = input.nextInt();
        chemistry = isZero(chemistry);

        System.out.println("Müzik notunuz : ");
        music = input.nextInt();
        music = isZero(music);

        double average = (math + chemistry + physics + music + turkish) / 5.0;
        if(average <= 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere");
            System.out.printf("Ortalamanız : %.1f", average);
        } else {
            System.out.println("Seneye görüşmemize gerek yok, geçtin hayırlı olsun.");
        }
    }

    public static int isZero(int value) {
        return value < 0 || value > 100 ? 0 : value;
    }
}