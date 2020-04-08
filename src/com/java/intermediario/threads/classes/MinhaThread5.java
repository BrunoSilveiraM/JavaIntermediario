package com.java.intermediario.threads.classes;

public class MinhaThread5 implements Runnable {
    private String nome;
    private boolean estaSuspensa;
    private boolean foiTerminada;

    public MinhaThread5(String nome){
        this.nome = nome;
        this.estaSuspensa = false;
        this.foiTerminada = false;
        new Thread(this,nome).start();
    }

    @Override
    public void run() {
        System.out.println("Executando "+this.nome);
        try{
            for(int i = 0; i < 10; i++){
                System.out.println(this.nome+" contador "+i);
                Thread.sleep(500);
                // Ao passar this, todos os atributos da classe estarão sincronizados
                synchronized (this){
                    while(estaSuspensa){
                        wait();
                    }
                    if(this.foiTerminada){
                        break;
                    }
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(this.nome+" finalizada");
    }

    public void suspend(){
        this.estaSuspensa = true;
    }

    public synchronized void resume() {
        this.estaSuspensa = false;
        notify();
    }

    public synchronized void stop(){
        this.foiTerminada = true;
        //Se a thread tiver sido suspensa ela é notificada e encerra a thread
        notify();
    }
}
