package com.java.intermediario.threads.classes;
//Apenas ao estender a classe Thread tecnicamente já existe uma Thread
public class MinhaThread extends Thread{
    private String nome; // nome da Thread
    private int tempo; // tempo de execução de cada thread
    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }
    /*
    Para a thread ser realmente executada é preciso sobrescrever o método run
    E para a thread começar é preciso chamar o método start no construtor
     */
    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador  " + i);
                /* Põe a Thread para dormir por determinado tempo */
                Thread.sleep(this.tempo);
            }
            /*
            Essa exceção significa que a thread pode ter sido interrompida
             */
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        //A partir desse ponto a Thread entra em estado Dead
        System.out.println(nome+" encerrada");
    }
}
