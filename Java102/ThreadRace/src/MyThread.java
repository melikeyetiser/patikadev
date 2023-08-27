import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread {

    volatile List<Integer> evenList = new ArrayList<>();
    volatile List<Integer> oddList = new ArrayList<>();

    public synchronized void run(List<Integer> list) {

        for (Integer integer : list) {
            if (integer % 2 == 0) {
                evenList.add(integer);
            } else {
                oddList.add(integer);
            }

            if(integer==10000){
                stop();
            }
        }


    }



    public List<Integer> getEvenList() {
        return evenList;
    }

    public void setEvenList(List<Integer> evenList) {
        this.evenList = evenList;
    }

    public List<Integer> getOddList() {
        return oddList;
    }

    public void setOddList(List<Integer> oddList) {
        this.oddList = oddList;
    }
}
