import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int digitNumber = 0, sum = n % 10;

        while (n != 0) {
            n /= 10;
            digitNumber++;
            sum += (n % 10);
        }

        System.out.println("Sum of digits: " + sum);

    }
}