import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int math, phys, chem, turkish, hist, music;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your mathematics grade: ");
        math = input.nextInt();

        System.out.print("Enter your physics grade: ");
        phys = input.nextInt();

        System.out.print("Enter your chemistry grade: ");
        chem = input.nextInt();

        System.out.print("Enter your Turkish grade: ");
        turkish = input.nextInt();

        System.out.print("Enter your history grade: ");
        hist = input.nextInt();

        System.out.print("Enter your music grade: ");
        music = input.nextInt();

        double average = (math + phys + chem + turkish + hist + music)/6.0;

        System.out.println("Your GPA is " + average + ".");

        String result = (average>60) ? "You passed." : "You failed.";

        System.out.println(result);
    }
}