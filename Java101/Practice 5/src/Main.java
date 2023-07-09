import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter the central angle of the circle section: ");
        double alpha = input.nextDouble();

        double area = (pi * (radius * radius) * alpha) / 360;

        System.out.println("The area is " + area + ".");


    }
}