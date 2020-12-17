package com;

public class ThreadingDemo extends Thread{ //we can extends only one class
    public void run()
    {
        for(int i=0;i<10;i++) {
            System.out.println("this is the Thread"+i);  //logic   //threading pool / Executor frameworks
        }
    }

    public static void main(String[] args) {

        ThreadingDemo threadObject=new ThreadingDemo();  //object
        threadObject.start();  //start //runnable state
    }
}
