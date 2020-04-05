import ru.java.arrays.ProductBucket;
import ru.java.oop.inheritance.*;

public class Main {
    public static void main(String[] args) {

        //Java2.1.1
//        ProductBucket replacing = new ProductBucket();
//        ProductBucket.createProductBucket();

        /*Java3.2.1*/
        Book book = new Book("The Lord of the Rings");
        System.out.printf("%s: %s%n%n",book.getTitle(),book.getStatus());

        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book,Status.BORROWED);

        book.displayBookStatus();

        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        fromBorrowedStatusMover.moveToStatus(book,Status.ARCHIVED);
        book.displayBookStatus();

        BookMover fromArchievedStatusMover = new FromArchievedStatusMover();
        fromArchievedStatusMover.moveToStatus(book,Status.BORROWED);
        book.displayBookStatus();

    }
}
