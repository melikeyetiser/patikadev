import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2, selection;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        System.out.println("Choose an operation from the list:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        selection = input.nextInt();

        switch (selection) {
            case 1:
                System.out.println("The result is " + num1 + num2);
                break;
            case 2:
                System.out.println("The result is " + (num1 - num2));
                break;
            case 3:
                System.out.println("The result is " + num1 * num2);
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("The result is " + (double) num1 / num2);
                } else {
                    System.err.println("You cannot divide by zero!");
                }
                break;
            default:
                System.err.println("Invalid choice!");
                break;
        }

    }
}