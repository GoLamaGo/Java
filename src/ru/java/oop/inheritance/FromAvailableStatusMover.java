package ru.java.oop.inheritance;

public class FromAvailableStatusMover extends BookMover {

    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
        switch (requestedStatus) {
            case ARCHIVED:
                book.setStatus(Status.ARCHIVED.toString());
                break;
            case BORROWED:
                book.setStatus(Status.BORROWED.toString());
                break;
            case OVERDUED:
                System.out.printf("Перевод книги из статуса %s в статус %s невозможен%n",book.getStatus(),requestedStatus);
                break;
            case AVAILABLE:
                System.out.printf("Перевод книги из статуса %s в статус %s невозможен%n",book.getStatus(),requestedStatus);
                break;
        }

    }


}
