package com.java.intermediario.threads.test;

import com.java.intermediario.threads.classes.ThreadSemaforo;

public class SemaforoDemo {
    public static void main(String[] args) {
        ThreadSemaforo t1 = new ThreadSemaforo();
        for(int i = 0; i < 10; i++){
            System.out.println(t1.getCor());
            t1.esperaMudar();
        }
        t1.desligaSemaforo();
    }
}
