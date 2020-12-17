package com.test.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        ///unique data
        //Sorted data
      //  Set<String> set=new HashSet<String>();
        LinkedHashSet<String> set=new LinkedHashSet<>();
          //duplicates
        set.add("PQR");
        set.add("XYZ"); //duplicates
        set.add("ABC");
        set.add("AAA");
        set.add("ABC");
        set.add("ABC");

        System.out.println(set);




    }
}
