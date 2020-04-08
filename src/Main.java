import ru.java.arrays.ProductBucket;
import ru.java.oop.inheritance.*;
import ru.java.oop.polymorphizm.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Java2.1.1
//        ProductBucket replacing = new ProductBucket();
//        ProductBucket.createProductBucket();



        /*Java3.2.1*/
//        Book book = new Book("The Lord of the Rings");
//        System.out.printf("%s: %s%n%n",book.getTitle(),book.getStatus());

        //new book & move to BORROWED
//        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
//        fromAvailableStatusMover.moveToStatus(book,Status.BORROWED);

        //print Current status
//        book.displayBookStatus();

        //move to ARCHIVED
//        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
//        fromBorrowedStatusMover.moveToStatus(book,Status.ARCHIVED);
//        book.displayBookStatus();

        //move to wrong status
//        BookMover fromArchievedStatusMover = new FromArchievedStatusMover();
//        fromArchievedStatusMover.moveToStatus(book,Status.BORROWED);
//        book.displayBookStatus();

        //move from wrong status
//        fromAvailableStatusMover.moveToStatus(book,Status.BORROWED);
//        book.displayBookStatus();


        //Java3.3.1
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );

        int slot;

        while (true) {
            try {
                slot = scanner.nextInt();
            } catch (InputMismatchException mis) {
                System.out.println("Incorrect number, please try again");
                scanner.next();
                continue;
            }

            if (slot == -1) {
                break;
            } else {
                player.shotWithWeapon(slot);
            }
        }

        System.out.println("Game over!");

    }
}
