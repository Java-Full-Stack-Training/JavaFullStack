package com.test.datastructure;

import java.util.ArrayList;
import java.util.List;

public class ListStringDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("vishnu");
        list.add("vishnu1");
        list.add("vishnu2");
        list.add("kulkarni");
        list.add("Mumbai");
        //for
        //while
        //do while
        for(int i=0;i<list.size();i++)   //dynamically   -
        {
            list.set(4,"six elemetn");
            System.out.println(list.get(i));
        }

        //Iterator


    }


}
