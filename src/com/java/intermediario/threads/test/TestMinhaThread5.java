package com.java.intermediario.threads.test;

import com.java.intermediario.threads.classes.MinhaThread5;

public class TestMinhaThread5 {
    public static void main(String[] args) {
        MinhaThread5 m1 = new MinhaThread5("Thread #1");
        MinhaThread5 m2 = new MinhaThread5("Thread #2");

        m1.suspend();

        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        m2.suspend();

        m1.resume();

        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        m2.resume();
        m2.stop();
    }
}
