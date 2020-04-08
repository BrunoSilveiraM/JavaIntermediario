package com.java.intermediario.threads.classes;

public class ThreadSemaforo implements Runnable{
    private CorSemaforo cor;
    private boolean runParado;
    private boolean corMudou;

    public ThreadSemaforo() {
        this.cor = CorSemaforo.VERMELHO;
        this.corMudou = false;
        this.runParado = false;
        new Thread(this).start();
    }

    public CorSemaforo getCor() {
        return cor;
    }

    @Override
    public void run() {
        while(!runParado){
            try{
                switch (this.cor){
                    case VERMELHO:
                        Thread.sleep(800);
                    case AMARELO:
                        Thread.sleep(600);
                    case VERDE:
                        Thread.sleep(100);
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            mudaCor();
        }
    }

    private synchronized void mudaCor(){
        switch (this.cor){
            case VERMELHO:
                this.cor = CorSemaforo.AMARELO;
                break;
            case AMARELO:
                this.cor = CorSemaforo.VERDE;
                break;
            case VERDE:
                this.cor = CorSemaforo.VERMELHO;
                break;
            default:
                break;
        }
        this.corMudou = true;
        notify();
    }

    public synchronized void esperaMudar() {
        try{
            while(!this.corMudou){
                wait();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.corMudou = false;
    }

    public synchronized void desligaSemaforo() {
        this.runParado = true;
    }
}
