import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double bmi; //body mass index
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        double height = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double weight = input.nextDouble();

        bmi = weight / (height * height);
        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    }
}