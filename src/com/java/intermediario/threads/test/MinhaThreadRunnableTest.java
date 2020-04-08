package com.java.intermediario.threads.test;

import com.java.intermediario.threads.classes.MinhaThreadRunnable;
/*
Relação entre processo e thread na linguagem java:
1. Função main executada, programa criado, funciona como um processo.
2. Dentro do processo existem outras tarefas.
3. Essas tarefas executam simultaneâmente(concorrendo entre si).
4. Configurando na definição de Thread : Menores unidade de código que pode ser executada
 */
public class MinhaThreadRunnableTest {
    public static void main(String[] args) {
        MinhaThreadRunnable m1 = new MinhaThreadRunnable("Thread #1", 1000);
        MinhaThreadRunnable m2 = new MinhaThreadRunnable("Thread #2", 600);
        MinhaThreadRunnable m3 = new MinhaThreadRunnable("Thread #3",  900);

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);

        t1.start();
        t2.start();
        t3.start();

        //Inclui todas as threads em join, assim se espera essas threads terminarem sua execução para executar
        //qualquer outro comando após as threads
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Programa finalizado");
    }
}
