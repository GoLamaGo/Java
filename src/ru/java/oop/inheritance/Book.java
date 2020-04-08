package ru.java.oop.inheritance;

public class Book {
    private String title;
    private Status status;

    public Book(String title) {
        this.title = title;
        this.status = Status.AVAILABLE;
    }

    public void displayBookStatus(){
        System.out.printf("Current status of the book \"%s\" is: " + (char)27 + "[31m%s%n%n" + (char)27 + "[0m",getTitle(),getStatus());
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
