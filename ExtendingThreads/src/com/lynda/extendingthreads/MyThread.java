package com.lynda.extendingthreads;

/**
 * Created by Oro on 6/26/2016.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        int iterations = 5;
        for (int i = 0; i < iterations; i++) {
            System.out.println("For secondary thread");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int iterations = 3;
        MyThread thread = new MyThread();
        thread.start();
        for (int i = 0; i < iterations; i++) {
            System.out.println("from main process");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
