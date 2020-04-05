package ru.java.oop.inheritance;

public class FromArchievedStatusMover extends BookMover {

    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
        switch (requestedStatus) {
            case ARCHIVED:
                System.out.printf("Перевод книги из статуса %s в статус %s невозможен%n",book.getStatus(),requestedStatus);
                break;
            case BORROWED:
                System.out.printf("Перевод книги из статуса %s в статус %s невозможен%n",book.getStatus(),requestedStatus);
                break;
            case OVERDUED:
                System.out.printf("Перевод книги из статуса %s в статус %s невозможен%n",book.getStatus(),requestedStatus);
                break;
            case AVAILABLE:
                book.setStatus(String.valueOf(Status.AVAILABLE));
                break;
        }

    }


}
