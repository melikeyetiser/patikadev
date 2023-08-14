import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Book> books = new TreeSet<>();
        Book book1 = new Book("The Catcher in the Rye", "J. D. Salinger",
                200);
        Book book2 = new Book("Brave New World", "Aldous Huxley", 300);
        Book book3 = new Book("The Sound and the Fury", "William Faulkner",
                350);
        Book book4 = new Book("As I Lay Dying", "William Faulkner", 330);
        Book book5 = new Book("Ulysses", "James Joyce", 500);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println("Books sorted by name: ");
        for (Book book : books) {
            System.out.println(book);
        }

        // sort books by page number
        Set<Book> booksByPageNumber = new TreeSet<>(Comparator.comparingInt(Book::getPageNumber));
        booksByPageNumber.add(book1);
        booksByPageNumber.add(book2);
        booksByPageNumber.add(book3);
        booksByPageNumber.add(book4);
        booksByPageNumber.add(book5);

        System.out.println("-----------------------\nBooks sorted by page number: ");
        for (Book book : booksByPageNumber) {
            System.out.println(book);
        }

    }
}