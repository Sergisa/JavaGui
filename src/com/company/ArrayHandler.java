package com.company;

import java.util.Arrays;

public class ArrayHandler {
    private String[] values;

    public ArrayHandler(String... values) {
        this.values = values;
    }

    public void append(String... elements) {
        for (String element : elements) {
            this.append(element);
        }
    }

    private void append(String element) {
        String[] arr = Arrays.copyOf(values, values.length + 1);
        arr[values.length] = element;
        this.values = arr;
    }

    public String get(int index) {
        return values[index];
    }

    public void sort() {
        Arrays.sort(values, CharSequence::compare);
    }

    @Override
    public String toString() {
        return "ArrayHandler{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
