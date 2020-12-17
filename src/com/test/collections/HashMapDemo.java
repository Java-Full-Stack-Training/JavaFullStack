package com.test.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
  /*      HashMap<Integer,String> hasmMap=new HashMap<>();
        hasmMap.put(01, "One");
        hasmMap.put(02, "two");
        hasmMap.put(03, "three");
        hasmMap.put(04, "four");
        hasmMap.put(05, "five");
        System.out.println(hasmMap);*/

        TreeMap<Integer,String> treeMap=new TreeMap<>();

        treeMap.put(02, "two");
        treeMap.put(03, "three");
        treeMap.put(04, "four");
        treeMap.put(05, "five");
        treeMap.put(05, "five");//
        treeMap.put(06, "five");
        treeMap.put(01, "One");
        System.out.println(treeMap);



    }
}
