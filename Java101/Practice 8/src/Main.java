import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz: ");
        int temperature = input.nextInt();

        if (temperature < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (temperature < 10 && temperature >= 5) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (temperature >= 10 && temperature < 15) {
            System.out.println("Piknik yapabilirsiniz ya da sinemaya gidebilirsiniz.");
        } else if (temperature >= 15 && temperature < 25) {
            System.out.println("Piknik yapabilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
