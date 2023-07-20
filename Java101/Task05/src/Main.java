import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int x = input.nextInt();
        int sum = 0;
        for (int j = 1; j < x; j++) {
            if (x % j == 0) {
                sum += j;
            }
        }
        if (sum == x) {
            System.out.println(x + " mükemmel sayıdır.");
        } else {
            System.out.println(x + " mükemmel sayı değildir.");
        }
    }
}