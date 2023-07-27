import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // finding repeating even numbers in a list

        int[] list = {4, 2, 3, 7, 5, 6, 9, 9, 0, 0, 4, 0, 5, 4, 6};
        List<Integer> repeatedNumbers = new ArrayList<>();

        System.out.println("The list is: " + Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j] && list[i] % 2 == 0) {

                    if (!repeatedNumbers.contains(list[i])) {
                        repeatedNumbers.add(list[i]);
                    }
                }
            }
        }
        System.out.println("Repeating even numbers are: " + repeatedNumbers);
    }
}