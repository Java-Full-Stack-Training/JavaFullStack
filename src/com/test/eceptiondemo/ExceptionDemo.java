package com.test.eceptiondemo;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {

            //System.out.println(10 / 0);   //critical code, cause error
        }
        catch (ArrayIndexOutOfBoundsException ame) {
            System.out.println("Please Provide Positive Number2");
        }
        catch (ArithmeticException ame) {
            System.out.println("Please Provide Positive Number1");
        }
        catch (Exception e) {
            System.out.println("Please Provide Positive Number3");
        }
        finally {
            System.out.println("this is final");
        }
    }
}


