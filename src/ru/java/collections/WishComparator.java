package ru.java.collections;

import java.util.Comparator;

public class WishComparator implements Comparator<Wish> {

    public int compare(Wish a, Wish b) {
        return -Double.compare(a.getPrice(), b.getPrice());
    }

    public WishComparator(){

    }

}