package com;


public class RunnableExample implements Runnable { //extends thread run () ,  //runnable
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("this is the Thread" + i);  //logic   //threading pool / Executor frameworks
        }
    }

    public static void main(String[] args) {
        RunnableExample threadObject = new RunnableExample();  //object
        Thread thread = new Thread(threadObject); //this is not the subclass of the thread class  //thread object
        thread.start();
    }
}
