import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("Average: " + (sum / count));

    }
}