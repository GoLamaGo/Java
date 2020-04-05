import ru.java.arrays.ProductBucket;
import ru.java.oop.inheritance.Book;
import ru.java.oop.inheritance.BookMover;
import ru.java.oop.inheritance.FromAvailableStatusMover;
import ru.java.oop.inheritance.Status;

public class Main {
    public static void main(String[] args) {

        //Java2.1.1
//        ProductBucket replacing = new ProductBucket();
//        ProductBucket.createProductBucket();

        /*Java3.2.1*/
        Book book = new Book("The Lord of the Rings");
        System.out.printf("%s: %s%n",book.getTitle(),book.getStatus());

        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book,Status.BORROWED);

        System.out.printf("Current status of the book \"%s\" is: " + (char)27 + "[31m%s%n",book.getTitle(),book.getStatus());
    }
}
