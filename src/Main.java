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

        //new book & move to BORROWED
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book,Status.BORROWED);

        //print Current status
        book.displayBookStatus();

        //move to ARCHIVED
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        fromBorrowedStatusMover.moveToStatus(book,Status.ARCHIVED);
        book.displayBookStatus();

        //move to wrong status
        BookMover fromArchievedStatusMover = new FromArchievedStatusMover();
        fromArchievedStatusMover.moveToStatus(book,Status.BORROWED);
        book.displayBookStatus();

        //move from wrong status
        fromAvailableStatusMover.moveToStatus(book,Status.BORROWED);
        book.displayBookStatus();

    }
}
