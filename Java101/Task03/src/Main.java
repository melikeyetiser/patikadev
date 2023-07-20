import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, age, travelType;
        double pricePerKm = 0.1, price, discount, finalPrice;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        travelType = input.nextInt();

        if (km < 0 || age < 0 || (travelType != 1 && travelType != 2)) {
            System.err.println("Hatalı veri girdiniz!");
        } else {
            price = pricePerKm * km;
            if (age < 12) {
                discount = price * 0.5;
            } else if (age < 24) {
                discount = price * 0.1;
            } else if (age > 65) {
                discount = price * 0.3;
            } else {
                discount = 0;
            }

            if (travelType == 1) {
                finalPrice = price - discount;
            } else {
                finalPrice = (price - discount) * 0.8 * 2;
            }

            System.out.println("Toplam tutar: " + finalPrice);
        }
    }
}