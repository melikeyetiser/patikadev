import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y, z;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        x = input.nextInt();
        System.out.print("Enter number 2: ");
        y = input.nextInt();
        System.out.print("Enter number 3: ");
        z = input.nextInt();

        if (x <= y && y <= z) {
            System.out.println(x + " <= " + y + " <= " + z);
        } else if (y <= z && z <= x) {
            System.out.println(y + " <= " + z + " <= " + x);
        } else if (z <= x && x <= y) {
            System.out.println(z + " <= " + x + " <= " + y);
        } else if (z <= y && y <= x) {
            System.out.println(z + " <= " + y + " <= " + x);
        } else if (z <= y) {
            System.out.println(x + " <= " + z + " <= " + y);
        } else {
            System.out.println(y + " <= " + x + " <= " + z);
        }
    }
}