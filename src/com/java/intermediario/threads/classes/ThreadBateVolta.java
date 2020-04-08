package com.java.intermediario.threads.classes;

public class ThreadBateVolta implements Runnable {
    private String nome; // nome da Thread
    private BateVolta bv; //instância da classe que possui métodos a ser usados na thread BateVolta
    public Thread t;
    private final int NUM = 5; // número máximo de bate-volta

    public ThreadBateVolta(String nome, BateVolta bv) {
        this.nome = nome;
        this.bv = bv;
        t = new Thread(this, nome);
        t.start();
    }
    @Override
    public void run() {
        if(t.getName().equalsIgnoreCase("Bate")){
            for (int i = 0; i < NUM; i++){
                bv.bate(true); // ativa bate
            }
            bv.bate(false); // encerra bate
        }else{
            for(int i = 0; i < NUM; i++){
                bv.volta(false); // ativa volta
            }
            bv.volta(true);//encerra volta
        }
    }
}
