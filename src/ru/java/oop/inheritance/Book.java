package ru.java.oop.inheritance;

public class Book {
    private String title;
    private String status;

    public Book(String title) {
        this.title = title;
        this.status = Status.AVAILABLE.toString();
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
