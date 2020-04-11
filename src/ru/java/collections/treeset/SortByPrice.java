package ru.java.collections.treeset;

import java.util.Comparator;

public class SortByPrice implements Comparator<Wish> {

    public int compare(Wish a, Wish b){

        return Double.compare(a.getPrice(),b.getPrice());
    }
}