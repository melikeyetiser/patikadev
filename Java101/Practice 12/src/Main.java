import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, sum = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            x = input.nextInt();
            if (x%4 == 0){
                sum+=x;
            }

        } while (x % 2 == 0);
        System.out.println("The sum of numbers divided by 4 is " + sum);
    }
}