import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double perKM = 2.2, initialFee = 10.0;
        System.out.println("Kilometre başına düşen ücret = " + perKM + " TL");
        Scanner input = new Scanner(System.in);
        System.out.print("Gideceğiniz mesafeyi kilometre (km) cinsinden yazınız: ");
        int km = input.nextInt();

        double charge = km * perKM + initialFee;
        if (charge < 20) charge = 20;

        System.out.println("Toplam ücret = " + charge + " TL");
    }
}