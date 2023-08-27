import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        MyThread thread4 = new MyThread();

        // new thread pool of capacity 4
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        ArrayList<Integer> arrayList = new ArrayList<>(10000);
        for (int i = 1; i <= 10000; i++) {
            arrayList.add(i);
        }

        List<Integer> sublist1 = arrayList.subList(0, 250);
        List<Integer> sublist2 = arrayList.subList(250, 500);
        List<Integer> sublist3 = arrayList.subList(500, 750);
        List<Integer> sublist4 = arrayList.subList(750, 10000);

        executorService.execute(thread1);
        thread1.run(sublist1);

        executorService.execute(thread2);
        thread1.run(sublist2);

        executorService.execute(thread3);
        thread1.run(sublist3);

        executorService.execute(thread4);
        thread1.run(sublist4);

        System.out.println("Even numbers: \n" + thread1.getEvenList());
        System.out.println("Odd numbers: \n" + thread1.getOddList());

        executorService.shutdown();
    }
}