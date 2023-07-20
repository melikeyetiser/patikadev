import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisindeki eleman sayısını giriniz: ");
        int n = input.nextInt();

        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x + fibonacci(x - 1);
        }
    }
}