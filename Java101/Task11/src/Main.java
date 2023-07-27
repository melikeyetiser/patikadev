import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // find array frequency

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        List<Integer> repeatedNumbers = new ArrayList<>();

        for (int i = 0; i < list.length; i++) {
            int count = 1;
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    count++;
                }

                if (!repeatedNumbers.contains(list[i]) && (j == list.length - 1)) {
                    System.out.println(list[i] + " repeated in the list " + count + " times.");
                    repeatedNumbers.add(list[i]);
                }
            }
        }
    }
}

