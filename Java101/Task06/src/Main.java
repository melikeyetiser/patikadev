import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int x = input.nextInt();

        for (int j=1; j<=x; j++){
            for (int i=0; i<=x-j; i++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}