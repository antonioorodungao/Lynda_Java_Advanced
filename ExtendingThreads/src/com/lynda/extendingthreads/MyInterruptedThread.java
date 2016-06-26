package com.lynda.extendingthreads;

/**
 * Created by Oro on 6/26/2016.
 */
public class MyInterruptedThread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        try{
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt();
        System.out.println("Called interrupt");
    }
}
