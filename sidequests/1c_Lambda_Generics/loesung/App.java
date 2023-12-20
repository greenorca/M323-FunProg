import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {

    public static void main(String[] args) {

        // 1.-3.
        List<Book> books = new ArrayList<>();
        books.add(new Book("HerrDerRinge", "J.R.R.Tolkien", 450));
        books.add(new Book("HerrDerRinge-DiezweiTürme", "J.R.R.Tolkien", 450));
        books.add(new Book("PerAnhalterdurchdieGalaxy", "AdamDouglas", 250));
        books.add(new Book("Datenbanktheorie", "H.Buff", 350));
        books.add(new Book("HarryPotter", "J.K.Rowling", 350));

        // 4.a
        Consumer print = new Consumer<Book>() {
            @Override
            public void accept(Book o) {
                System.out.println(o.getTitle());
            }
        };

        books.forEach(print);

        // 4.b
        Consumer<Book> printMore = (book) -> {
            System.out.println(book.getTitle() + "" + book.getAuthor());
        };

        books.forEach(printMore);

        // 4.c
        books.forEach((book) -> {
            System.out.println(book.getTitle() + "" + book.getAuthor() + "" + book.getPages());
        });
    }
}
