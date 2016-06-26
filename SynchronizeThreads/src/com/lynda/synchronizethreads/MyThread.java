package com.lynda.synchronizethreads;

/**
 * Created by Oro on 6/26/2016.
 */
public class MyThread extends Thread {

    private int threadID;
    private TargetClass target;

    public MyThread(int threadID, TargetClass target){
        this.threadID = threadID;
        this.target = target;
    }

    @Override
    public void run() {

        synchronized (target) {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            target.call(threadID);
        }
    }

    public static void main(String[] args) {
        TargetClass targetClass = new TargetClass();
        MyThread t1 = new MyThread(1,targetClass);
        MyThread t2 = new MyThread(2,targetClass);
        MyThread t3 = new MyThread(3,targetClass);

        t1.start();
        t2.start();
        t3.start();
    }
}
