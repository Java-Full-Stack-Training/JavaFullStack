package com.test.string;

public class StringDemo {
    public static void main(String[] args) {

        String str2 = new String("this is another  string ");   //first time assignment
        str2 = "this is modification";
        String str1 = "this is modification";
        System.out.println(str2.equalsIgnoreCase(str1));
        System.out.println("string 2 -" + str2.concat("additional").toUpperCase());


        StringBuffer sb =new StringBuffer("String buffer example");   // multithreading environment
        sb.append("append to string buffer");
        System.out.println(sb);

        StringBuilder stringBuilder=new StringBuilder("Employee Name");
        stringBuilder.append("Mr.");
        stringBuilder.append("vishnu kulkarni");
        stringBuilder.append("Mr.");
        stringBuilder.append("Abc ");

        System.out.println(stringBuilder);
    }
}
