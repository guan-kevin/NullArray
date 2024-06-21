package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Bar {
    public String[] sort() {
        String[] array = new String[5];
        array[3] = "foo";
        array[4] = "bar";

        Arrays.sort(array, 3, 5, Comparator.comparingInt(String::length));
        return array;
    }
}
