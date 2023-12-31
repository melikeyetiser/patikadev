import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = input.nextInt();
        double sum = 0.0;

        for (double i = 1; i <= N; i++) {
            sum += (1 / i);
        }

        System.out.println("Harmonic sum until N = " + N + " is: " + sum);
    }
}