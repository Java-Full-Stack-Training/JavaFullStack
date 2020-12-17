package com.core.test;

public class AcessSpeicifiersEx {
    public static void main(String[] args) {
        Test2 object=new Test2();
        System.out.println(object.add(10,20));
    }

 /* private     static int  add(int a,int b) //default access specifier
    {
        return    a+b;
    }*/

}




//pulic   --universal access specifier
//private
//protector
//default

/*

Package1   package2
Test.java   Test.Java   -> public
Test.java    --         -> private
*/
