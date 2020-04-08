package com.java.intermediario.threads.test;

import com.java.intermediario.threads.classes.MinhaThread;
import com.java.intermediario.threads.classes.MinhaThreadSoma;

public class Test3 {
    public static void main(String[] args) {
        MinhaThreadSoma m1 = new MinhaThreadSoma("Thread #1", 1,2,3,4);
        MinhaThreadSoma m2 = new MinhaThreadSoma("Thread #2", 6,10,50,69);
        /*
        Com o método synchronized o valor soma não é compartilhado e a saída para soma é correta.
        Com synchronized apenas uma Thread acessa por vez o recurso
         */
    }
}
