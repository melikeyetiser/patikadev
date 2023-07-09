import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;
        int x, y, z;

        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin bir dik kenarının uzunluğunu giriniz: ");
        a = input.nextInt();

        System.out.print("Üçgenin diğer dik kenarının uzunluğunu giriniz: ");
        b = input.nextInt();

        double hipotenus = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüsün uzunluğu: " + hipotenus);

        // now we calculate the area of a triangle
        System.out.print("Üçgenin birinci kenar uzunluğu: ");
        x = input.nextInt();

        System.out.print("Üçgenin ikinci kenar uzunluğu: ");
        y = input.nextInt();

        System.out.print("Üçgenin üçüncü kenar uzunluğu: ");
        z = input.nextInt();

        double u = (x + y + z) / 2.0;
        double alan = Math.sqrt(u * (u - x) * (u - y) * (u - z));
        System.out.println("Üçgenin alanı: " + alan);

    }
}