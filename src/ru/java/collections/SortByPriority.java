package ru.java.collections;

import java.util.Comparator;

public class SortByPriority implements Comparator<Wish> {

    private String orderDirection;

    public SortByPriority(String orderDirection) {
        this.orderDirection = orderDirection;
    }

    public int compare(Wish a, Wish b) {
        return Integer.compare(a.getPriority(), b.getPriority());
    }

    public String getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }
}
