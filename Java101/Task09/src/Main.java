import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int n = input.nextInt();
        int m = n;
        System.out.print(m + " ");

        while (m >0) {
            m -= 5;
            System.out.print(m + " ");
        }

        while (m + 5 <= n) {
            m += 5;
            System.out.print(m + " ");

        }
    }
}