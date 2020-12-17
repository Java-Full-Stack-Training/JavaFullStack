package com.core.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Get
{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);

        System.out.println(countDuplicate(list));
    }
    public static int countDuplicate(List<Integer> numbers) {
        HashSet<Integer> set =new HashSet<Integer>();
        //HashSet<Integer> duplicateset= new HashSet<Integer>();
        List<Integer> duplicateList=new ArrayList<>();
        for(int i=0;i<numbers.get(i);i++)
        {
            if(set.contains(numbers.get(i)))
            {
                duplicateList.add(numbers.get(i));
            }
            else
            {
                set.add(numbers.get(i));
            }
        }
        return duplicateList.size();
    }

}
