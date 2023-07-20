import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int x = input.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int y = input.nextInt();

        System.out.println("Sonuç: " + exponential(x, y));

    }

    public static int exponential(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= b; i++) {
                product *= a;
            }
            return product;
        }
    }
}