package com.java.intermediario.threads.classes;
/*
A classe MinhaThreadRunnable aplenas implementa a classe Runnable ela não é de fato uma Thread, para torna-se uma
Thread é preciso passar essa classe Runnable, na main, para Thread
 */
public class MinhaThreadRunnable implements Runnable{
    private String nome;
    private int tempo;
    //Não existe o método start
    public MinhaThreadRunnable(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 6; i++) {
                System.out.println(nome + "  contador  " + i);
                Thread.sleep(tempo);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(nome+" terminada");
    }
}