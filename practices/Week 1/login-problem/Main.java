import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.next();
        System.out.print("Şifreniz : ");
        password = input.next();

        if(userName.equals("cagridemirtash") && password.equals("123456")) {
            System.out.println("Giriş başarılı");
        } else if(!password.equals("123456")) {
            System.out.print("Giriş başarısız, şifrenizi yanlış girdiniz. Şifrenizi sıfırlamak istiyor musunuz? : Evet / Hayır -> ");
            String temp = input.next().toLowerCase();
            if(temp.equals("evet")) {
                System.out.print("Yeni şifre giriniz. Eski şifreniz ile aynı olması kontrol edilmektedir. Yeni Şifreniz : ");
                password = input.next();
                if(password.equals("123456")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else if(temp.equals("hayır")) {
                System.out.println("Yeni şifre oluşturmadan giriş yapamazsınız.");
            }
        } else {
            System.out.println("Tekrar giriş yapınız.");
        }
    }
}