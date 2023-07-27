import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // finding the minimum and maximum neighbours of a given number in an array
        Scanner input = new Scanner(System.in);

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.print("[");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.print("]\n");
        System.out.print("Enter a number from the list: ");
        int x = input.nextInt();

        int min = list[0];
        int minGap = 100000;
        int max = list[0];
        int maxGap = 100000;

        for (int i : list) {
            if ((i - x) < maxGap && (i > x)) {
                max = i;
                maxGap = i - x;
            }
            if ((x - i) < minGap && (x > i)) {
                min = i;
                minGap = x - i;
            }
        }

        System.out.println("Closest number smaller than " + x + " is: " + min);
        System.out.println("Closest number greater than " + x + " is: " + max);

    }
}