import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n (the number of elements): ");
        int n = input.nextInt();

        System.out.print("Enter r (the number of elements chosen from the set): ");
        int r = input.nextInt();

        int combination = factorial(n) / (factorial(r) * factorial((n-r)));
        System.out.println("\nC(" + n + ", " + r + ") = " + combination);

    }

    public static int factorial(int m) {
        int product = 1;
        for (int i = 1; i <= m; i++) {
            product *= i;
        }
        return product;
    }
}