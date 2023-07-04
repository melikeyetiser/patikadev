import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double fiyat, kdvliTutar, kdv;

        Scanner input = new Scanner(System.in);

        System.out.print("Ürünün KDV'siz fiyatını giriniz: ");
        fiyat = input.nextDouble();

        double kdvOrani = (fiyat > 1000) ? 0.08 : 0.18;

        kdv = fiyat * kdvOrani;
        kdvliTutar = fiyat + kdv;

        System.out.println("KDV Oranı: " + kdvOrani + "\nKDV'li tutar: " + kdvliTutar + "\nKDV tutarı: " + kdv);

    }
}