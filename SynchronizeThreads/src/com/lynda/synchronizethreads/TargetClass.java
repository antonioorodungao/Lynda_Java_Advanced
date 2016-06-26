package com.lynda.synchronizethreads;

/**
 * Created by Oro on 6/26/2016.
 */
public class TargetClass {

    public void call(int threadID){
        System.out.println("Calling thread from " + threadID);
    }
}
