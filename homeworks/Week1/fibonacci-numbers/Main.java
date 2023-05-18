import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfElements;
        Scanner input = new Scanner(System.in);

        System.out.print("Eleman sayısını giriniz : ");
        numberOfElements = input.nextInt();

        int initialValue = 0;
        int elem = 0, lastElem = 0, tempElem;
        while(initialValue < numberOfElements) {
            if(initialValue == 0) {
                lastElem = 1;
                System.out.print(elem + " " + lastElem);
                initialValue++;
                continue;
            }
            tempElem = elem;
            elem = lastElem;
            lastElem += tempElem;
            System.out.print(" " + lastElem);
            initialValue++;
        }
    }
}