package com.java.intermediario.threads.classes;

public class Calculadora {
    private int soma;

    public synchronized double somaArray(double ... vetor){
        soma = 0;
        try{
            for(double valores : vetor){
                soma += valores;
                System.out.println("Executando a soma "+Thread.currentThread().getName() +
                        " somando o valor "+ valores + " com total de "+soma);
                Thread.sleep(100);
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        return soma;
    }

}
