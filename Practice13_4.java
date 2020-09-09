import java.util.*;

class Book implements Comparable<Book> {
    String title;
    String author;
    int price;

    public int compareTo(Book b) {
        return this.price - b.price;
    }
}
