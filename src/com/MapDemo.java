package com;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> employeeMap=new HashMap<>();
        employeeMap.put(1, "vishnu");
        employeeMap.put(2 , "yamini");
        employeeMap.put(3, "abc");
        employeeMap.put(4, "vishnu");
        employeeMap.put(6,"kiran1");  //duplicate
        employeeMap.put(6,"kiran");  //duplicated
        employeeMap.put(7,"kiran");
     //   System.out.println(employeeMap.get(7));
        System.out.println(employeeMap.values());
        System.out.println(employeeMap.keySet());
        System.out.println(employeeMap.remove(6));


    }
}
