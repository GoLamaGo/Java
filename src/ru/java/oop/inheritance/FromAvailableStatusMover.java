package ru.java.oop.inheritance;

public class FromAvailableStatusMover extends BookMover {

    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.AVAILABLE)) {
            switch (requestedStatus) {
                case ARCHIVED:
                    System.out.printf("Перевод книги из статуса %s в статус %s успешно произведен%n", book.getStatus(), requestedStatus);
                    book.setStatus(Status.ARCHIVED);
                    break;
                case BORROWED:
                    System.out.printf("Перевод книги из статуса %s в статус %s успешно произведен%n", book.getStatus(), requestedStatus);
                    book.setStatus(Status.BORROWED);
                    break;
                case OVERDUED:
                    System.out.printf("Перевод книги из статуса %s в статус %s невозможен%n", book.getStatus(), requestedStatus);
                    break;
                case AVAILABLE:
                    System.out.printf("Перевод книги из статуса %s в статус %s невозможен%n", book.getStatus(), requestedStatus);
                    break;
            }
        } else {
            System.out.printf("Книга имеет неверный статус для перевода: %s. Должна иметь статус: %s%n",book.getStatus(),Status.AVAILABLE.toString());
        }

    }


}
