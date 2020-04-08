package com.java.intermediario.threads.test;

import com.java.intermediario.threads.classes.MinhaThread;
import com.java.intermediario.threads.classes.MinhaThreadRunnable;

public class Teste2 {
    public static void main(String[] args) {
        MinhaThreadRunnable m1 = new MinhaThreadRunnable("Thread #1", 200);
        MinhaThreadRunnable m2 = new MinhaThreadRunnable("Thread #2", 500);
        MinhaThreadRunnable m3 = new MinhaThreadRunnable("Thread #3", 900);

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);
        /*
        Os valores para a prioridade pode ser de 1 à 10.
         */
        t1.setPriority(5);
        t2.setPriority(2);
        t3.setPriority(1);

        t1.setPriority(Thread.MAX_PRIORITY); // existem constantes de prioridade

        t1.start();
        t2.start();
        t3.start();
    }
}
