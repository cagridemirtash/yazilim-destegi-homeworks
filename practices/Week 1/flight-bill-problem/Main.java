import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //The user Inputs
        int distance , age, typeOfFlight;
        boolean isDistanceError, isAgeError, isFlightError;
        //Complete all process about flight free.
        double bill = 0.0;

        System.out.print("Lütfen mesafeyi giriniz : ");
        distance = input.nextInt();
        isDistanceError = distance > 0;
        System.out.print("Lütfen yaşınızı giriniz : ");
        age = input.nextInt();
        isAgeError = age > 0;
        System.out.print("Lütfen yolculuk tipinizi giriniz : ");
        typeOfFlight = input.nextInt();
        isFlightError = typeOfFlight == 1 || typeOfFlight == 2;

        if(isDistanceError && isAgeError && isFlightError) {
            bill = distance * 0.10;
            if(age < 12) {
                bill -= bill * 0.5;
            } else if (age < 24) {
                bill -= bill * 0.1;
            } else if (age > 65) {
                bill -= bill * 0.3;
            }

            if(typeOfFlight == 2) {
                bill -= bill * 0.2;
                bill *= 2;
            }
            System.out.printf("Toplam Tutar : %.1f TL", bill);
        } else {
            System.out.println("Hatalı veri girişi yaptınız.");
        }
    }
}