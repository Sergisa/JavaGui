package com.company;

import java.util.Arrays;

public class GenericArrayHandler<E> {
    private E[] values;

    public GenericArrayHandler(E[] values) {
        this.values = values;
    }

    public void append(E[] elements) {
        for (E element : elements) {
            this.append(element);
        }
    }

    private void append(E element) {
        E[] arr = Arrays.copyOf(values, values.length + 1);
        arr[values.length] = element;
        this.values = arr;
    }

    public E get(int index) {
        return values[index];
    }

    @Override
    public String toString() {
        return "ArrayHandler{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
