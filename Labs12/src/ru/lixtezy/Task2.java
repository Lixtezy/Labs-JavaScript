package ru.lixtezy;

import java.util.*;

public class Task2 {
    public void collectNoDublicates(){
        Set<String> set= new HashSet<>();
        set.add("111111");
        set.add("111111");
        set.add("111111");
        set.add("21341");
        set.add("54345634");

        removeDuplicates(set);
        System.out.println(set);
    }

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}