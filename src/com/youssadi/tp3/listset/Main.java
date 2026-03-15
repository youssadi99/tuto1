package com.youssadi.tp3.listset;

import com.youssadi.tp3.comparators.AgeComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SortedSet<Person> list = new TreeSet(new AgeComparator());
        list.add(new Person("ahmed", 23));
        list.add(new Person("xavier", 33));
        list.add(new Person("karim", 13));

        for(Person elem : list){
            System.out.println(elem.getName());
            System.out.println(elem.hashCode());
        }

    }
}
