package com.java.intermediario.threads.test;

import com.java.intermediario.threads.classes.MinhaThread;

public class Teste {
    public static void main(String[] args) {
        MinhaThread thread = new MinhaThread("Thread #1",1000);
        MinhaThread thread2 = new MinhaThread("Thread#2",600);

    }
}
