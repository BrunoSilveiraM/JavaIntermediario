package com.java.intermediario.threads.test;

public class DeadLock {
    public static void main(String[] args) {
        final String RECURSO1 = "Recurso #1";
        final String RECURSO2 = "Recurso #2";

        Thread t1 = new Thread() {
            public void run(){
                //com o uso de synchronized o Recurso 1 é bloqueado para ser acessado só por pela Thread t1
                synchronized (RECURSO1){
                    System.out.println("Thread #1 bloqueia recurso 1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread #1 tentando acesso a recurso 2");
                    synchronized (RECURSO2){
                        System.out.println("Thread #1 bloqueia recurso 2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run(){
                //com o uso de synchronized o Recurso 1 é bloqueado para ser acessado só por pela Thread t1
                synchronized (RECURSO2){
                    System.out.println("Thread #2 bloqueia recurso 2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread #2 tentando acesso a recurso 1");
                    synchronized (RECURSO1){
                        System.out.println("Thread #2 bloqueia recurso 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
