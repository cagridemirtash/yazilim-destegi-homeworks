import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int elements, combinator;
        Scanner input = new Scanner(System.in);
        //Taken inputs from user
        System.out.print("N'in eleman sayısını giriniz : ");
        elements = input.nextInt();
        System.out.print("r kombinasyonunu giriniz : ");
        combinator = input.nextInt();
        //Combination formula => C(n,r) = n! / (r! * (n-r)!)
        int combinations = (fact(elements)) / (fact(combinator) * (fact(elements - combinator)));
        System.out.printf("C(%d,%d) = %d",elements,combinator,combinations);
    }
    //Factorial method which is return a sum of given number.
    public static int fact(int number) {
        if(number == 1) {
            return 1;
        }
        return number * fact(number - 1);
    }
}