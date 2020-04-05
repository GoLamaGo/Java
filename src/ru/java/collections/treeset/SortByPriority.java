package ru.java.collections.treeset;

import java.util.Comparator;

public class SortByPriority implements Comparator<Wish> {

    public int compare(Wish a, Wish b){
        return Integer.compare(a.getPriority(),b.getPriority());
    }
}
