public class Main {
    public static void main(String[] args) {

        int choice = (int) Math.round(Math.random());
        Fighter marc = new Fighter("Marc", 15, 100, 90, 0);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 0);

        System.out.println(choice);
        if (choice == 0) {
            Ring r = new Ring(marc, alex, 90, 100);
            r.run();
        } else {
            Ring r = new Ring(alex, marc, 90, 100);
            r.run();
        }


    }
}