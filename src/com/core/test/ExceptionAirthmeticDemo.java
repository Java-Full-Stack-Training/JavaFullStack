package com.core.test;

public class ExceptionAirthmeticDemo {
    public static void main(String[] args) throws Exception {
        try {

         String str="Test";
         if(str.equalsIgnoreCase("test1111"))
         {
             System.out.println("string match");  //
         }
         else {
             throw new Exception();
         }
            System.out.println("test");
        }

        catch(NullPointerException|ArithmeticException|ClassNotFoundException e )  //multiple catch in java 8
        {
            System.out.println("this is the Exception");
            e.printStackTrace();
        }
    }
}
