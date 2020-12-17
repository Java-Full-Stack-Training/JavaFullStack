package com.test;

import java.util.*;

public class ListExample2 {
    public static void main(String args[]) {


        List<String> list = new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");


        Iterator<String> iterator=list.iterator();

        String str="";
        while(iterator.hasNext())
        {
            str = (String) iterator.next();
            if (str.equals("Grapes")) {
                iterator.remove();
                System.out.println("The element Grapes is removed");
            }
            if (str.equals("Apple")) {
                list.add("Strawbary");
                System.out.println("The element Grapes is removed");
            }
            System.out.println(list);
        }

    }
}