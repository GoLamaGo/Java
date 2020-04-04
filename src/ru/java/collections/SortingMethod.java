package ru.java.collections;

public enum SortingMethod {
    SortByPrice("1"),
    SortByPriority("2");

    private String code;

    SortingMethod(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}