package com.java.intermediario.threads.classes;

public class SemaforoCLP {
    private static int valor = 1;

    public synchronized void P(){
        valor-=1;
        if(valor < 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void V(){
        valor+=1;
        if(valor <=0){
            notify();
        }
    }
}
