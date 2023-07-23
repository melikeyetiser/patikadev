import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int a = input.nextInt();

        System.out.print("Enter the exponent: ");
        int b = input.nextInt();

        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        System.out.println(a + "^" + b + " = " + result);
    }
}