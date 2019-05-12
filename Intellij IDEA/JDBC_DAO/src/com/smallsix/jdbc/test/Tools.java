package com.smallsix.jdbc.test;

import java.util.List;
import java.util.Vector;

public class Tools {
    public static List<String> foo(String name,int score) {
        Vector<String> strings = new Vector<>();
        for (int i = 0; i < 9; i++)
            strings.add(name + " " + score);
        return strings;
    }
}
