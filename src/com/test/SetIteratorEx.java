package com.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteratorEx {
    public static void main(String[] args) {

        Set<String> setElement=new HashSet<>();
        setElement.add("Mango");
        setElement.add("Apple");
        setElement.add("Banana");
        setElement.add("Grapes");  //remove
        Iterator<String> iterator=setElement.iterator();
        while(iterator.hasNext())
        {

            System.out.println(iterator.next());
        }
    }
}
