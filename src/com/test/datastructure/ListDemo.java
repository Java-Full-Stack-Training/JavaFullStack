package com.test.datastructure;


import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        int[] arr = new int[20];  // allocating memory to array; // limitations of array
        //fix sized data structure
      for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 1000; i++) {   //iteration
            list.add(i);
        }

    //    System.out.println(list);


    }
}
