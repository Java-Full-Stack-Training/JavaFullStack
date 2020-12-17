package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImmutableListExample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.remove(0);
        //System.out.println(list);


        List<String> fil= list.stream().filter(lst->lst.equals("one")).collect(Collectors.toList());

        System.out.println("-"+fil);
    }
}
