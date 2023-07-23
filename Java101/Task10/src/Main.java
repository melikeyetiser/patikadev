import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Kemal", new BigDecimal(2000),
                45,1985);

        System.out.println(employee);
}