import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.0;
        int pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo? : ");
        pearKg = input.nextInt();

        System.out.print("Elma kaç kilo? : ");
        appleKg = input.nextInt();

        System.out.print("Domates kaç kilo? : ");
        tomatoKg = input.nextInt();

        System.out.print("Muz kaç kilo? : ");
        bananaKg = input.nextInt();

        System.out.print("Patlıcan kaç kilo? : ");
        eggplantKg = input.nextInt();

        double price = pearKg * pear + appleKg * apple + tomatoKg * tomato + bananaKg * banana + eggplantKg * eggplant;

        System.out.println("Toplam tutar: " + price + " TL");
    }
}