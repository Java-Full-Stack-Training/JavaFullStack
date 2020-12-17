package com;

import java.util.*;

public class ListIteratorExample {
    public static void main(String args[]) {


        List<String> list = new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        ListIterator<String> listIterator = list.listIterator();
        listIterator.add("Strawbary");
        listIterator.add("Mangoshek");

        Collections.sort(list);  //sortin


        System.out.println("--" + list);


    }
}