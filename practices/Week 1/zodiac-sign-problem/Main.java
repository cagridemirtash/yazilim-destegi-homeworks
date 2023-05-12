import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bornDay, bornMonth;
        boolean isDay = true, isMonth = true;
        Scanner input = new Scanner(System.in);
        String sign = "";
        //Take two input from user
        System.out.print("Doğum gününüzü giriniz : ");
        bornDay = input.nextInt();
        //Control the bornDay which is a valid day or not.
        isDay = (bornDay < 1 || bornDay > 30) != isDay;
        System.out.print("Doğum ayınızı giriniz : ");
        bornMonth = input.nextInt();
        //Control the bornMonth which is a valid month or not.
        isMonth = (bornMonth < 1 || bornMonth > 12) != isDay;

        //Find the user sign
        //Months start from 1 to 12.
        //Days start from 1 to 30.
        if(isDay && isMonth) {
            if(bornMonth == 1) {
                if(bornDay < 22) {
                    sign = "Oğlak";
                } else {
                    sign = "Kova";
                }
            }else if(bornMonth == 2) {
                if(bornDay < 20) {
                    sign = "Kova";
                } else {
                    sign = "Balık";
                }
            }else if(bornMonth == 3) {
                if(bornDay < 21) {
                    sign = "Balık";
                } else {
                    sign = "Koç";
                }
            }else if(bornMonth == 4) {
                if(bornDay< 21) {
                    sign = "Koç";
                } else {
                    sign = "Boğa";
                }
            }else if(bornMonth == 5) {
                if(bornDay < 22) {
                    sign = "Boğa";
                } else {
                    sign = "İkizler";
                }
            }else if(bornMonth == 6) {
                if(bornDay < 23) {
                    sign = "İkizler";
                } else {
                    sign = "Yengeç";
                }
            }else if(bornMonth == 7) {
                if(bornDay < 23) {
                    sign = "Yengeç";
                } else {
                    sign = "Aslan";
                }
            }else if(bornMonth == 8) {
                if(bornDay < 23) {
                    sign = "Aslan";
                } else {
                    sign = "Başak";
                }
            }else if(bornMonth == 9) {
                if(bornDay < 23) {
                    sign = "Başak";
                } else {
                    sign = "Terazi";
                }
            }else if(bornMonth == 10) {
                if(bornDay < 23) {
                    sign = "Terazi";
                } else {
                    sign = "Akrep";
                }
            }else if(bornMonth == 11) {
                if(bornDay < 22) {
                    sign = "Akrep";
                } else {
                    sign = "Yay";
                }
            }else if(bornMonth == 12) {
                if(bornDay < 23) {
                    sign = "Yay";
                } else {
                    sign = "Oğlak";
                }
            }
            System.out.println("Burcunuz : " + sign);
        } else {
            System.out.println("Gün veya ay bilgisi yanlış girilmiştir. Lütfen tekrar deneyiniz.");
        }

    }
}