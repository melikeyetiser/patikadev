import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year, mod;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        year = input.nextInt();
        mod = year % 12;
        System.out.print("Çin zodyağı burcunuz: ");
        if (mod == 0) {
            System.out.print("Maymun");
        } else if (mod == 1) {
            System.out.print("Horoz");
        } else if (mod == 2) {
            System.out.print("Köpek");
        } else if (mod == 3) {
            System.out.print("Domuz");
        } else if (mod == 4) {
            System.out.print("Fare");
        } else if (mod == 5) {
            System.out.print("Öküz");
        } else if (mod == 6) {
            System.out.print("Kaplan");
        } else if (mod == 7) {
            System.out.print("Tavşan");
        } else if (mod == 8) {
            System.out.print("Ejderha");
        } else if (mod == 9) {
            System.out.print("Yılan");
        } else if (mod == 10) {
            System.out.print("At");
        } else {
            System.out.print("Koyun");
        }
    }
}