import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();
        while (month > 12 || month < 0) {
            System.out.print("Geçersiz sayı! Doğduğunuz ayı giriniz: ");
            month = input.nextInt();
        }

        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();
        while (day > 31 || day < 0) {
            System.out.print("Geçersiz sayı! Doğduğunuz günü giriniz: ");
            day = input.nextInt();
        }

        if (month == 1) {
            if (day <= 21) {
                System.out.println("Oğlak burcu.");
            } else {
                System.out.println("Kova burcu.");
            }
        } else if (month == 2) {
            if (day <= 19) {
                System.out.println("Kova burcu.");
            } else {
                System.out.println("Balık burcu.");
            }
        } else if (month == 3) {
            if (day <= 20) {
                System.out.println("Balık burcu.");
            } else {
                System.out.println("Koç burcu.");
            }
        } else if (month == 4) {
            if (day <= 20) {
                System.out.println("Koç burcu.");
            } else {
                System.out.println("Boğa burcu.");
            }
        } else if (month == 5) {
            if (day <= 21) {
                System.out.println("Boğa burcu.");
            } else {
                System.out.println("İkizler burcu.");
            }
        } else if (month == 6) {
            if (day <= 22) {
                System.out.println("İkizler burcu.");
            } else {
                System.out.println("Yengeç burcu.");
            }
        } else if (month == 7) {
            if (day <= 22) {
                System.out.println("Yengeç burcu.");
            } else {
                System.out.println("Aslan burcu.");
            }
        } else if (month == 8) {
            if (day <= 22) {
                System.out.println("Aslan burcu.");
            } else {
                System.out.println("Başak burcu.");
            }
        } else if (month == 9){
            if (day<=22){
                System.out.println("Başak burcu.");
            } else {
                System.out.println("Terazi burcu.");
            }
        } else if (month == 10){
            if (day<=22){
                System.out.println("Terazi burcu.");
            } else {
                System.out.println("Akrep burcu.");
            }
        } else if (month == 11){
            if (day<=21){
                System.out.println("Akrep burcu.");
            } else {
                System.out.println("Yay burcu.");
            }
        } else {
            if (day<=21){
                System.out.println("Yay burcu.");
            } else {
                System.out.println("Oğlak burcu.");
            }
        }
    }
}