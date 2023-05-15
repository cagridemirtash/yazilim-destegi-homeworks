import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // a^2 + b^2 = c^2
        int verticalEdge, height;

        System.out.print("Taban kenarını giriniz : ");
        verticalEdge = input.nextInt();
        System.out.print("Yükseliği giriniz : ");
        height = input.nextInt();

        double hypotenuse = Math.sqrt(Math.pow(verticalEdge, 2) + Math.pow(height, 2));
        System.out.println("Hipotenüs : "+ hypotenuse);

        //Area : area * area = u * (u - a) * (u - b) * (u - c)
        double u = (verticalEdge + height + hypotenuse) / 2.0;
        double areaLongWay = Math.sqrt(u * (u - verticalEdge) * (u - height) * (u - hypotenuse));
        double areaTrickWay = (verticalEdge * height) / 2.0;
        System.out.println("Uzun yoldan çözümü : " + areaLongWay);
        System.out.println("Kısa yoldan çözümü : " + areaTrickWay);
    }
}
