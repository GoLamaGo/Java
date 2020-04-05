//Task 4.5.1

package ru.java.collections.treeset;

import java.util.Arrays;

public class Wish implements Comparable<Wish> {
    private String name;
    private String description;
    private double price;
    private String url;
    private int priority;

    public Wish(String name, String description, double price, String url, int priority) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.url = url;
        this.priority = priority;
    }

    /*method from Comparable*/
    public int compareTo(Wish wish) {
        return Double.compare(getPrice(),wish.getPrice());
    }

    public static void printTypeOfSort() {
        String[] typeOfSorts = new String[]{
                "Сортировка по убыванию цены",
                "Сортировка по возрастанию цены",
                "Сортировка по приоритету от самого важного",
                "Сортировка по приоритету от низкого приоритета"
        };

        System.out.println("Выберите тип сортировки для Wishlist:");
        for (String sort : typeOfSorts
        ) {
            System.out.printf("%-2d. %s%n", Arrays.asList(typeOfSorts).indexOf(sort) + 1, sort);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getUrl() {
        return url;
    }

    public int getPriority() {
        return priority;
    }

}
