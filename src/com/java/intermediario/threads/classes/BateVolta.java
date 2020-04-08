package com.java.intermediario.threads.classes;
//Implementa métodos para ser usados na Thread e na Main.
public class BateVolta {
    public boolean bate;

    synchronized void bate(boolean executando){
        //Ao se encerrar notifica thread(com método "volta") em estado de espera e encerra bate.
        if(!executando) {
            bate = true;
            notify();
            return; // encerra bate
        }

        System.out.print("Bate ");

        bate = true; // faz thread entrar em modo de espera

        notify(); // notifica thread(com método "volta")
        //estado de espera
        try{
            //Espera thread(com método "volta") notificar
            while(bate){
                wait();
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized void volta(boolean executando) {
        //Ao se encerrar notifica a thread(com método "bate") em espera e encerra volta
        if(executando){
            bate = false;
            notify();
            return;
        }

        System.out.println("Volta");

        bate = false;//põe thread em estado de espera

        notify(); // notifica thread(com método "bate) em espera

        try{
            //estado de espera
            while(!bate){
                wait();
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
