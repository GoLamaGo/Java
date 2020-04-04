package ru.java.collections;

import java.util.Comparator;

public class SortByPriority implements Comparator<Wish> {

    public int compare(Wish a, Wish b){
        return Integer.compare(a.getPriority(),b.getPriority());
    }
}
